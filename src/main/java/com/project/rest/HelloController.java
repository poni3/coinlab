package com.project.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

    @RequestMapping("/login")
    public String hello() {
        return "Hello, conin lab!!!!";
    }
    
    @RequestMapping("/coinlab")
    public ModelAndView  mainlab() {
    	return new ModelAndView("main");
    }
}
