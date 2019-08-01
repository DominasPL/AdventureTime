package com.github.DominasPL.AdventureTime.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_details")
public class UserDetails {

    @Id
    private Long id;
    private String name;
    private String surname;

}
