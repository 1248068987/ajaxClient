package com.imooc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yp on 2018/3/21.
 */
@RestController
@RequestMapping(value = "/test")
public class Test {
    @RequestMapping(value = "/test1")
    public String view(){
        System.out.println("str>hello");
        return "hello";
    }
}
