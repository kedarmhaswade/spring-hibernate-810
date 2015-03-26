package org.kedar.springtut13.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by kmhaswade on 3/25/2015.
 */
@Entity
@Setter
@Getter
public class Role {
    @Id
    @GeneratedValue
    private Long id;

    //Relationships
    @ManyToMany
    private List<User> users;
}
