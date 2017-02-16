package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PreferenceController {

    @RequestMapping(value={"", "/"})
    public String home() {

        return "home";
    }

    @RequestMapping("/login")
    public String login() {

        return "login";
    }

    @RequestMapping("/hello")
    public ModelAndView hello(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");

        mav.addObject("message", "- Hello, page -");
        return mav;
    }

}
