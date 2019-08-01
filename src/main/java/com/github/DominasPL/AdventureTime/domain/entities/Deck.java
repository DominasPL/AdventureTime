package com.github.DominasPL.AdventureTime.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "decks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Deck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer numberOfCards;

    @Column(nullable = false)
    private Integer magicAmount;

    @OneToMany
    @JoinColumn(name = "deck_id")
    private List<Card> cards = new ArrayList<>();

    @OneToOne
    @JoinColumn(referencedColumnName = "id", name = "id")
    private Hero hero;

}
