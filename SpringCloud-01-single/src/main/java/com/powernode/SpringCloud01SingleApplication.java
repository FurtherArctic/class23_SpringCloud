package com.powernode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangjunchen
 */
@SpringBootApplication
@MapperScan("com.powernode.dao")
public class SpringCloud01SingleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud01SingleApplication.class, args);
    }

}
