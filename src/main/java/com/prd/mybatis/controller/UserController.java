package com.prd.mybatis.controller;

import com.prd.mybatis.entity.User;
import com.prd.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectByPrimaryKey/{userId}", method = RequestMethod.GET)
    public User selectByPrimaryKey(@PathVariable("userId") Integer userId) {
        return userService.selectByPrimaryKey(userId);
    }
}
