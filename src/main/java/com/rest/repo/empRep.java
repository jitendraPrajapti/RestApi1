package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.model.Employee;

public interface empRep  extends JpaRepository<Employee, Integer>{
	

}
