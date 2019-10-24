package com.sx.createxml.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
//    @Bean(name = "fifthDataSource")
//    @Qualifier(value = "fifthDataSource")  //spring装配bean的唯一标识
//    @ConfigurationProperties(prefix = "spring.datasource.fifth")   //application.properties配置文件中该数据源的配置前缀
//    public DataSource fifthDataSource(){
//        return DataSourceBuilder.create().build();
//    }

    @Bean(name = "forthDataSource")
    @Qualifier(value = "forthDataSource")  //spring装配bean的唯一标识
    @ConfigurationProperties(prefix = "spring.datasource.forth")   //application.properties配置文件中该数据源的配置前缀
    public DataSource forthDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "thirdDataSource")
    @Qualifier(value = "thirdDataSource")  //spring装配bean的唯一标识
    @ConfigurationProperties(prefix = "spring.datasource.third")   //application.properties配置文件中该数据源的配置前缀
    public DataSource thirdDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondaryDataSource")
    @Qualifier(value = "secondaryDataSource")  //spring装配bean的唯一标识
    @ConfigurationProperties(prefix = "spring.datasource.secondary")   //application.properties配置文件中该数据源的配置前缀
    public DataSource secondaryDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Primary    //配置该数据源为主数据源
    @Bean(name = "primaryDataSource")
    @Qualifier(value = "primaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSource primaryDataSource(){
        return DataSourceBuilder.create().build();
    }
}
