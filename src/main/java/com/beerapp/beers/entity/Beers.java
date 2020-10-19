package com.beerapp.beers.entity;

import lombok.Data;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Beers {

    @Id
    @Column
    private long id;

    @Column
    @NotNull(message = "{NotNull.Beer.name}")
    private String name;

    @Column
    @NotNull(message = "{NotNull.Beer.brewerie}")
    private String brewerie;

    @Column
    @NotNull(message = "{NotNull.Beer.style}")
    private String style;

    @Column
    @NotNull(message = "{NotNull.Beer.abv}")
    private Double abv;

    @Column
    private String description;

}
