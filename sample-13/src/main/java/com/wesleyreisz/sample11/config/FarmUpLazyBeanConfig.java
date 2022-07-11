package com.wesleyreisz.sample11.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.time.LocalDate;

@Lazy
@Configuration
public class FarmUpLazyBeanConfig {
    @Bean
    public LocalDate localDate() {
        return LocalDate.now();
    }
    @Bean String webmaster(){
        return "wes@wesleyreisz.com";
    }
}
