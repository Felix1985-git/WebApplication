package com.example.kuzmichevjsp.controller.JPA;


import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.entity.Flight;
import com.example.kuzmichevjsp.service.JPA.FlightServiceJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class FlightControllerJPA {

    private FlightServiceJPA flightServiceJPA;

    @Autowired
    public FlightControllerJPA(FlightServiceJPA flightService) {
        this.flightServiceJPA = flightService;
    }

    @GetMapping(value = "/deleteFlightById")
    public String deleteFlightById(@RequestParam("id") int id) {
        flightServiceJPA.deleteFlightByIdJPA(id);
        return "index";
    }

    @RequestMapping("/updateFlight")
    public String updateFlightForm(Model model, int id) {
        model.addAttribute("flight", flightServiceJPA.getFlightByIdJPA(id));
        return "updateFlight";
    }

    @RequestMapping(value = "/updateFlightById", method = RequestMethod.POST)
    public String updateFlightById(@ModelAttribute("flight") Flight flight) {
        flightServiceJPA.updateFlightByIdJPA(flight);
        return "redirect:/";
    }
}
