package com.wesleyreisz.sample11.config;

import com.wesleyreisz.sample11.model.Harvest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.ArrayList;
import java.util.List;

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

    @Bean
    public List<Harvest> dbHarvest(){
        return  new ArrayList<>();
    }
}
