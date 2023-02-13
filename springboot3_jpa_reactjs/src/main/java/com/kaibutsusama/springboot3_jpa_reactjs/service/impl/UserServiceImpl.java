package com.kaibutsusama.springboot3_jpa_reactjs.service.impl;

import com.kaibutsusama.springboot3_jpa_reactjs.pojo.User;
import com.kaibutsusama.springboot3_jpa_reactjs.repository.UserRepository;
import com.kaibutsusama.springboot3_jpa_reactjs.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
