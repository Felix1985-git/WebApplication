package com.example.kuzmichevjsp.controller.JDBC;

import com.example.kuzmichevjsp.dto.PlaneDto;
import com.example.kuzmichevjsp.service.JDBC.PlaneServiceJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class PlaneControllerJDBS {

    private PlaneServiceJDBC planeService;

    @Autowired
    public PlaneControllerJDBS(PlaneServiceJDBC planeService) {
        this.planeService = planeService;
    }

    @GetMapping(value = "/getPlaneByIdJDBC")
    public String getPlaneByIdJDBC (@RequestParam("id") int id, Model model) {
        model.addAttribute("plane", planeService.getPlaneByIdJDBC(id));
        return "planesByID";
    }

    @GetMapping(value =  "/planesList")
    public String getAllFlightJDBC(Model model) {
        model.addAttribute("plane", planeService.getAllPlaneJDBC());
        return "planesList";
    }

    @RequestMapping("/addPlane")
    public String addFlightForm(Map<String, Object> model) {
        PlaneDto plane = new PlaneDto();
        model.put("plane", plane);
        return "addPlane";
    }

    @RequestMapping(value = "/saveNewPlane", method = RequestMethod.POST)
    public String saveFlight(@ModelAttribute("plane") PlaneDto plane) {
        planeService.insertPlaneJDBC(plane);
        return "redirect:/planesList";
    }

    @GetMapping("/getAllFlightsByPlaneId")
    public String getAllFlightsByPilotId (@RequestParam("id") int id, Model model){
        model.addAttribute("allFlights",planeService.getAllFlightsByPlaneId(id));
        return "allFlightsPlane";
    }

}
