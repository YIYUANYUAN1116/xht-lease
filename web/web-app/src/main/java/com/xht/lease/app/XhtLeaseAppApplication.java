package com.xht.lease.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = "com.xht")
@MapperScan(basePackages = "com.xht.lease.app.mapper")
@EnableScheduling
@EnableAsync
public class XhtLeaseAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(XhtLeaseAppApplication.class, args);
    }

}
