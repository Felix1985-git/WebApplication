package com.example.kuzmichevjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message");
        return "welcome";
    }
    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
    public String indexNew(Model model) {
        model.addAttribute("message");
        return "hello";
    }
}
