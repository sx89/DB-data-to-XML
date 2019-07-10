package com.sx.createxml.core;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "secondaryEntityManagerFactory",
        transactionManagerRef = "secondaryTransactionManager",
        basePackages = {
                "com.sx.createxml.dao.repository2"
        }
)
public class SecondaryConfig {

    /**
     * 注入 sqlite数据源
     */
    @Resource(name = "secondaryDataSource")
    private DataSource secondaryDataSource;

    /**
     * 注入JPA配置实体
     */
    @Autowired
    private JpaProperties jpaProperties;

    /**
     * 通过调用JPA配置实体中的解析方法，解析datasource中各属性的值
     * @return     本数据源中各参数
     * Map中设值分别为：
     *      hibernate-dialect   方言
     *      hibernate.hbm2ddl.auto  DDL执行策略
     *      hibernate.physical_naming_strategy  命名策略
     *
     *这些和不同类型数据库密切相关的属性设置，不能设置在application.properties中，所以需要再不同的数据源中具体设置，赋值给JpaProperties
     */
    private Map<String,Object> getVendorProperties(){
        Map<String, Object> ret = jpaProperties.getHibernateProperties(new HibernateSettings());
        ret.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
        ret.put("hibernate.hbm2ddl.auto","validate");
        ret.put("spring.jpa.hibernate.naming-strategy","org.hibernate.cfg.ImprovedNamingStrategy");
        ret.put("spring.jpa.database","oracle");
        return ret;
    }

/**
 * 配置EntityManagerFactory实体
 *
 * @param builder
 * @return 实体管理工厂
 * packages     扫描@Entity注释的软件包名称
 * persistenceUnit  持久性单元的名称。 如果只建立一个EntityManagerFactory，你可以省略这个，但是如果在同一个应用程序中有多个，你应该给它们不同的名字
 * properties       标准JPA或供应商特定配置的通用属性。 这些属性覆盖构造函数中提供的任何值。
 */
    @Bean(name = "secondaryEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    secondaryEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return
                builder
                        .dataSource(secondaryDataSource)
                        .packages("com.sx.createxml.pojo.oracle")
                        .properties(getVendorProperties())
                        .persistenceUnit("db2")
                        .build();
    }

    /**
     * 配置EntityManager实体
     *
     * @param builder
     * @return 实体管理器
     */
    @Bean(name = "secondaryEntityManager")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return secondaryEntityManagerFactory(builder).getObject().createEntityManager();
    }
    /**
     * 配置事务transactionManager
     *
     * @param builder
     * @return 事务管理器
     */
    @Bean(name = "secondaryTransactionManager")
    public PlatformTransactionManager transactionManagerSecondary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(secondaryEntityManagerFactory(builder).getObject());
    }
}