package com.example.demo.apis;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping(value = "/message")
    public String getMessage(){
        return "Hello World! This is Shivani's first spring boot project :-)";
    }
}
