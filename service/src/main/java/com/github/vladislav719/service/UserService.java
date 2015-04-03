package com.github.vladislav719.service;

import com.github.vladislav719.dto.UserRegistrationForm;
import com.github.vladislav719.model.User;

/**
 * Created by Владислав on 03.04.2015.
 */
public interface UserService {

    public User getUserByLogin(String login);

    public User getUserByID(Long id);

    public User saveUser(UserRegistrationForm userRegistrationForm);
}
