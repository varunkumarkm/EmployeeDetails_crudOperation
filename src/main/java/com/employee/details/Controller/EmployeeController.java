package com.employee.details.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employee.details.Entity.EmployeeDetails;
import com.employee.details.Service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Employee/data")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/create")
	public void createEmployee(@Valid @RequestBody EmployeeDetails employeeDetails) {
		employeeService.save(employeeDetails);
	}
	@GetMapping("/getEmployeeDetails")
	public List<EmployeeDetails> getAllEmployees(EmployeeDetails employeeDetails){
		List<EmployeeDetails> employees = employeeService.findAll();
		return employees;
	}
	@PutMapping("/updateEmployee")
	public void updateEmployee(@RequestBody EmployeeDetails employeeDetails) {
		employeeService.save(employeeDetails);
	}
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable long id) {
		employeeService.deleteById(id);
	}
}
