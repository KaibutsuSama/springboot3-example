package com.kaibutsusama.springboot3_mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kaibutsusama.springboot3_mybatisplus.domain.User;
import org.apache.ibatis.annotations.Mapper;

//如果MapperScan 可以不需要@Mapper
//@Mapper
public interface UserDao extends BaseMapper<User> {
}
