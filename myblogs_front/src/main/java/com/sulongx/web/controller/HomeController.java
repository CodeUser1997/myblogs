package com.sulongx.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 主页控制层
 * @Author suLongX
 * @Date 2019-04-13 19:46
 * Version 1.0
 */
@Controller
@RequestMapping("/home")
public class HomeController {


    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "Hello world!";
    }


}
