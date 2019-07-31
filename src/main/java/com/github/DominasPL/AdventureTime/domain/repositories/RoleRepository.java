package com.github.DominasPL.AdventureTime.domain.repositories;

import com.github.DominasPL.AdventureTime.domain.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {


    Optional<Role> findRoleByName(String role_admin);
}
