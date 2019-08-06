package com.github.DominasPL.AdventureTime.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {

    private Long id;
    private String cardName;
    private Integer attack;
    private Integer defence;
    private Integer HP;
    private Integer magicCost;
    private String cardPath;
}
