package com.rest.service;

import java.util.List;

import com.rest.model.Employee;

public interface IempService {

	Integer saveEmployee(Employee e);

	List<Employee> getAllEmp();

	void deleteEmp(Integer id);

	void updateep(Employee e);

	Employee getOneEmp(Integer id);

}
