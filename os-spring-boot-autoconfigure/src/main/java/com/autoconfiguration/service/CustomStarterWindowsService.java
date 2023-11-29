package com.autoconfiguration.service;

import org.springframework.scheduling.annotation.Scheduled;

public class CustomStarterWindowsService {

    @Scheduled(fixedDelay = 30000L)
    public void scheduleJob() {
        System.out.println("Я работаю");
    }
}
