package com.github.vladislav719.controller;

import com.github.vladislav719.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vladislav on 07.04.2015.
 */
@RestController
@RequestMapping
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public User getUser() {
        return new User("Vlad","Baimurzin.719@gmail.com","123456");
    }
}
