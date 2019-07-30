package com.re01.myclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyclientApplication {
    @Autowired

    public static void main(String[] args) {
        SpringApplication.run(MyclientApplication.class, args);
    }


}
