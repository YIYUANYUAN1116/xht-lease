package com.xht.lease;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.xht")
@MapperScan(basePackages = "com.xht.lease.mapper")
public class XhtLeaseAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(XhtLeaseAdminApplication.class, args);
    }

}
