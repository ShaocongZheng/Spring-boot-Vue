package com.jackspringboot.demo.bean;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -1L;

    private String username;
    private Integer age;

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    // 省略getter和setter

}
