package com.github.DominasPL.AdventureTime.dtos;

import com.github.DominasPL.AdventureTime.domain.entities.Card;
import com.github.DominasPL.AdventureTime.domain.entities.Hero;
import com.github.DominasPL.AdventureTime.domain.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BattleDeckDTO {

    private Integer numberOfCards;
    private Integer magicAmount;
    private User user;
    private List<Card> cards = new ArrayList<>();
    private Hero hero;

}
