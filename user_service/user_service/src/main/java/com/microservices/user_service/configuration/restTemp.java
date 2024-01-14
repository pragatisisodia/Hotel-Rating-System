package com.microservices.user_service.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class restTemp {
    @Bean
    @LoadBalanced
    public RestTemplate rest(){
        return new RestTemplate();
    }
}
