package com.kaibutsusama.springboot3_jpa;

import com.kaibutsusama.springboot3_jpa.domain.User;
import com.kaibutsusama.springboot3_jpa.service.UserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot3JpaApplicationTests {

    @Resource
    UserService userService;

    @Test
    void contextLoads() {
        User user = new User();
        user.setId(6);
        user.setName("Ash");
        user.setAge(19);
        user.setEmail("nihao@gmail.com");
        userService.save(user);
    }

}
