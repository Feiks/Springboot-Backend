package com.example.springbootbakcendProject.service.implem;

import com.example.springbootbakcendProject.exception.ResourceNotFoundException;
import com.example.springbootbakcendProject.model.Employee;
import com.example.springbootbakcendProject.repository.EmployeeRepository;
import com.example.springbootbakcendProject.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee>  employee= employeeRepository.findById(id);
       return employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee","id",id));
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        // we need to check whether an Employee with a given id is existing or not

        Employee existingEmployee  = employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee","id",id));

        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
        employeeRepository.save(existingEmployee);
        return existingEmployee;
        }

}
