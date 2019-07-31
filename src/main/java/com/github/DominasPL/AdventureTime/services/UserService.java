package com.github.DominasPL.AdventureTime.services;

import com.github.DominasPL.AdventureTime.converters.Converter;
import com.github.DominasPL.AdventureTime.domain.entities.User;
import com.github.DominasPL.AdventureTime.domain.repositories.UserRepository;
import com.github.DominasPL.AdventureTime.dtos.RegisterDTO;
import com.github.DominasPL.AdventureTime.dtos.UserDTOWithUsername;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public UserDTOWithUsername findUserByUsername(String username) {

        if (username == null) {
            throw new IllegalArgumentException("Username has to be given!");
        }

        Optional<User> optionalUser = userRepository.findByUsername(username);
        User user = optionalUser.orElse(null);

        if (user == null) {
            logger.info("User not found!");
        }

        UserDTOWithUsername dto = Converter.convertToUserDTO(user);

        return dto;
    }


}
