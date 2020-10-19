package com.beerapp.beers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BeerStoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeerStoutApplication.class, args);
    }

}
