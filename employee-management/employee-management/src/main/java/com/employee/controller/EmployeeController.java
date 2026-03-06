package com.employee.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.config.BeanApplicationConfig;
import com.employee.dto.EmployeeResponse;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

//@RequiredArgsConstructor
@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private final EmployeeService empService;

	private final BeanApplicationConfig beanConfig;

	public EmployeeController(EmployeeService empService, BeanApplicationConfig beanConfig) {
		this.empService = empService;
		this.beanConfig = beanConfig;
	}

	// http://localhost:8080/employees/hello
	@GetMapping("/hello")
	public String hello() {
		String res = beanConfig.sampleBean();
		System.out.println(res);
		return "Hello, Employee Management!";

	}

	// http://localhost:8080/employees/hi
	@GetMapping("/hi")
	public String hi() {
		return "Hi, Welcome";
	}

	@PostMapping("/save")
	public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
		String response = empService.saveEmployee(employee);
		if (response != null) {
			return ResponseEntity.ok(response);
//			return ResponseEntity.status(HttpStatus.OK).body("Employee created successfully");
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create employee");
		}
	}

	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employees = empService.getAllEmployees();
		return ResponseEntity.ok(employees);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id) {
		Employee employees = empService.getEmployee(id);
		return ResponseEntity.ok(employees);
	}

	@GetMapping("/id")
	public ResponseEntity<Employee> getEmployeeById(@RequestParam("id") Integer id) {
		Employee employees = empService.getEmployee(id);
		return ResponseEntity.ok(employees);
	}

	@GetMapping("/data/{age}/{name}")
	public ResponseEntity<List<Employee>> getEmployeesByAgeAndName(@PathVariable("age") Integer age,
			@PathVariable("name") String name) {
		List<Employee> employees = empService.getEmployeesByAgeAndName(age, name);
		return ResponseEntity.ok(employees);
	}

	@GetMapping("/data/{age}")
	public ResponseEntity<List<Employee>> getEmployeesByAgeAndNameData(@PathVariable("age") Integer age,
			@RequestParam("name") String name) {
		List<Employee> employees = empService.getEmployeesByAgeAndName(age, name);
		return ResponseEntity.ok(employees);
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") Integer id) {
		String employees = empService.deleteEmployee(id);
		return ResponseEntity.ok(employees);
	}

	@PutMapping("/update/{id}/{name}")
	public ResponseEntity<String> updateEmployeesByNameById(@PathVariable("id") Integer id,
			@PathVariable("name") String name) {
		String employees = empService.updateEmployeesByNameById(id, name);
		return ResponseEntity.ok(employees);
	}

	@PutMapping("/update/data/{id}/{name}")
	public ResponseEntity<EmployeeResponse> updateEmployeesByNameByIdDetails(@PathVariable("id") Integer id,
			@PathVariable("name") String name) {
		EmployeeResponse employees = empService.updateEmployeesByNameByIdDetails(id, name);
		return ResponseEntity.ok(employees);
	}
}
