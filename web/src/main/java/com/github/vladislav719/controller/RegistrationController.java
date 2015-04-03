package com.github.vladislav719.controller;

import com.github.vladislav719.dto.UserRegistrationForm;
import com.github.vladislav719.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Владислав on 03.04.2015.
 */
@Controller
@RequestMapping()
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    ShaPasswordEncoder shaPasswordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public
    @ResponseBody
    Object registerUser(UserRegistrationForm userRegistrationForm, HttpServletRequest request, HttpServletResponse response) {
        if (isExist(userRegistrationForm)) {
            return new ResponseEntity<>("Username already exists ", HttpStatus.CONFLICT);
        }
        if (!isPasswordEquals(userRegistrationForm)) {
            return new ResponseEntity<>("Password confirmation and Password must match ",HttpStatus.BAD_REQUEST);
        }
        userRegistrationForm.setPassword(decodePassword(userRegistrationForm.getPassword()));
        response.setStatus(HttpServletResponse.SC_CREATED);
        return userService.saveUser(userRegistrationForm);
    }

    private String decodePassword(String password) {
        return shaPasswordEncoder.encodePassword(password, "");
    }

    private boolean isExist(UserRegistrationForm userRegistrationForm) {
        if (userService.getUserByLogin(userRegistrationForm.getLogin()) != null)
            return true; //user exist
        return false;
    }

    private boolean isPasswordEquals(UserRegistrationForm userRegistrationForm) {
        if (userRegistrationForm.getPassword().equals(userRegistrationForm.getConfirmPassword()))
            return true; //password are equals
        return false;
    }
}
