package com.beerapp.beers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BeerStoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeerStoutApplication.class, args);
    }

    @Bean
    BCryptPasswordEncoder customBCryptPasswordEncoded(){
        return new BCryptPasswordEncoder();
    }

}
