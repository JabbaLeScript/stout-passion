package com.beerapp.beers.service;

import com.beerapp.beers.entity.Beers;
import com.beerapp.beers.links.BeerLinks;
import com.beerapp.beers.repository.BeersRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BeersService {

    private BeersRepository beersRepository;

    public BeersService(BeersRepository beersRepository) {
        this.beersRepository = beersRepository;
    }

    public List<Beers> getBeers(){
        return this.beersRepository.findAll();
    }

    public Beers saveBeer(Beers beer){
        return this.beersRepository.save(beer);
    }

    public void deleteBeer(Beers beer){
        this.beersRepository.delete(beer);
    }
}
