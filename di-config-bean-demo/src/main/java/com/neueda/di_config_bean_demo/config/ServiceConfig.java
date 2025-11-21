package com.neueda.di_config_bean_demo.config;

import com.neueda.di_config_bean_demo.service.EveningGreetingService;
import com.neueda.di_config_bean_demo.service.GreetingService;
import com.neueda.di_config_bean_demo.service.MorningGreetingService;
import com.neueda.di_config_bean_demo.service.NightGreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Value("${greeting.type:morning}")
    String greetingType;

    @Bean
    public GreetingService currentGreetingService() {
        switch (greetingType.toLowerCase()) {
            case "morning":
                return new MorningGreetingService();
            // You can add more cases for different greeting services
            case "evening":
                return new EveningGreetingService();
            default:
                return new NightGreetingService();
        }
    }
}
