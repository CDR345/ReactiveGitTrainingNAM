package com.neueda.di_config_bean_demo.Component;

import com.neueda.di_config_bean_demo.service.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class GreeterComponent {

    private final GreetingService greetingService;

        public GreeterComponent(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
            return greetingService.greet();
    }
}
