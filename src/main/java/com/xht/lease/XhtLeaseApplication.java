package com.xht.lease;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.xht.lease.web.admin.mapper")
@ComponentScan(basePackages = "com.xht")
public class XhtLeaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(XhtLeaseApplication.class, args);
    }

}
