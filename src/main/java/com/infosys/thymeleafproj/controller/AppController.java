package com.infosys.thymeleafproj.controller;

import com.infosys.thymeleafproj.model.Employee;
import com.infosys.thymeleafproj.service.EmployeeService;

import jakarta.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String showHome(){
    	System.out.println("/ working");
        return "home";
    }

    @GetMapping("/employee")
    public String showEmployee(@ModelAttribute("emp") Employee emp, Model map){
        map.addAttribute("emp", service.getEmployees());
        return "employee";
    }
    
    @GetMapping("/test/{id}/name")
    public String testMeth(@PathVariable int id){
        return "Result:: "+String.valueOf(id)+" hello";
    }
}
