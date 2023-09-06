package com.paymentApp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentAppApplication.class, args);
        log.info("Payment App Running on http://localhost:8081");
    }

}
