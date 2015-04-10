package com.github.vladislav719.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by Владислав on 04.04.2015.
 */
@Entity
@Table(name = "tournaments")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tournament {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "tournament_id")
    private Long tournamentId;

    private String title;

    private String description;

    @Column(name = "start_date")
    private Date startDate;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tournament")
//    private List<Game> games;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="teamId", nullable = false, insertable = false, updatable = false)
//    private Team member1;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="teamId", nullable = false, insertable = false, updatable = false)
//    private Team member2;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="teamId", nullable = false, insertable = false, updatable = false)
//    private Team winner;

    public Tournament() {
    }

    public Long getTournamentId() {
        return tournamentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public List<Game> getGames() {
//        return games;
//    }
//
//    public void setGames(List<Game> games) {
//        this.games = games;
//    }

    public String getName() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

}
