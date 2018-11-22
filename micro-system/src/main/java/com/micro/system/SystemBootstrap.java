package com.micro.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.micro.system.mapper")
public class SystemBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SystemBootstrap.class, args);
    }

}
