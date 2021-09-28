package com.example.kuzmichevjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StartController {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model) {
        String message1 = "Go to Flights list";
        model.addAttribute("flightsMessage", message1);
        String message2 = "Go to Pilots list";
        model.addAttribute("pilotsMessage", message2);
        String message3 = "Go to Planes list";
        model.addAttribute("planesMessage", message3);

        return "index";
    }
}
