package com.github.DominasPL.AdventureTime.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hero {

    @Id
    private Long id;

    @Column(nullable = false, unique = true)
    private String heroName;

    @Column(nullable = false)
    private Integer magicCost;



}
