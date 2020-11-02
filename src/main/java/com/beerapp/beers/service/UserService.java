package com.beerapp.beers.service;

import com.beerapp.beers.entity.Users;
import org.springframework.stereotype.Component;


@Component
public interface UserService {
    void save(Users user);
    Users findByUsername(String username);

}
