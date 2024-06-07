package com.ensa.projet_it.repository;
import com.ensa.projet_it.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

