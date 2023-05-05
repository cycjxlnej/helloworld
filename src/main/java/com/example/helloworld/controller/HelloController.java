package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chenwei
 * @Date 2023/5/6 1:24 上午
 */

@RequestMapping("/hello")
@RestController
public class HelloController {
    @GetMapping("")
    public String hello() {
        System.out.println("hello world...");
        return "OK";
    }
}
