package com.ensa.projet_it.controller;

import com.ensa.projet_it.model.Employee;
import com.ensa.projet_it.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/employeeaffectation")
    public String getEmployeeAffectations() {
        // Retournez le nom de la page JSP d'affectation
        return "employeeAffectation";
    }



    @GetMapping("/employees")
    public String getAllEmployees(Model model) {
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        return "employees/employeeList";
    }

    @GetMapping("/employees/delete/{id}")
    public String deleteEmployee(@PathVariable("id") long id) {
        try {
            employeeRepository.deleteById(id);
        } catch (Exception ex) {
            System.out.println("Exception while deleting employee: " + ex.getMessage());

        }
        return "redirect:/employees";
    }

}
