package com.example.springbootbakcendProject.controller;

import com.example.springbootbakcendProject.service.EmployeeService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //build Employee Rest
    
}
