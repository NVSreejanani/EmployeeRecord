package com.employeerecord.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeerecord.entity.EmployeeEntity;
import com.employeerecord.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService empser;
	

	@PostMapping("/add")
  public EmployeeEntity addDetails(@RequestBody EmployeeEntity emp) {
		return empser.addEmployee(emp);
		
	}
	
	@GetMapping("/getEmp")
	public List<EmployeeEntity> printEmp(){
		return empser.print();
		
	}
}
