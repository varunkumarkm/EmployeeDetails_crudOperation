package com.employee.details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.details.Entity.EmployeeDetails;
import com.employee.details.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void save(EmployeeDetails employeeDetails) {
		employeeRepository.save(employeeDetails);
	}

	public List<EmployeeDetails> findAll() {
		List<EmployeeDetails> employees = employeeRepository.findAll();
		return employees;
	}

	public void deleteById(long id) {
		employeeRepository.deleteById(id);
	}

}
