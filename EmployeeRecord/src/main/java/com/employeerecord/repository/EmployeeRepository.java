package com.employeerecord.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeerecord.entity.EmployeeEntity;

@Repository
public interface  EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
	
	
}
