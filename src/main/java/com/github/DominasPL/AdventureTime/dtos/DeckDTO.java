package com.github.DominasPL.AdventureTime.dtos;

import com.github.DominasPL.AdventureTime.domain.entities.Card;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeckDTO {

    private Integer numberOfCards;
    private Integer magicAmount;
    private List<CardDTO> cards = new ArrayList<>();
    private String heroName;
    private Integer heroAvailableTurn;


}
