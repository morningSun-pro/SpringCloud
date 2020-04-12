package com.yuxin.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan(basePackages = "com.yuxin.springcloud.mapper")
public class Provider8001 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8001.class,args);
    }
}
