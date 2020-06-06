package com.fnp.employees.models.repository;

import com.fnp.employees.models.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectsRepository extends JpaRepository<Project,Long> {
}
