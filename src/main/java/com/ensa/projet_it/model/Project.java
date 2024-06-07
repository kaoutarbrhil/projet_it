package com.ensa.projet_it.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double budget;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;

    // Constructeur
    public Project(long id, String name, double budget, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.employees = employees;
    }

    public Project() {

    }

    // Getters et setters pour les attributs
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
