package com.github.vladislav719.controller.api;

import com.github.vladislav719.helper.http.errors.ResponseBuilder;
import com.github.vladislav719.model.Photo;
import com.github.vladislav719.model.User;
import com.github.vladislav719.model.UserInfo;
import com.github.vladislav719.service.PhotoService;
import com.github.vladislav719.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.Calendar;

/**
 * Created by vladislav on 06.04.2015.
 */
@RestController
@RequestMapping
public class UserInfoController {

    private static final Logger log = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private PhotoService photoService;

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Object getUserInfo(@PathVariable Long userId) {
        log.info(" retrieving userId :  " + userId);
        UserInfo userInfo = userService.getUserInfo(userId);
        //just for test, while has no data in DB
//        userInfo = new UserInfo("Vladislav");
//        userInfo.setUserPhoto(new Photo(new Date(Calendar.getInstance().getTimeInMillis()), "c:/photo.jpg"));
//        userInfo.setUser(new User("admin", "baimurzin@gmail.com", "12345"));
//        userInfo.setSoloPoints(1000l);
        if (userInfo == null) {
            return ResponseBuilder.standartErrorResource(HttpStatus.NOT_FOUND, "user not found");
        }

        return ResponseBuilder.success(HttpStatus.OK, userInfo);
    }

}
