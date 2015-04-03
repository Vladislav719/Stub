package com.github.vladislav719.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Владислав on 03.04.2015.
 */
@Controller
@RequestMapping()
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam String username, @RequestParam String password) {
        //stub method; never used, only for swagger; saw AuthenticationFilter.java
        return null;
    }
}
