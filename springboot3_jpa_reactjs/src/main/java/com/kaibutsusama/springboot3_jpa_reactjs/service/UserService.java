package com.kaibutsusama.springboot3_jpa_reactjs.service;

import com.kaibutsusama.springboot3_jpa_reactjs.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();

}
