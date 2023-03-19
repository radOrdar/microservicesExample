package com.rg.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerAppliction {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerAppliction.class, args);
    }
}