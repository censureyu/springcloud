package com.censure.eurekaserve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaserveApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaserveApplication.class, args);
    }
}
