package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient; // needed for Eureka
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    // OPTIONAL: static routes if you don't want discovery locator
    // Comment out if you're using the discovery locator config in properties.
    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("account-service", r -> r.path("/account/**")
                    .uri("lb://account-service"))
            .route("loan-service", r -> r.path("/loan/**")
                    .uri("lb://loan-service"))
            .build();
    }
}
