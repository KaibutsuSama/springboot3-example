package com.kaibutsusama.springboot3_mybatisplus.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User实体类
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("user")
public class User {
    @TableId()
    private Integer id;
    private String name;
    private Integer age;
    private String email;

}
