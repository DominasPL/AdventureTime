package com.github.DominasPL.AdventureTime.domain.repositories;

import com.github.DominasPL.AdventureTime.domain.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {

    @Query(value = "SELECT cards.id, hp, attack, card_name, defence, magic_cost, card_path FROM cards\n" +
            "JOIN fractions ON cards.fraction_id = fractions.id\n" +
            "WHERE fraction_id = ?;", nativeQuery = true)
    List<Card> findByFraction(Long id);
}
