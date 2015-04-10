package com.github.vladislav719.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by vladislav on 09.04.2015.
 */
@Table(name = "SQUADS")
@Entity
/**
 * описывает состав команды
 */
public class Squad {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "squad_id")
    private Long squadId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id")
    private Team team;

    @Column(name = "is_leader")
    private boolean isLeader;

    @Column(name = "register_date")
    private Date registerDate;

    public Squad() {
    }

    public Long getSquadId() {
        return squadId;
    }

    public void setSquadId(Long squadId) {
        this.squadId = squadId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setIsLeader(boolean isLeader) {
        this.isLeader = isLeader;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}
