package com.github.vladislav719.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by Владислав on 04.04.2015.
 */
@Entity
@Table(name = "Teams")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Team {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "team_name")
    private String teamName;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="user_id")
//    private User owner;

//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "team", cascade = CascadeType.ALL)
//    private List<User> members;

    @OneToMany(mappedBy = "team")
    private Set<MatchSheet> matchSheet;

    @Column(name = "team_score")
    private Long teamScore;

//    @ManyToMany()
//    @JoinTable(name = "vw_games",
//            joinColumns = @JoinColumn(name = "team_id", referencedColumnName = "team_id"),
//            inverseJoinColumns = @JoinColumn(name = "game_id", referencedColumnName = "game_id")
//    )
//    private List<Game> games;


    @OneToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "photo_id")
    private Photo teamLogo;

    @OneToMany(mappedBy = "team")
    private Set<Squad> squads;

    public Team() {
    }

    public Long getTeamScore() {
        return teamScore;
    }

//    public List<Game> getGames() {
//        return games;
//    }
//
//    public void setGames(List<Game> games) {
//        this.games = games;
//    }

    public void setTeamScore(Long teamScore) {
        this.teamScore = teamScore;

    }

    public Set<MatchSheet> getMatchSheet() {
        return matchSheet;
    }

    public void setMatchSheet(Set<MatchSheet> matchSheet) {
        this.matchSheet = matchSheet;
    }

    public Photo getTeamLogo() {
        return teamLogo;
    }

    public void setTeamLogo(Photo teamLogo) {
        this.teamLogo = teamLogo;
    }

    public Long getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

//    public User getOwner() {
//        return owner;
//    }
//
//    public void setOwner(User owner) {
//        this.owner = owner;
//    }

//    public List<User> getMembers() {
//        return members;
//    }
//
//    public void setMembers(List<User> members) {
//        this.members = members;
//    }


    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Set<Squad> getSquads() {
        return squads;
    }

    public void setSquads(Set<Squad> squads) {
        this.squads = squads;
    }

    public Long getTeam_score() {
        return teamScore;
    }

    public void setTeam_score(Long team_score) {
        this.teamScore = team_score;
    }
}
