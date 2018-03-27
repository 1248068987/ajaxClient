package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yp on 2018/2/28.
 */
@Controller
@RequestMapping(value = "/view")
public class ViewController {

    @RequestMapping(value = "/hello")
    public String view(){
        System.out.println("str>hello");
        return "hello";
    }
}
