package com.github.DominasPL.AdventureTime.web.controllers;

import com.github.DominasPL.AdventureTime.dtos.UserDetailsDTO;
import com.github.DominasPL.AdventureTime.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.security.Principal;

@Controller
@RequestMapping("/profile")
public class UserProfileController {

    private UserService userService;

    public UserProfileController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String displayEditDetailsForm(Model model, Principal principal) {

        UserDetailsDTO userDetails = userService.findUserDetails(principal.getName());
        model.addAttribute("userDetails", userDetails);

        return "userdetails-form";
    }

    @PostMapping
    public String saveUserDetails(@Valid @ModelAttribute("userDetails") UserDetailsDTO userDetails, Principal principal, BindingResult result) {

        if (result.hasErrors()) {
            return "userdetails-form";
        }

        userService.saveUserDetails(userDetails, principal.getName());

        return "redirect:/profile";

    }

}
