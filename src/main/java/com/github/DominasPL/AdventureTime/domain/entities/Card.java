package com.github.DominasPL.AdventureTime.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cards")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String cardName;

    @Column(nullable = false)
    private Integer attack;

    @Column(nullable = false)
    private Integer defence;

    @Column(nullable = false)
    private Integer HP;

    @Column(nullable = false)
    private Integer magicCost;


}
