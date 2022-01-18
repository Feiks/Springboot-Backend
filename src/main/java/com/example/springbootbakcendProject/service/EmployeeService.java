package com.example.springbootbakcendProject.service;

import com.example.springbootbakcendProject.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(long id);

}
