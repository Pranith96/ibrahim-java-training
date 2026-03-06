package com.employee.service;

import java.util.List;

import com.employee.dto.EmployeeResponse;
import com.employee.entity.Employee;

public interface EmployeeService {

	String saveEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Employee getEmployee(Integer id);

	List<Employee> getEmployeesByAgeAndName(Integer age, String name);

	String deleteEmployee(Integer id);

	String updateEmployeesByNameById(Integer id, String name);
	EmployeeResponse updateEmployeesByNameByIdDetails(Integer id, String name);

}
