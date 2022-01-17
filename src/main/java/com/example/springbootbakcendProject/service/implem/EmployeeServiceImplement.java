package com.example.springbootbakcendProject.service.implem;

import com.example.springbootbakcendProject.model.Employee;
import com.example.springbootbakcendProject.repository.EmployeeRepository;
import com.example.springbootbakcendProject.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImplement implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImplement(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);


    }

}
