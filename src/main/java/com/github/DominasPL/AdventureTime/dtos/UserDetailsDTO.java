package com.github.DominasPL.AdventureTime.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsDTO {

    @Size(min = 5, max = 20)
    private String name;

    @Size(min = 5, max = 20)
    private String surname;

}
