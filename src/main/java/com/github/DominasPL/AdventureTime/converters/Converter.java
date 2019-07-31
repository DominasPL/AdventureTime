package com.github.DominasPL.AdventureTime.converters;

import com.github.DominasPL.AdventureTime.domain.entities.User;
import com.github.DominasPL.AdventureTime.dtos.UserDTOWithUsername;

public class Converter {


    public static UserDTOWithUsername convertToUserDTO(User user) {

        UserDTOWithUsername dto = new UserDTOWithUsername();
        dto.setUsername(user.getUsername());

        return dto;
    }
}
