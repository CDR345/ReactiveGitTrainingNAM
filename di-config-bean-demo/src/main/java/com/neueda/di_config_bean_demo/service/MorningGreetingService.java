package com.neueda.di_config_bean_demo.service;

import org.springframework.stereotype.Component;


public class MorningGreetingService implements GreetingService
{
    @Override
    public String greet(){
        return "Have a nice Day!";
    }
}
