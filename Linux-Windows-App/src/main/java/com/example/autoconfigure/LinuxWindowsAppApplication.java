package com.example.autoconfigure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LinuxWindowsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinuxWindowsAppApplication.class, args);
    }

}
