package com.autoconfiguration.service;

import org.springframework.scheduling.annotation.Scheduled;

public class CustomStarterLinuxService {

    @Scheduled(fixedDelay = 60000L)
    public void scheduleJob() {
        System.out.println("Я работаю");
    }
}
