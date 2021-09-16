package com.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.CustomeException.EmployeeNoFoundException;
import com.rest.model.Employee;
import com.rest.repo.empRep;

@Service
public class EmpServiceImpl implements IempService {

	@Autowired
	private empRep erepo;

	@Override
	public Integer saveEmployee(Employee e) {

		Integer id = erepo.save(e).getEid();

		return id;
	}

	@Override
	public List<Employee> getAllEmp() {
		
		List<Employee> list = erepo.findAll();

		return list;
	}

	@Override
	public void deleteEmp(Integer id) {
		Employee emp = getOneEmp(id);
		erepo.delete(emp);

	}

	@Override
	public void updateep(Employee e) {
		
		

	}

	@Override
	public Employee getOneEmp(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employee> eopt = erepo.findById(id);

		// orelsethrow is handle the Not Found data this reasen to use
		/*
		 * if(eopt.isPresent()) {
		 * 
		 * 
		 * } else { throw EmployeeNoFound(); }
		 */

		Employee emp = eopt.orElseThrow(() -> new EmployeeNoFoundException("Employee Not Found"));

		return emp;
	}

}
