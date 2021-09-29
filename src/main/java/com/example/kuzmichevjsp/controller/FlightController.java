package com.example.kuzmichevjsp.controller;

import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@Controller
public class FlightController {

    private FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping(value = "/getFlightByIdJDBC")
    public String getFlightByIdJDBC(@RequestParam("id") int id, Model model) {
        model.addAttribute("flight", flightService.getFlightByIdJDBC(id));
        return "flightsByID";
    }

    @GetMapping(value = "/flightsList")
    public String getAllFlightJDBC(Model model) {
        model.addAttribute("flight", flightService.getAllFlightJDBC());
        return "flightsList";
    }

    @RequestMapping("/addFlight")
    public String addFlightForm(Map<String, Object> model) {
        FlightDto flight = new FlightDto();
        model.put("flight", flight);
        return "addFlight";
    }

    @RequestMapping(value = "/saveNewFlight", method = RequestMethod.POST)
    public String saveFlight(@ModelAttribute("flight") FlightDto flight) {

        flightService.insertFlightJDBC(flight);
        return "redirect:/";
    }


}
