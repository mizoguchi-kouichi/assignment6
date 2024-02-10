package com.kouichi.hello.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class helloCotroller {

    @GetMapping("/student")
        public student getstudet(){
        return new student("溝口光一",23,"大分県");
    }

}
