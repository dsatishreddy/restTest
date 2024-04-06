package com.example.sathishCode.restTest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RestContoller {

	Employee employee;

	/*
	 * @GetMapping public String hello() { return "hello"; }
	 */

	/*
	 * @GetMapping("{id}") public Employee getEmployeeDetails(String empID) { return
	 * new Employee("1", "Sathish", "Marteru", "12345");
	 * 
	 * }
	 */

	@GetMapping("{id}")
	public Employee getEMployeeDetail(String empID) {
		return employee;
	}

	@PostMapping
	public String createEmployeeDetails(@RequestBody Employee employee) {
		this.employee = employee;
		return "Employee added successfully";
	}

	@PutMapping
	public String updateEmployeeDetails(@RequestBody Employee employee) {
		this.employee = employee;
		return "Employee updated successfully";
	}

	@DeleteMapping("{empID}")
	public String deleteEmployeeDetails(String empID) {
		this.employee = null;
		return "Employee Deleted successfully";
	}

}
