package com.beerapp.beers.service;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String username, String password);
}
