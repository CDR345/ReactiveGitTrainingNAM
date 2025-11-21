package com.example.Instrument_Application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private static final Logger logger = LoggerFactory.getLogger(Person.class);
    private final Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void feedPet() {
        logger.info("Feeding the pet...");
        pet.feed();
    }
}
