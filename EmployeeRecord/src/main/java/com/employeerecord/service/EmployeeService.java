package com.employeerecord.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeerecord.entity.EmployeeEntity;
import com.employeerecord.repository.EmployeeRepository;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepository emprepo;

	


	

	public EmployeeEntity addEmployee(EmployeeEntity emp) {
	
		return emprepo.save(emp);
	}


	public List<EmployeeEntity> print() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}


	
}
