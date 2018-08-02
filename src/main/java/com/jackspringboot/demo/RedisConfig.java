package com.jackspringboot.demo;


import com.jackspringboot.demo.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(20);
        poolConfig.setMinIdle(2);
        poolConfig.setMaxIdle(5);

        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration("119.23.54.195", 6379);
        redisStandaloneConfiguration.getHostName();
        JedisConnectionFactory factory = new JedisConnectionFactory(redisStandaloneConfiguration);
        return factory;
    }

    @Bean(name = "redisUserTemplate")
    public RedisTemplate<String, User> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, User> template = new RedisTemplate<String, User>();
        template.setConnectionFactory(jedisConnectionFactory());
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new RedisObjectSerializer());
        return template;
    }
}