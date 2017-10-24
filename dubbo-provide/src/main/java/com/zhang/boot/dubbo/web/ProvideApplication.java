package com.zhang.boot.dubbo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration
////引入spring配置文件
@ImportResource({"classpath:config/bean.xml"})
public class ProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication.class, args);
    }
}
