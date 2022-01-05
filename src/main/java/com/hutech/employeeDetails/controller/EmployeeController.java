package com.hutech.employeeDetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hutech.employeeDetails.entity.EmployeeDetail;
import com.hutech.employeeDetails.service.EmployeeService;

@RestController
@RequestMapping("/info")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employeeDetails")
	public List<EmployeeDetail> getAllEmployeeDetails() {
		return employeeService.getAllEmployeeDetails();
	}

	@GetMapping("/employeeDetails/{id}")
	public Optional<EmployeeDetail> getEmployeeDetailById(@PathVariable(value = "id") Long id) {
		return employeeService.getEmployeeDetailById(id);
	}

	@PostMapping("/employeeDetails")
	public String addEmployeeDetails(@RequestBody EmployeeDetail emp) {
		employeeService.addEmployeeDetails(emp);
		return "Employee details added successfully";
	}

	@PutMapping("/updateemployee/{id}")
	public String updateEmployeeDetail(@RequestBody EmployeeDetail employeedetails, @PathVariable Long id) {
		employeeService.UpdateEmployeeDetail(id, employeedetails);
		return "Employee Detail Updated successfully.";

	}

	@DeleteMapping("/deleteemployee/{id}")
	public String deleteEmployeeDetail(@PathVariable long id) {
		employeeService.deleteEmployeeDetail(id);	
		return "Employee Detail Deleted successfully.";
	}
}
