package com.kouichi.hello.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/student")
    public student getstudent() {
        return new student("溝口光一", 23, "大分県");
    }

}
