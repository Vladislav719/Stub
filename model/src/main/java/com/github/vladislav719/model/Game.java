package com.github.vladislav719.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Владислав on 05.04.2015.
 */
@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "game_id")
    private Long gameId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tournament_id")
    private Tournament tournament;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "games")
    private Set<Team> team;

    
}
