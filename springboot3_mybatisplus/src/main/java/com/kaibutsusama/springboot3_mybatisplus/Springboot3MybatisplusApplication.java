package com.kaibutsusama.springboot3_mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kaibutsusama.springboot3_mybatisplus.dao")
public class Springboot3MybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3MybatisplusApplication.class, args);

    }

}
