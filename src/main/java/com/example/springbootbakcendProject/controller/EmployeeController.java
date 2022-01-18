package com.example.springbootbakcendProject.controller;

import com.example.springbootbakcendProject.model.Employee;
import com.example.springbootbakcendProject.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //build Employee Rest
    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    //build allEmployee RestAPI
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    //build GET emplyee by id REST API
    //http://localhost:8080/api/employees/1
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
        return  new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);
            }

}
