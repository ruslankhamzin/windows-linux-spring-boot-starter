package com.autoconfiguration.service;

import com.autoconfiguration.conditional.ConditionalOS;
import org.springframework.scheduling.annotation.Scheduled;

@ConditionalOS("linux")
public class CustomStarterLinuxService {

    @Scheduled(fixedDelay = 60000L)
    public void scheduleJob() {
        System.out.println("Я работаю");
    }
}
