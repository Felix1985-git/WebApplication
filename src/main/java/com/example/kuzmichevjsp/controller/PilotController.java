package com.example.kuzmichevjsp.controller;

import com.example.kuzmichevjsp.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PilotController {
    private PilotService pilotService;

    @Autowired
    public PilotController(PilotService pilotService) {
        this.pilotService = pilotService;
    }

    @GetMapping(value = "/getPilotByIdJDBC")
    public String getPilotByIdJDBC (@RequestParam("id") int id, Model model) {
        model.addAttribute("pilot", pilotService.getPilotByIdJDBC(id));
        return "pilotsByID";
    }

    @GetMapping(value =  "/pilotsList")
    public String getAllFlightJDBC(Model model) {
        model.addAttribute("pilot", pilotService.getAllPilotJDBC());
        return "pilotsList";
    }
}
