package com.example.kuzmichevjsp.controller;

import com.example.kuzmichevjsp.entity.Flight;
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
    public String getFlightByIdJDBC (@RequestParam("id") int id, Model model) {
        model.addAttribute("flights", flightService.getFlightByIdJDBC(id));
        return "flightsByID";
    }

    @GetMapping(value =  "/flightsList")
    public String getAllFlightJDBC(Model model) {
        model.addAttribute("flights", flightService.getAllFlightJDBC());
        return "flightsList";
    }
    @RequestMapping("/addFlight")
    public String newCustomerForm(Map<String, Object> model) {
        Flight flight = new Flight();
        model.put("flight", flight);
        return "addFlight";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("flight") Flight flight) {
        flightService.insertFlightJDBC();
        return "redirect:/";
    }




}
