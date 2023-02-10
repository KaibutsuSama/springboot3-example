package com.kaibutsusama.springboot3_jpa.service;

import com.kaibutsusama.springboot3_jpa.domain.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    User save(User user);
    void delete(Integer id);
}
