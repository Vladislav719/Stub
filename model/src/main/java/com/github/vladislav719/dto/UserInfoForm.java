package com.github.vladislav719.dto;

import com.github.vladislav719.model.Photo;

import java.sql.Date;

/**
 * Created by vladislav on 06.04.2015.
 */
public class UserInfoForm {

    private Photo userPhoto;
    private Date birthDate;
    private String firstName;

    public Photo getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(Photo userPhoto) {
        this.userPhoto = userPhoto;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
