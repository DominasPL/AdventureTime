package com.github.DominasPL.AdventureTime.domain.repositories;

import com.github.DominasPL.AdventureTime.domain.entities.Fraction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FractionRepository extends JpaRepository<Fraction, Long> {

    Optional<Fraction> findById(Integer id);
}
