package com.github.DominasPL.AdventureTime.converters;

import com.github.DominasPL.AdventureTime.domain.entities.Hero;
import com.github.DominasPL.AdventureTime.domain.entities.User;
import com.github.DominasPL.AdventureTime.domain.entities.UserDetails;
import com.github.DominasPL.AdventureTime.dtos.HeroDTO;
import com.github.DominasPL.AdventureTime.dtos.UserDetailsDTO;
import com.github.DominasPL.AdventureTime.dtos.UserEmail;
import com.github.DominasPL.AdventureTime.dtos.UserUsername;

import java.util.List;

public class Converter {


    public static UserUsername convertToUserDTO(User user) {

        UserUsername dto = new UserUsername();
        dto.setUsername(user.getUsername());

        return dto;
    }

    public static UserEmail convertToUserEmail(User user) {

        UserEmail dto = new UserEmail();
        dto.setEmail(user.getEmail());

        return dto;
    }

    public static UserDetailsDTO convertToUserDetailsDTO(User user) {
        UserDetailsDTO userDetailsDTO = new UserDetailsDTO();
        UserDetails userDetails = user.getUserDetails();

        userDetailsDTO.setName(userDetails.getName());
        userDetailsDTO.setSurname(userDetails.getSurname());
        return userDetailsDTO;
    }

}
