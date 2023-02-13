package com.kaibutsusama.springboot3_jpa_reactjs.controller;

import com.kaibutsusama.springboot3_jpa_reactjs.pojo.User;
import com.kaibutsusama.springboot3_jpa_reactjs.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/users")
    public List<User> selectAll(){
        List<User> allUser = userService.findAllUser();
        return allUser;
    }
}
