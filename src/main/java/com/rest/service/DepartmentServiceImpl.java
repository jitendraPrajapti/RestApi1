package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Department;
import com.rest.repo.DepartmentRepo;
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepo departRepo;
	
	
	@Override
	public String insert(Department dpt) {

		 String str= departRepo.save(dpt).getCity();
		
		return str;
	}

}
