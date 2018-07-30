package com.jackspringboot.demo;

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
}
