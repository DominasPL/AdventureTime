package com.github.DominasPL.AdventureTime.services;

import com.github.DominasPL.AdventureTime.domain.entities.Role;
import com.github.DominasPL.AdventureTime.domain.repositories.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {

    private static final Logger logger = LoggerFactory.getLogger(RoleService.class);

    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public Role getAdminRole() {

        Optional<Role> optionalRole = roleRepository.findRoleByName("ROLE_ADMIN");
        Role role = optionalRole.orElse(null);

        if (role == null) {
            logger.info("Admin role not found!");
            return null;
        }

        return role;
    }

    public Role getUserRole() {

        Optional<Role> optionalRole = roleRepository.findRoleByName("ROLE_USER");
        Role role = optionalRole.orElse(null);

        if (role == null) {
            logger.info("User role not found!");
            return null;
        }

        return role;
    }
}
