package com.ensa.projet_it.repository;
import com.ensa.projet_it.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByPositionIn(List<String> positions);
}

