package com.github.DominasPL.AdventureTime.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegisterDTO {

    @NotNull
    @Size(min = 5, max = 15)
    private String username;

    @Email
    private String email;

    @NotNull
    @Size(min = 5, max = 30)
    private String password;

    @NotNull
    @Size(min = 5, max = 30)
    private String confirmedPassword;

}
