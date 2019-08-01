package com.github.DominasPL.AdventureTime.domain.repositories;

import com.github.DominasPL.AdventureTime.domain.entities.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Long> {


}
