package com.example.kuzmichevjsp.controller;

import com.example.kuzmichevjsp.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlaneController {

    private PlaneService planeService;

    @Autowired
    public PlaneController(PlaneService planeService) {
        this.planeService = planeService;
    }

    @GetMapping(value = "/getPlaneByIdJDBC")
    public void getPlaneByIdJDBC (@RequestParam("id") int id) {
        System.out.println(planeService.getPlaneByIdJDBC(id));
    }

    @GetMapping(value =  "/planesList")
    public String getAllFlightJDBC(Model model) {
        model.addAttribute("planes", planeService.getAllPlaneJDBC());
        return "planesList";
    }
}
