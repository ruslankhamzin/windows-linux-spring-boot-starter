package com.example.autoconfigure;

import org.springframework.scheduling.annotation.Scheduled;

@ConditionalOS("linux")
public class CustomStarterLinux {

    @Scheduled(fixedDelay = 60000L)
    public void scheduleJob() {
        System.out.println("Я работаю");
    }
}
