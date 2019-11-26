package com.lol;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lol.mapper")
@SpringBootApplication
public class BmApp {
    public static void main(String[] args) {
        SpringApplication.run(BmApp.class,args);
    }

}
