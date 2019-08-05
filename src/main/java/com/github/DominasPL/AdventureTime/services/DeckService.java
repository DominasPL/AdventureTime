package com.github.DominasPL.AdventureTime.services;

import com.github.DominasPL.AdventureTime.converters.DeckConverter;
import com.github.DominasPL.AdventureTime.domain.entities.Deck;
import com.github.DominasPL.AdventureTime.domain.entities.User;
import com.github.DominasPL.AdventureTime.domain.repositories.DeckRepository;
import com.github.DominasPL.AdventureTime.domain.repositories.UserRepository;
import com.github.DominasPL.AdventureTime.dtos.DeckDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeckService {

    private DeckRepository deckRepository;
    private UserRepository userRepository;

    public DeckService(DeckRepository deckRepository, UserRepository userRepository) {
        this.deckRepository = deckRepository;
        this.userRepository = userRepository;
    }

    public List<DeckDTO> findAllUserDecks(String username) {
        if (username == null) {
            throw new IllegalArgumentException("Username must be given!");
        }

        Optional<User> optionalUser = userRepository.findByUsername(username);
        User user = optionalUser.orElse(null);

        if (user == null) {
            throw new IllegalStateException("User not found!");
        }

        List<Deck> userDecks = user.getDecks();

        return DeckConverter.convertToDeckDTOList(userDecks);

    }
}
