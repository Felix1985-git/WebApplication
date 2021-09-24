package com.example.kuzmichevjsp.controller;

import com.example.kuzmichevjsp.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PilotController {
    private PilotService pilotService;

    @Autowired
    public PilotController(PilotService pilotService) {
        this.pilotService = pilotService;
    }

    @RequestMapping(value = "/getPilotByIdJDBC", method = RequestMethod.GET)
    public void getPilotByIdJDBC (@RequestParam("id") int id) {
        System.out.println(pilotService.getPilotByIdJDBC(id));
    }
}
