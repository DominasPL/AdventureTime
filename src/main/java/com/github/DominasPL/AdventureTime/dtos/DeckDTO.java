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

    private String heroPath;
    private List<String> cardsPath = new ArrayList<>();

}
