package com.kaibutsusama.springboot3_jpa_reactjs.repository;

import com.kaibutsusama.springboot3_jpa_reactjs.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
