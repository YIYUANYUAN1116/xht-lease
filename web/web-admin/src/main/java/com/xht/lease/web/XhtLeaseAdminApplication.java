package com.xht.lease.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = "com.xht")
@MapperScan(basePackages = "com.xht.lease.web.mapper")
@EnableScheduling
public class XhtLeaseAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(XhtLeaseAdminApplication.class, args);
    }

}
