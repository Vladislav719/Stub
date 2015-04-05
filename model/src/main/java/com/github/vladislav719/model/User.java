package com.github.vladislav719.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Владислав on 03.04.2015.
 */
@Table(name = "USERS")
@Entity
public class User {

    @Id
    @GeneratedValue(generator="increment")
    @Column(name = "user_id")
    @GenericGenerator(name="increment", strategy = "increment")
    private long userId;

    private String login;
    private String email;

    @JsonIgnore
    private String password;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="teamId", nullable = false)
//    private Team team;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "user")
    private UserInfo userInfo;

    public User() {
    }

    public User(String login, String email, String password) {
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public long getUserId() {
        return userId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
