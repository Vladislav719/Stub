package com.github.vladislav719.service;

import com.github.vladislav719.dto.UserInfoForm;
import com.github.vladislav719.dto.UserRegistrationForm;
import com.github.vladislav719.model.Photo;
import com.github.vladislav719.model.User;
import com.github.vladislav719.model.UserInfo;

/**
 * Created by Владислав on 03.04.2015.
 */
public interface UserService {

    public User getUserByLogin(String login);

    public User getUserByID(Long id);

    public User getUserByEmail(String email);

    public User saveUser(UserRegistrationForm userRegistrationForm);

    public UserInfo getUserInfo(Long userId);

    public UserInfo updateUserInfo(UserInfoForm userInfoForm, Long userId);

    public Photo setUserPhoto(String relativeUrl, UserInfo currentUserInfo);

    public Photo getUserPhoto(Long userId);

}
