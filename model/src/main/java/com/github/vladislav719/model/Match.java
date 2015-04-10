package com.github.vladislav719.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

/**
 * Created by vladislav on 10.04.2015.
 */
@Entity
@Table(name = "MATCHES")
public class Match {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "match_id")
    private Long matchId;
    @Column(name = "match_date")
    private Date matchDate;

    @OneToMany(mappedBy = "match")
    private Set<MatchSheet> matchSheets;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tournament_id")
    private Tournament tournament;

    public Match() {
    }

    public Long getMatchId() {
        return matchId;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public Set<MatchSheet> getMatchSheets() {
        return matchSheets;
    }

    public void setMatchSheets(Set<MatchSheet> matchSheets) {
        this.matchSheets = matchSheets;
    }
}
