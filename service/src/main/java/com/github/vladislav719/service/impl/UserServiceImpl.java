package com.github.vladislav719.service.impl;

import com.github.vladislav719.dto.UserInfoForm;
import com.github.vladislav719.dto.UserRegistrationForm;
import com.github.vladislav719.model.Photo;
import com.github.vladislav719.model.User;
import com.github.vladislav719.model.UserInfo;
import com.github.vladislav719.repository.UserInfoRepository;
import com.github.vladislav719.repository.UserRepository;
import com.github.vladislav719.service.PhotoService;
import com.github.vladislav719.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Владислав on 03.04.2015.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Autowired
    private PhotoService photoService;

    @Override
    public User getUserByLogin(String login) {
        return userRepository.findUserByLogin(login);
    }

    @Override
    public User getUserByID(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public User saveUser(UserRegistrationForm userRegistrationForm) {
        User user = new User();
        user.setPassword(userRegistrationForm.getPassword());
        user.setLogin(userRegistrationForm.getLogin());
        return userRepository.save(user);
    }

    @Override
    public UserInfo getUserInfo(Long userId) {
        return userInfoRepository.getUserInfo(userId);
    }

    @Override
    public UserInfo updateUserInfo(UserInfoForm userInfoForm, UserInfo currentUserInfo) {
        currentUserInfo.setUserPhoto(userInfoForm.getUserPhoto());
        currentUserInfo.setFirstName(userInfoForm.getFirstName());
        currentUserInfo.setBirthDate(userInfoForm.getBirthDate());
        return userInfoRepository.save(currentUserInfo);
    }

    @Override
    public Photo setUserPhoto(String relativeUrl, UserInfo currentUserInfo) {
        Photo photo = photoService.addPhoto(relativeUrl, currentUserInfo);
        currentUserInfo.setUserPhoto(photo);
        userInfoRepository.save(currentUserInfo);

        return photo;
    }

    @Override
    public Photo getUserPhoto(Long userId) {
        return userInfoRepository.getUserPhoto(userId);
    }

}
