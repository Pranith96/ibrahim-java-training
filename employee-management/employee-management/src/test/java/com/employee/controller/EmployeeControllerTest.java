package com.employee.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.employee.config.BeanApplicationConfig;
import com.employee.dto.EmployeeResponse;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

class EmployeeControllerTest {

	private MockMvc mockMvc;

	@Mock
	private EmployeeService empService;

	@Mock
	private BeanApplicationConfig beanConfig;

	@InjectMocks
	private EmployeeController employeeController;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
	}

	@Test
	void testHello() throws Exception {
		when(beanConfig.sampleBean()).thenReturn("Sample Bean Response");

		mockMvc.perform(get("/employees/hello")).andExpect(status().isOk())
				.andExpect(content().string("Hello, Employee Management!"));
	}

	@Test
	void testHi() throws Exception {
		mockMvc.perform(get("/employees/hi")).andExpect(status().isOk()).andExpect(content().string("Hi, Welcome"));
	}

	@Test
	void testCreateEmployee_Success() throws Exception {
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setEmpName("John");
		employee.setAge(30);

		when(empService.saveEmployee(any(Employee.class))).thenReturn("Employee created successfully");

		mockMvc.perform(post("/employees/save").contentType(MediaType.APPLICATION_JSON)
				.content("{\"id\":1,\"name\":\"John\",\"age\":30}")).andExpect(status().isOk())
				.andExpect(content().string("Employee created successfully"));
	}

	@Test
	void testGetAllEmployees() throws Exception {
		Employee employee1 = new Employee();
		employee1.setEmpId(1);
		employee1.setEmpName("John");
		employee1.setAge(30);

		Employee employee2 = new Employee();
		employee2.setEmpId(2);
		employee2.setEmpName("Jane");
		employee2.setAge(25);

		List<Employee> employees = Arrays.asList(employee1, employee2);
		when(empService.getAllEmployees()).thenReturn(employees);

		mockMvc.perform(get("/employees")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(2));
	}

	@Test
	void testGetEmployeeById() throws Exception {
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setEmpName("John");
		employee.setAge(30);

		when(empService.getEmployee(1)).thenReturn(employee);

		mockMvc.perform(get("/employees/1")).andExpect(status().isOk()).andExpect(jsonPath("$.empId").value(1))
				.andExpect(jsonPath("$.empName").value("John"));
	}

	@Test
	void testCreateEmployee_Failure() throws Exception {
		when(empService.saveEmployee(any(Employee.class))).thenReturn(null);

		mockMvc.perform(post("/employees/save").contentType(MediaType.APPLICATION_JSON)
				.content("{\"id\":1,\"name\":\"John\",\"age\":30}")).andExpect(status().isInternalServerError())
				.andExpect(content().string("Failed to create employee"));
	}

	@Test
	void testDeleteEmployee() throws Exception {
		when(empService.deleteEmployee(1)).thenReturn("Employee deleted successfully");

		mockMvc.perform(delete("/employees/remove/1")).andExpect(status().isOk())
				.andExpect(content().string("Employee deleted successfully"));
	}

	@Test
	void testUpdateEmployeeById() throws Exception {
		when(empService.updateEmployeesByNameById(1, "John")).thenReturn("Employee updated successfully");

		mockMvc.perform(put("/employees/update/1/John")).andExpect(status().isOk())
				.andExpect(content().string("Employee updated successfully"));
	}

	@Test
	void testGetEmployeeByIdWithRequestParam() throws Exception {
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setEmpName("John");
		employee.setAge(30);

		when(empService.getEmployee(1)).thenReturn(employee);

		mockMvc.perform(get("/employees/id").param("id", "1")).andExpect(status().isOk())
				.andExpect(jsonPath("$.empId").value(1)).andExpect(jsonPath("$.empName").value("John"))
				.andExpect(jsonPath("$.age").value(30));
	}

	@Test
	void testGetEmployeesByAgeAndName() throws Exception {
		Employee employee1 = new Employee();
		employee1.setEmpId(1);
		employee1.setEmpName("John");
		employee1.setAge(30);

		Employee employee2 = new Employee();
		employee2.setEmpId(2);
		employee2.setEmpName("Jane");
		employee2.setAge(30);

		List<Employee> employees = Arrays.asList(employee1, employee2);

		when(empService.getEmployeesByAgeAndName(30, "John")).thenReturn(employees);

		mockMvc.perform(get("/employees/data/30/John")).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(2)).andExpect(jsonPath("$[0].empId").value(1))
				.andExpect(jsonPath("$[0].empName").value("John")).andExpect(jsonPath("$[1].empId").value(2))
				.andExpect(jsonPath("$[1].empName").value("Jane"));
	}

	@Test
	void testGetEmployeesByAgeAndNameData() throws Exception {
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setEmpName("John");
		employee.setAge(30);

		List<Employee> employees = List.of(employee);

		when(empService.getEmployeesByAgeAndName(30, "John")).thenReturn(employees);

		mockMvc.perform(get("/employees/data/30").param("name", "John")).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].empId").value(1))
				.andExpect(jsonPath("$[0].empName").value("John")).andExpect(jsonPath("$[0].age").value(30));
	}

	@Test
	void testUpdateEmployeesByNameByIdDetails() throws Exception {
		EmployeeResponse response = new EmployeeResponse();
		response.setEmpId(1);
		response.setEmpName("John");
		response.setStatus("Updated");

		when(empService.updateEmployeesByNameByIdDetails(1, "John")).thenReturn(response);

		mockMvc.perform(put("/employees/update/data/1/John")).andExpect(status().isOk())
				.andExpect(jsonPath("$.empId").value(1)).andExpect(jsonPath("$.empName").value("John"))
				.andExpect(jsonPath("$.status").value("Updated"));
	}

}
