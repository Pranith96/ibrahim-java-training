package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findEmployeeByAgeAndEmpName(Integer age, String name);
	
	@Query("Select e from Employee e where e.age=?1 and e.empName=?2")
	List<Employee> getEmployeeByAgeAndEmpName(Integer age, String name);
	
	@Query("Select e from Employee e where e.age=:age and e.empName=:name")
	List<Employee> getEmployeeByAgeAndEmpName1(Integer age, String name);
	
	@Query(value = "Select * from employees where age=:age and emp_name=:name", nativeQuery = true)
	List<Employee> getEmployeeByAgeAndEmpNameSql(Integer age, String name);
	
	@Query(value = "Select * from employees where age=?1 and emp_name=?2", nativeQuery = true)
	List<Employee> getEmployeeByAgeAndEmpNameSql1(Integer age, String name);

}
