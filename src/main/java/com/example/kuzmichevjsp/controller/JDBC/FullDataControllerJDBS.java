package com.example.kuzmichevjsp.controller.JDBC;

import com.example.kuzmichevjsp.service.JDBC.FullDataServiceJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FullDataControllerJDBS {

    private FullDataServiceJDBC fullDataService;

    @Autowired
    public FullDataControllerJDBS(FullDataServiceJDBC fullDataService) {
        this.fullDataService = fullDataService;
    }

    @GetMapping("/getFullData")
    public String getFullDataJDBC (Model model) {
        model.addAttribute("fullData", fullDataService.getFullDataJDBC());
        return "getFullData";
    }
}
