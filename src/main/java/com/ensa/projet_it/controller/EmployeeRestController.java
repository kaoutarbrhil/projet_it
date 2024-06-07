package com.ensa.projet_it.controller;

import com.ensa.projet_it.model.Employee;
import com.ensa.projet_it.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeRestController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees/json")
    public List<Employee> getEmployeesJson() {
        // Récupérer tous les employés de type "Dev", "Test" et "DevOps"
        List<Employee> devEmployees = employeeRepository.findByPositionIn(List.of("DEV", "TEST", "DEVOPS"));
        return devEmployees;
    }
}
