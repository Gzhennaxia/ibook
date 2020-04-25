package com.example.ibook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ibook.mapper")
public class IbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(IbookApplication.class, args);
    }

}
