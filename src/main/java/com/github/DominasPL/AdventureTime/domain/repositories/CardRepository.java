package com.github.DominasPL.AdventureTime.domain.repositories;

import com.github.DominasPL.AdventureTime.domain.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {

}
