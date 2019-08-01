package com.github.DominasPL.AdventureTime.web.controllers;

import com.github.DominasPL.AdventureTime.dtos.RegisterDTO;
import com.github.DominasPL.AdventureTime.dtos.UserEmail;
import com.github.DominasPL.AdventureTime.dtos.UserUsername;
import com.github.DominasPL.AdventureTime.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    private UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String prepareRegistrationForm(Model model) {

        model.addAttribute("form", new RegisterDTO());

        return "registration-form";
    }

    @PostMapping
    public String saveUser(@Valid @ModelAttribute("form") RegisterDTO form, BindingResult result) {

        if (result.hasErrors()) {
            return "registration-form";
        }

        if (!checkUsernameInDatabase(form.getUsername())) {
            result.rejectValue("username", null, "Username is already in database!");
            return "registration-form";
        }

        if (!checkEmailInDatabase(form.getEmail())) {
            result.rejectValue("email", null, "Email is already in database!");
            return "registration-form";
        }

        userService.saveUser(form);

        return "redirect:/";
    }

    private boolean checkEmailInDatabase(String email) {

        UserEmail userByEmail = userService.findUserByEmail(email);

        if (userByEmail == null) {
            return true;
        }

        return false;

    }

    private boolean checkUsernameInDatabase(String username) {

        UserUsername userByUsername = userService.findUserByUsername(username);

        if (userByUsername == null) {
            return true;
        }

        return false;
    }


}
