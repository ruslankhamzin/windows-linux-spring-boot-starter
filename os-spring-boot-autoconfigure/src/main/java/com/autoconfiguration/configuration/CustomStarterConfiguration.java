package com.autoconfiguration.configuration;

import com.autoconfiguration.conditional.ConditionalOS;
import com.autoconfiguration.service.CustomStarterLinuxService;
import com.autoconfiguration.service.CustomStarterWindowsService;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;


@AutoConfiguration
@EnableScheduling
public class CustomStarterConfiguration {

    public CustomStarterConfiguration() {
        System.out.println("CustomStarterConfiguration initialized");
    }

    @Bean
    @ConditionalOS("windows")
    public CustomStarterWindowsService customStarterWindowsTest() {
        System.out.println("Windows bean was created");
        return new CustomStarterWindowsService();
    }

    @Bean
    @ConditionalOS("linux")
    public CustomStarterLinuxService customStarterLinuxTest() {
        System.out.println("Linux bean was created");
        return new CustomStarterLinuxService();
    }
}
