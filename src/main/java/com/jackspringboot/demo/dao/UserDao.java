package com.jackspringboot.demo.dao;

import javax.annotation.Resource;

import com.jackspringboot.demo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;



@Repository
public class UserDao {

    @Autowired
    RedisTemplate<String,User> redisTemplate;

    boolean save(User user) {
        return false;
    }


}