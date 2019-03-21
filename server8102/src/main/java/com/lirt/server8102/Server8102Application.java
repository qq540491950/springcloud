package com.lirt.server8102;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Server8102Application {

    public static void main(String[] args) {
        SpringApplication.run(Server8102Application.class, args);
    }

}
