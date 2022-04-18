package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.EmployeeEntity;

public interface EmployeeService {
	List<EmployeeEntity>findAllEmployee();
	Optional<EmployeeEntity> findById(Integer id);
	EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
	EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
	void deleteEmployee(Integer id);
}
