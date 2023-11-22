package com.example.autoconfigure;

import org.springframework.scheduling.annotation.Scheduled;

public class CustomStarterWindows {

    @Scheduled(fixedDelay = 30000L)
    public void scheduleJob() {
        System.out.println("Я работаю");
    }
}
