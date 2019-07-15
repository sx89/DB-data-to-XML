package com.sx.createxml.core;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
        entityManagerFactoryRef = "primaryEntityManagerFactory",
        transactionManagerRef = "primaryTransactionManager",
        basePackages = {
                "com.sx.createxml.dao.repository"
        }
)
public class PrimaryConfig {
    /**
     * 注入 mysql数据源
     */
    @Resource(name = "primaryDataSource")
    private DataSource primaryDataSource;

    /**
     * 注入JPA配置实体
     */
    @Autowired
    private JpaProperties jpaProperties;

    /**
     *  这里其实不需要配置数据库的方言.
     *  像hibernate.hbm2ddl.auto 可以在这里配置.但是我的是在application.properties中配置的.
     */
    private Map<String, Object> getVendorProperties() {
        Map<String, Object> ret = jpaProperties.getHibernateProperties(new HibernateSettings());
        ret.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        ret.put("hibernate.hbm2ddl.auto","update");
        ret.put("spring.jpa.hibernate.naming-strategy","org.hibernate.cfg.ImprovedNamingStrategy");

//        ret.put("spring.jpa.hibernate.naming.physical-strategy",
//                "org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl");
//
//        ret.put("hibernate.naming-strategy","org.hibernate.cfg.DefaultNamingStrategy");
        //参考博客https://www.cnblogs.com/sxdcgaq8080/p/7910474.html  版本不同,策略名称也不同
//        ret.put("hibernate.naming.physical-strategy",
//                "org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl");
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
    @Primary
    @Bean(name = "primaryEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    primaryEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(primaryDataSource)
                .properties(getVendorProperties())
                .packages("com.sx.createxml.pojo.mysql")
                .persistenceUnit("db1")
                .build();
    }

    /**
     * 配置EntityManager实体
     *
     * @param builder
     * @return 实体管理器
     */
    @Primary
    @Bean(name = "primaryEntityManager")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return primaryEntityManagerFactory(builder).getObject().createEntityManager();
    }

    /**
     * 配置事务transactionManager
     *
     * @param builder
     * @return 事务管理器
     */
    @Primary
    @Bean(name = "primaryTransactionManager")
    public PlatformTransactionManager primaryTransactionManager(
            EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(primaryEntityManagerFactory(builder).getObject());
    }
}