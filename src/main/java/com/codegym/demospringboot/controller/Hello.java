package com.codegym.demospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class Hello {
    @GetMapping
    public ModelAndView sayHello(){
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("name", "word!");
        return modelAndView;
    }
}
