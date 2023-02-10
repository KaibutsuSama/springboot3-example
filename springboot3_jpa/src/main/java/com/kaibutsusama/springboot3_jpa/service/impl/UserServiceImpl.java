package com.kaibutsusama.springboot3_jpa.service.impl;

import com.kaibutsusama.springboot3_jpa.domain.User;
import com.kaibutsusama.springboot3_jpa.repository.UserRepository;
import com.kaibutsusama.springboot3_jpa.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserRepository userRepository;


    @Override
    public User findById(Integer id) {
        return userRepository.getById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}
