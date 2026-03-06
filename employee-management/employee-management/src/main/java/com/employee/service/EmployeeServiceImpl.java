package com.employee.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeResponse;
import com.employee.entity.Employee;
import com.employee.exceptions.EmployeeNotFoundException;
import com.employee.repository.EmployeeRepository;

@Service
@Profile(value = { "dev", "prod", "test", "perf", "local" })
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public String saveEmployee(Employee employee) {
		employee.setStatus("ACTIVE");
		Employee response = employeeRepository.save(employee);
		if (response == null) {
			return null;
		}
		return "Employee saved successfully";
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> response = employeeRepository.findAll();
		if (response == null || response.isEmpty()) {
			return Collections.emptyList();
		}
		return response;
	}

	@Override
	public Employee getEmployee(Integer id) {
		Optional<Employee> response = employeeRepository.findById(id);
		if (!response.isPresent()) {
			throw new EmployeeNotFoundException("Employee not found for id: " + id);
		}
		return response.get();
	}

	@Override
	public List<Employee> getEmployeesByAgeAndName(Integer age, String name) {
		List<Employee> response = employeeRepository.findEmployeeByAgeAndEmpName(age, name);
		if (response == null || response.isEmpty()) {
			return Collections.emptyList();
		}
		return response;
	}

	@Override
	public String deleteEmployee(Integer id) {
		Employee employee = getEmployee(id);
//		employeeRepository.delete(employee);
		employeeRepository.deleteById(id);
		return "Employee deleted successfully";
	}

	@Override
	public String updateEmployeesByNameById(Integer id, String name) {
		Employee employee = getEmployee(id);

		if (name != null && !name.isEmpty()) {
			employee.setEmpName(name); // ABC --> XYZ
		}

		employeeRepository.save(employee);

		return "Employee updated successfully";
	}

	@Override
	public EmployeeResponse updateEmployeesByNameByIdDetails(Integer id, String name) {
		Employee employee = getEmployee(id);

		if (name != null && !name.isEmpty()) {
			employee.setEmpName(name); // ABC --> XYZ
		}

		Employee updatedEmployee = employeeRepository.save(employee);
		EmployeeResponse response = new EmployeeResponse();
		response.setEmpId(updatedEmployee.getEmpId());
		response.setEmpName(updatedEmployee.getEmpName());
		response.setAge(updatedEmployee.getAge());
		response.setGender(updatedEmployee.getGender());
		response.setStatus(updatedEmployee.getStatus());
		response.setStatusCode("200");
		response.setMessage("Employee updated successfully");
		return response;
	}
}
