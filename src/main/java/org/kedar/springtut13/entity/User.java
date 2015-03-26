package org.kedar.springtut13.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * A basic User Entity.
 */
@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private String password;

    //Relationships
    @ManyToMany
    @JoinTable
    private List<Role> roles;

    @OneToMany(mappedBy = "user") //the entity owning this relationship. This is user in this case.
    private List<Blog> blogs;
}

