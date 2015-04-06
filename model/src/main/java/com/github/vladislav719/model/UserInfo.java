package com.github.vladislav719.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Владислав on 05.04.2015.
 */
@Entity
@Table(name = "user_info")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInfo {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "user_info_id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "last_activity")
    private Date lastActivity;

    @Column(name = "solo_points")
    private Long soloPoints;

    @Column(name = "steam_id")
    private String steamId;

    @OneToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "photo_id")
    private Photo userPhoto;

    public UserInfo() {
    }

    public UserInfo(String firstName) {
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(Date lastActivity) {
        this.lastActivity = lastActivity;
    }

    public Long getSoloPoints() {
        return soloPoints;
    }

    public void setSoloPoints(Long soloPoints) {
        this.soloPoints = soloPoints;
    }

    public String getSteamId() {
        return steamId;
    }

    public void setSteamId(String steamId) {
        this.steamId = steamId;
    }

    public Photo getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(Photo userPhoto) {
        this.userPhoto = userPhoto;
    }
}
