package com.example.kuzmichevjsp.controller;

import com.example.kuzmichevjsp.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FlightController {

    private FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @RequestMapping (value = "/getFlightByIdJDBC", method = RequestMethod.GET)
    public void getFlightByIdJDBC (@RequestParam("id") int id) {
        System.out.println(flightService.getFlightByIdJDBC(id));
    }
}
