package com.github.vladislav719.service;

import com.github.vladislav719.model.Photo;
import com.github.vladislav719.model.UserInfo;

/**
 * Created by vladislav on 06.04.2015.
 */
public interface PhotoService {
    public Photo addPhoto(String relativeUrl, UserInfo currentUserInfo);
}
