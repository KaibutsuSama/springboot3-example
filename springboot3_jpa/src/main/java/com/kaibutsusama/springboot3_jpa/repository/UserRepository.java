package com.kaibutsusama.springboot3_jpa.repository;

import com.kaibutsusama.springboot3_jpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

// 第一个为实体类，第二个为主键类型
public interface UserRepository extends JpaRepository<User,Integer> {

}
