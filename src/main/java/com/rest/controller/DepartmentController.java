package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Department;
import com.rest.service.DepartmentService;
@RestController
@RequestMapping(name="/department")
public class DepartmentController {
	
	
	@Autowired 
	private DepartmentService deptService;
	
@PostMapping("/save")
	public ResponseEntity<String> saveDetail(@RequestBody Department dpt ){
	 String id=deptService.insert(dpt);
	
	return  new ResponseEntity<String>("Department"+id+"saved",HttpStatus.OK);
}
	
	
	
	
	
	
}
