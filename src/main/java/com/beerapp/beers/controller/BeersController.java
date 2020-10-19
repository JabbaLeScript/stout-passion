package com.beerapp.beers.controller;

import com.beerapp.beers.entity.Beers;
import com.beerapp.beers.links.BeerLinks;
import com.beerapp.beers.service.BeersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/api/")
public class BeersController {

    @Autowired
    BeersService beersService;

    @GetMapping(path = BeerLinks.LIST_BEERS)
    public ResponseEntity<?> listBeers(){
        List<Beers> ressource = beersService.getBeers();
        return ResponseEntity.ok(ressource);
    }

    @PostMapping(path = BeerLinks.BEER)
    public ResponseEntity<?> saveBeer(@RequestBody Beers beers){
        Beers ressource = beersService.saveBeer(beers);
        return ResponseEntity.ok(ressource);
    }

    /*
    * add a service to delete here
    * */

}
