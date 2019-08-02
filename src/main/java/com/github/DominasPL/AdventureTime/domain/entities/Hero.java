package com.github.DominasPL.AdventureTime.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "heroes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hero {

    @Id
    private Long id;

    @Column(nullable = false, unique = true)
    private String heroName;

    @Column(nullable = false)
    private Integer availableTurn;


}
