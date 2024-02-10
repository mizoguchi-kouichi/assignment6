package com.kouichi.hello.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class helloCotroller {

    @GetMapping("/hello")
        public String hello(){
        return "hello world";
    }

}
