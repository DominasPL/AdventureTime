package com.github.DominasPL.AdventureTime.services;

import com.github.DominasPL.AdventureTime.converters.Converter;
import com.github.DominasPL.AdventureTime.domain.entities.User;
import com.github.DominasPL.AdventureTime.domain.repositories.UserRepository;
import com.github.DominasPL.AdventureTime.dtos.RegisterDTO;
import com.github.DominasPL.AdventureTime.dtos.UserDTOWithUsername;
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
        User user;

        if (allUsers.size() == 0) {
            user = setUserFields(form, passwordEncoder);
            user.setRole(roleService.getAdminRole());
        } else {
            user = setUserFields(form, passwordEncoder);
            user.setRole(roleService.getUserRole());
        }

        System.out.println(user);

        userRepository.save(user);

    }

    public UserDTOWithUsername findUserByUsername(String username) {

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

    public static User setUserFields(RegisterDTO form, PasswordEncoder passwordEncoder) {
        User user = new User();
        user.setUsername(form.getUsername());
        user.setEmail(form.getEmail());
        user.setPassword(passwordEncoder.encode(form.getPassword()));

        return user;
    }

}
