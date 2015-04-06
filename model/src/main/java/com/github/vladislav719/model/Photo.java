package com.github.vladislav719.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Владислав on 05.04.2015.
 */
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "photos")
public class Photo {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "photo_id")
    private Long photoId;

    @Column(name = "upload_date")
    private Date uploadDate;

    @Column(name = "photo_path")
    private String photoPath;

    public Photo() {
    }

    public Photo(Date uploadDate, String photoPath) {
        this.uploadDate = uploadDate;
        this.photoPath = photoPath;
    }

    public Long getPhotoId() {
        return photoId;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
}
