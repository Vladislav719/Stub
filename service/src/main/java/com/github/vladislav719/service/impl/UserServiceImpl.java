package com.github.vladislav719.service.impl;

import com.github.vladislav719.dto.UserRegistrationForm;
import com.github.vladislav719.model.User;
import com.github.vladislav719.repository.UserRepository;
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

    @Override
    public User getUserByLogin(String login) {
        return userRepository.findUserByLogin(login);
    }

    @Override
    public User getUserByID(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User saveUser(UserRegistrationForm userRegistrationForm) {
        User user = new User();
        user.setPassword(userRegistrationForm.getPassword());
        user.setLogin(userRegistrationForm.getLogin());
        return userRepository.save(user);
    }

}
