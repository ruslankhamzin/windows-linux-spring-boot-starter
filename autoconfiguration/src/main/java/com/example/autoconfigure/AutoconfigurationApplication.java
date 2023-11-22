package com.example.autoconfigure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.example")
@EnableScheduling
public class AutoconfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoconfigurationApplication.class, args);
    }

}
