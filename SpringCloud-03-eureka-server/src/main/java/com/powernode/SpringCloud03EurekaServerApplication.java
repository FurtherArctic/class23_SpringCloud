package com.powernode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wangj
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloud03EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud03EurekaServerApplication.class, args);
    }

}
