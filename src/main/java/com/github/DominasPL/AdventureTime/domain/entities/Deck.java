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

    @Column(nullable = false, unique = true)
    private String deckName;

    @Column(nullable = false)
    private Integer numberOfCards;

    @Column(nullable = false)
    private Integer magicAmount;

    @ManyToOne
    private User user;

    @ManyToMany
    @JoinTable(name = "decks_cards",
            joinColumns = @JoinColumn(name = "deck_id"),
            inverseJoinColumns = @JoinColumn(name = "card_id"))
    private List<Card> cards = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "hero_id")
    private Hero hero;

    @PrePersist
    public void prePersist() {
        this.numberOfCards = 5;
        this.magicAmount = 200;
    }

}
