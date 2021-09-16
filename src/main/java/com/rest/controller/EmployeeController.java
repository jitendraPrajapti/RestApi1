package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Employee;
import com.rest.service.IempService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IempService iservice;

	// save
	@PostMapping(value = "/save")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
		Integer id = iservice.saveEmployee(employee);

		return new ResponseEntity<String>("Employee " + id + " saved", HttpStatus.OK);
	}

	// fetch all

	@GetMapping(value="/all")
	public ResponseEntity<List<Employee>> getAllEmp() {

		List<Employee> list = iservice.getAllEmp();

		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);

	}

	//fetch One

	@GetMapping("/one/{id}")
	public ResponseEntity<Employee> getOneEmp(@PathVariable Integer id) {

		Employee emp = iservice.getOneEmp(id);

		return new ResponseEntity<Employee>(emp, HttpStatus.OK);

	}
	
	// delete
	@DeleteMapping("remove/{id}")
	
	public ResponseEntity<String> deleteemp( @PathVariable Integer id){

		iservice.deleteEmp(id);
		
		 return new  ResponseEntity<String>("Employee '" +id+ "'delete", HttpStatus.OK);
		
		
		
	}
	
	
	// update

	
	@PutMapping("modify/{id}")
	public ResponseEntity<String> updateemp(@PathVariable Integer id, @RequestBody Employee employee) {
		Employee emp = iservice.getOneEmp(id);
		emp.setEname(employee.getEname());
		emp.setEsal(employee.getEsal());
		emp.setDert(employee.getDert());
		emp.setAddrs(employee.getAddrs());
		iservice.saveEmployee(emp);

		return new ResponseEntity<String>("Employee" + id + "Updated", HttpStatus.OK);
		
	}
}
