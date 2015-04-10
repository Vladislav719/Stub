package com.github.vladislav719.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by vladislav on 10.04.2015.
 */
@Entity
@Table(name = "MATCH_SHEET")
public class MatchSheet {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "match_sheet_id")
    private Long matchSheetId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_id")
    private Match match;

    @Column(name = "is_winner")
    private boolean isWinner;

    public MatchSheet() {
    }

    public Long getMatchSheetId() {
        return matchSheetId;
    }

    public void setMatchSheetId(Long matchSheetId) {
        this.matchSheetId = matchSheetId;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setIsWinner(boolean isWinner) {
        this.isWinner = isWinner;
    }
}
