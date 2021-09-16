package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
