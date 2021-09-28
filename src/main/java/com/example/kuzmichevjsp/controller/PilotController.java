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
    public void getPilotByIdJDBC (@RequestParam("id") int id) {
        System.out.println(pilotService.getPilotByIdJDBC(id));
    }

    @GetMapping(value =  "/pilotsList")
    public String getAllFlightJDBC(Model model) {
        model.addAttribute("pilots", pilotService.getAllPilotJDBC());
        return "pilotsList";
    }
}
