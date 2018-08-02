package com.jackspringboot.demo;

import com.jackspringboot.demo.bean.User;
import com.jackspringboot.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@CrossOrigin
public class getIpAddress {

    @RequestMapping(value = "/getip")
    public Object getip(HttpServletRequest request) {
        getIpAddr a=new getIpAddr();
        a.getIpAddr(request);
        return a;
    }
    @RequestMapping(value = "/get")
    public Object get(HttpServletRequest request) {
        getIpAddr a=new getIpAddr();
        a.getIpAddr(request);
        return a;
    }

}
