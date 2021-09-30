package com.example.kuzmichevjsp.controller.JPA;

import com.example.kuzmichevjsp.service.JPA.PilotServiceJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PilotControllerJPA {

    private PilotServiceJPA pilotServiceJPA;

    @Autowired
    public PilotControllerJPA(PilotServiceJPA pilotServiceJPA) {
        this.pilotServiceJPA = pilotServiceJPA;
    }

    @GetMapping(value = "/deletePilotById")
    public String deletePilotById(@RequestParam("id") int id) {
        pilotServiceJPA.deletePilotById(id);
        return "index";
    }

}

