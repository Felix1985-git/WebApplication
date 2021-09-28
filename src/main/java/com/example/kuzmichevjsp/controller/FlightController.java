package com.example.kuzmichevjsp.controller;

import com.example.kuzmichevjsp.entity.Flight;
import com.example.kuzmichevjsp.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FlightController {

    private FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping(value = "/getFlightByIdJDBC")
    public Flight getFlightByIdJDBC (@RequestParam("id") int id) {
        return flightService.getFlightByIdJDBC(id);
    }

    @GetMapping(value =  "/flightsList")
    public String getAllFlightJDBC(Model model) {
        model.addAttribute("flights", flightService.getAllFlightJDBC());
        return "flightsList";
    }
}
