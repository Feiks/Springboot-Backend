package com.example.springbootbakcendProject.repository;

import com.example.springbootbakcendProject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
