package com.jackspringboot.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackspringboot.demo.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JackSpringBootApplicationTests {



    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Test
    public void contextLoads() {
        Jedis jedis=new Jedis("119.23.54.195",6379);
        System.out.println(jedis.ping()+jedis.get("foo"));
        try {
            redisTemplate.opsForValue().set("name", "张三");
            Object object = redisTemplate.opsForValue().get("name");
            System.out.println(object);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
