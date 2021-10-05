package com.example.kuzmichevjsp.controller.JPA;

import com.example.kuzmichevjsp.entity.Pilot;
import com.example.kuzmichevjsp.service.JPA.PilotServiceJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PilotControllerJPA {

    private PilotServiceJPA pilotServiceJPA;

    @Autowired
    public PilotControllerJPA(PilotServiceJPA pilotServiceJPA) {
        this.pilotServiceJPA = pilotServiceJPA;
    }

    @GetMapping(value = "/deletePilotById")
    public String deletePilotById(@RequestParam("id") int id) {
        pilotServiceJPA.deletePilotByIdJPA(id);
        return "redirect:/pilotsList";
    }

    @RequestMapping("/updatePilot")
    public String updatePilotForm(Model model, int id) {
        model.addAttribute("pilot", pilotServiceJPA.getPilotByIdJPA(id));
        return "updatePilot";
    }

    @RequestMapping(value = "/updatePilotById", method = RequestMethod.POST)
    public String updatePilotById(@ModelAttribute("pilot") Pilot pilot) {
        pilotServiceJPA.updatePilotByIdJPA(pilot);
        return "redirect:/pilotsList";
    }

}

