package com.example.kuzmichevjsp.controller;

import com.example.kuzmichevjsp.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlaneController {

    private PlaneService planeService;

    @Autowired
    public PlaneController(PlaneService planeService) {
        this.planeService = planeService;
    }

    @RequestMapping(value = "/getPlaneByIdJDBC", method = RequestMethod.GET)
    public void getPlaneByIdJDBC (@RequestParam("id") int id) {
        System.out.println(planeService.getPlaneByIdJDBC(id));
    }
}
