package com.example.springbeansdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringbeansdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbeansdemoApplication.class, args);
    }

}
