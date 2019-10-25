package com.sx.createxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.ws.rs.ext.RuntimeDelegate;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class CreatexmlApplication {


    public static void main(String[] args) {
        // 解决javax.ws.rs.core.UriBuilder.uri(Ljava/lang/String;)Ljavax/ws/rs/core/UriBuilder;
        // https://stackoverflow.com/questions/43931240/jersey-spark-javax-ws-rs-core-uribuilder-uri
        RuntimeDelegate.setInstance(new org.glassfish.jersey.internal.RuntimeDelegateImpl());
        SpringApplication.run(CreatexmlApplication.class, args);
    }
}
