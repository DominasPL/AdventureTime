package com.github.DominasPL.AdventureTime.converters;

import com.github.DominasPL.AdventureTime.domain.entities.User;
import com.github.DominasPL.AdventureTime.dtos.UserEmail;
import com.github.DominasPL.AdventureTime.dtos.UserUsername;

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
}
