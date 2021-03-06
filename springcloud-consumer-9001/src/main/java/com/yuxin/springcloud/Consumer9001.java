package com.yuxin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.yuxin.springcloud"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class},scanBasePackages = {"com.yuxin.springcloud"})
public class Consumer9001 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer9001.class,args);
    }
}
