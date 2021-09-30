package com.example.kuzmichevjsp.controller.JPA;

import com.example.kuzmichevjsp.service.JPA.PlaneServiceJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PlaneControllerJPA {

    private PlaneServiceJPA planeServiceJPA;

    @Autowired
    public PlaneControllerJPA(PlaneServiceJPA planeServiceJPA) {
        this.planeServiceJPA = planeServiceJPA;
    }

    @GetMapping (value = "/deletePlaneById")
    public String deletePlaneById(@RequestParam("id") int id) {
        planeServiceJPA.deletePlaneById(id);
        return "index";
    }
}

