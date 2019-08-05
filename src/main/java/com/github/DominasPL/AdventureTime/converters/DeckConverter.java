package com.github.DominasPL.AdventureTime.converters;

import com.github.DominasPL.AdventureTime.domain.entities.Card;
import com.github.DominasPL.AdventureTime.domain.entities.Deck;
import com.github.DominasPL.AdventureTime.dtos.CardDTO;
import com.github.DominasPL.AdventureTime.dtos.DeckDTO;

import java.util.ArrayList;
import java.util.List;

public class DeckConverter {

    public static List<DeckDTO> convertToDeckDTOList(List<Deck> userDecks) {

        List<DeckDTO> deckDTOS = new ArrayList<>();

        for (Deck deck : userDecks) {
            DeckDTO deckDTO = new DeckDTO();
            deckDTO.setHeroPath(deck.getHero().getHeroPath());

            List<String> cardsPath = new ArrayList<>();
            List<Card> cards = deck.getCards();
            for (Card card : cards) {
                cardsPath.add(card.getCardPath());
            }

            deckDTO.setCardsPath(cardsPath);
            deckDTOS.add(deckDTO);

        }

        return deckDTOS;

    }
}
