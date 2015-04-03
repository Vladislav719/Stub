package com.github.vladislav719.model;

import javax.persistence.*;

/**
 * Created by Владислав on 03.04.2015.
 */
@Table(name = "NEWS")
@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
