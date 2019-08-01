package com.github.DominasPL.AdventureTime.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "fractions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fraction {

    @Id
    public Long id;

    @Column(nullable = false, unique = true)
    private String fractionName;


}
