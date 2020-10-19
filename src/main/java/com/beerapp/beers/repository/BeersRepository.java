package com.beerapp.beers.repository;

import com.beerapp.beers.entity.Beers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface BeersRepository extends JpaRepository<Beers, Integer>, JpaSpecificationExecutor<Beers>, QuerydslPredicateExecutor<Beers> {
}
