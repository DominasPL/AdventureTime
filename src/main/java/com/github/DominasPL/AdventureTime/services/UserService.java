package com.github.DominasPL.AdventureTime.services;

import com.github.DominasPL.AdventureTime.converters.Converter;
import com.github.DominasPL.AdventureTime.domain.entities.User;
import com.github.DominasPL.AdventureTime.domain.entities.UserDetails;
import com.github.DominasPL.AdventureTime.domain.repositories.UserRepository;
import com.github.DominasPL.AdventureTime.dtos.RegisterDTO;
import com.github.DominasPL.AdventureTime.dtos.UserDetailsDTO;
import com.github.DominasPL.AdventureTime.dtos.UserEmail;
import com.github.DominasPL.AdventureTime.dtos.UserUsername;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    private RoleService roleService;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder, RoleService roleService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.roleService = roleService;
    }

    @Transactional
    public void saveUser(RegisterDTO form) {

        List<User> allUsers = userRepository.findAll();
        User user = new User();

        if (allUsers.size() == 0) {
            user = setUserFields(user, form, passwordEncoder);
            user.setRole(roleService.getAdminRole());

        } else {
            user = setUserFields(user, form, passwordEncoder);
            user.setRole(roleService.getUserRole());
        }

        userRepository.save(user);

        setUserDetails(user);
        userRepository.save(user);

    }

    @Transactional
    public void saveUserDetails(UserDetailsDTO userDetailsDTO, String username) {

        Optional<User> optionalUser = userRepository.findByUsername(username);
        User user = optionalUser.orElse(null);

        if (user == null) {
            throw new IllegalStateException("User not found");
        }

        UserDetails userDetails = user.getUserDetails();
        userDetails.setName(userDetailsDTO.getName());
        userDetails.setSurname(userDetailsDTO.getSurname());
        userRepository.save(user);

    }

    public UserUsername findUserByUsername(String username) {

        if (username == null) {
            throw new IllegalArgumentException("Username has to be given!");
        }

        Optional<User> optionalUser = userRepository.findByUsername(username);
        User user = optionalUser.orElse(null);

        if (user == null) {
            logger.info("User not found!");
            return null;
        }

        return Converter.convertToUserDTO(user);
    }


    public UserEmail findUserByEmail(String email) {

        if (email == null) {
            throw new IllegalArgumentException("Email has to be given!");
        }

        Optional<User> optionalUser = userRepository.findByEmail(email);
        User user = optionalUser.orElse(null);

        if (user == null) {
            logger.info("User not found!");
            return null;
        }

        return Converter.convertToUserEmail(user);
    }

    public User setUserFields(User user, RegisterDTO form, PasswordEncoder passwordEncoder) {
        user.setUsername(form.getUsername());
        user.setEmail(form.getEmail());
        user.setPassword(passwordEncoder.encode(form.getPassword()));

        return user;
    }

    private User setUserDetails(User user) {
        UserDetails userDetails = new UserDetails();
        userDetails.setId(user.getId());
        user.setUserDetails(userDetails);

        return user;
    }


    public UserDetailsDTO findUserDetails(String username) {

        if (username == null) {
            throw new IllegalArgumentException("Username has to be given!");
        }

        Optional<User> optionalUser = userRepository.findByUsername(username);
        User user = optionalUser.orElse(null);

        if (user == null) {
            logger.info("User not found!");
            return null;
        }

        return Converter.convertToUserDetailsDTO(user);
    }


}
