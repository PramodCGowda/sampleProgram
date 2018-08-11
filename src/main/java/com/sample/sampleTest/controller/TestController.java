package com.sample.sampleTest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "Welcome to GSD Dashboard api v1.0";
    }
}
