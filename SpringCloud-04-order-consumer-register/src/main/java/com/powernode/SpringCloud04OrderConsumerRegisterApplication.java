package com.powernode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangj
 */
@SpringBootApplication
@MapperScan("com.powernode.dao")
public class SpringCloud04OrderConsumerRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud04OrderConsumerRegisterApplication.class, args);
    }

}
