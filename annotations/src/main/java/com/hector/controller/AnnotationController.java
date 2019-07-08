package com.hector.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnnotationController {
    @RequestMapping("/testRequestMapping")
    public String testRequestMapping() {
        return "success";
    }
}
