package com.neueda.di_config_bean_demo.service;

import org.springframework.stereotype.Component;


public class EveningGreetingService implements GreetingService{

    @Override
    public String greet(){
        return "Good Evening! Hope you had a great day!";
    }
}
