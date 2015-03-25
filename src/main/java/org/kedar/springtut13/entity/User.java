package org.kedar.springtut13.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
}

