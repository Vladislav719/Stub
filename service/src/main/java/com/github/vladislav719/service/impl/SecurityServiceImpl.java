package com.github.vladislav719.service.impl;

import com.github.vladislav719.model.User;
import com.github.vladislav719.service.SecurityService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * Created by Дамир on 08.02.2015.
 */
@Service
public class SecurityServiceImpl implements SecurityService {

    @Override
    public User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext() != null ? SecurityContextHolder.getContext().getAuthentication() : null;
        if (authentication == null) {
            return null;
        } else {
            return (User) authentication.getPrincipal();
        }
    }
}
