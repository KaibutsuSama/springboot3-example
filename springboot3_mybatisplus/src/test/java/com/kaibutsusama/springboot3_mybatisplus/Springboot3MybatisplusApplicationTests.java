package com.kaibutsusama.springboot3_mybatisplus;

import com.kaibutsusama.springboot3_mybatisplus.dao.UserDao;
import com.kaibutsusama.springboot3_mybatisplus.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot3MybatisplusApplicationTests {

    @Autowired
    UserDao userDao;


    /**
     * 测试selectById
     */
    @Test
    public void getById(){
        User user = userDao.selectById(1);
        System.out.println(user);
    }

    /**
     * 测试selectAll
     */
    @Test
    public void getAll(){
        List<User> users = userDao.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
