package org.kedar.springtut13.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kmhaswade on 3/25/2015.
 */
@Entity
@Getter
@Setter
public class Blog {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String url;

    @ManyToOne
    @JoinColumn(name = "user_id") // the foreign key
    private User user;

    @OneToMany(mappedBy = "blog")
    private List<Item> items;
}
