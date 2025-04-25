package com.cusc.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    @RequestMapping("/demo")
    public String demo() {
        return "jenkins 测试";
    }
}
