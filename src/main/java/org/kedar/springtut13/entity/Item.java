package org.kedar.springtut13.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kmhaswade on 3/25/2015.
 */
@Entity
@Getter
@Setter
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String description;

    @Column(name = "published_date")
    private Date publishedDate;

    private String link;

    @ManyToOne
    @JoinColumn(name = "blog_id")
    private Blog blog;
}
