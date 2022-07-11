package com.wesleyreisz.sample11.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class FarmUpBeanConfig {
    @Bean
    public String projectName(){
        return "FarmUp Harvester";
    }

    @Lazy
    @Bean
    public String tabUp(){
        return "FarmUp";
    }
}
