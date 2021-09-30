package com.example.kuzmichevjsp.controller.JPA;


import com.example.kuzmichevjsp.service.JPA.FlightServiceJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FlightControllerJPA {

    private FlightServiceJPA flightServiceJPA;

    @Autowired
    public FlightControllerJPA(FlightServiceJPA flightService) {
        this.flightServiceJPA = flightService;
    }

    @GetMapping(value = "/deleteFlightById")
    public String deleteFlightById(@RequestParam("id") int id) {
        flightServiceJPA.deleteFlightById(id);
        return "index";
    }
}
