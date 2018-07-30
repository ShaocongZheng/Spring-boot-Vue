package com.jackspringboot.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@Controller
public class HelloController{

    @RequestMapping(value = "/hello")
    public String index() {
        return "index";
    }

}
