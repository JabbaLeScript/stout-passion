package com.beerapp.beers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SpringBootSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Value(("${security.enable-csrf}"))
    private boolean csrfEnabled;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/**").hasAnyRole("USER")
                .and()
                .formLogin().loginPage("/login").permitAll();

        if (csrfEnabled) {
            http.csrf().disable();
        }
    }
}
