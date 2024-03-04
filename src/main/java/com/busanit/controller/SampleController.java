package com.busanit.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample/*")
public class SampleController {

    @GetMapping("/basic1")
    public void basicGet() {
        System.out.println("basicGet1...");
    }

    @GetMapping("/basic2")
    public void basicGet2() {
        System.out.println("basicGet2...");
    }
}
