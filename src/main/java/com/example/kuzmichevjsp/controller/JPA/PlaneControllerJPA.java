package com.example.kuzmichevjsp.controller.JPA;

import com.example.kuzmichevjsp.entity.Plane;
import com.example.kuzmichevjsp.service.JPA.PlaneServiceJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlaneControllerJPA {

    private PlaneServiceJPA planeServiceJPA;

    @Autowired
    public PlaneControllerJPA(PlaneServiceJPA planeServiceJPA) {
        this.planeServiceJPA = planeServiceJPA;
    }

    @GetMapping (value = "/deletePlaneById")
    public String deletePlaneById(@RequestParam("id") int id) {
        planeServiceJPA.deletePlaneByIdJPA(id);
        return "redirect:/planesList";
    }

    @RequestMapping("/updatePlane")
    public String updatePlaneForm(Model model, int id) {
        model.addAttribute("plane", planeServiceJPA.getPlaneByIdJPA(id));
        return "updatePlane";
    }

    @RequestMapping(value = "/updatePlaneById", method = RequestMethod.POST)
    public String updatePilotById(@ModelAttribute("plane") Plane plane) {
        planeServiceJPA.updatePlaneByIdJPA(plane);
        return "redirect:/planesList";
    }



}

