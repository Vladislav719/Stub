package com.github.vladislav719.dto;

import com.github.vladislav719.model.Photo;

/**
 * Created by Владислав on 04.04.2015.
 */
public class TeamCreationForm {

    private String teamName;
    private Photo photo;

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
