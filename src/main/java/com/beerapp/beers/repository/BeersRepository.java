package com.beerapp.beers.repository;

import com.beerapp.beers.entity.Beers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeersRepository extends JpaRepository<Beers, Integer> {
}
