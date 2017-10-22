package com.zhang.boot.dubbo.web.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zhanghaichao on 2017/10/17.
 */
@SpringBootApplication
@ImportResource({ "classpath:config/bean.xml" })
public class MainConfig {
    public static void main(String[] args) {
        SpringApplication.run(MainConfig.class, args);
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}