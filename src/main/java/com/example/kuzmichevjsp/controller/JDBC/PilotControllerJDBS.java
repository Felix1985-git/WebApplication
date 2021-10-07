package com.example.kuzmichevjsp.controller.JDBC;

import com.example.kuzmichevjsp.dto.PilotDto;
import com.example.kuzmichevjsp.service.JDBC.PilotServiceJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class PilotControllerJDBS {
    private PilotServiceJDBC pilotService;

    @Autowired
    public PilotControllerJDBS(PilotServiceJDBC pilotService) {
        this.pilotService = pilotService;
    }

    @GetMapping(value = "/getPilotByIdJDBC")
    public String getPilotByIdJDBC(@RequestParam("id") int id, Model model) {
        model.addAttribute("pilot", pilotService.getPilotByIdJDBC(id));
        return "pilotsByID";
    }

    @GetMapping(value = "/pilotsList")
    public String getAllFlightJDBC(Model model) {
        model.addAttribute("pilot", pilotService.getAllPilotJDBC());
        return "pilotsList";
    }

    @RequestMapping("/addPilot")
    public String addFlightForm(Map<String, Object> model) {
        PilotDto pilot = new PilotDto();
        model.put("pilot", pilot);
        return "addPilot";
    }

    @RequestMapping(value = "/saveNewPilot", method = RequestMethod.POST)
    public String saveFlight(@ModelAttribute("pilot") PilotDto pilot) {
        pilotService.insertPilotJDBC(pilot);
        return "redirect:/pilotsList";
    }
}
