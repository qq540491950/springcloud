package com.lirt.server8101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class Server8101Application {

    public static void main(String[] args) {
        SpringApplication.run(Server8101Application.class, args);
    }

    /**
     *
     * @return
     * RestTemplate默认开启负载均衡加入注解@LoadBalanced
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
