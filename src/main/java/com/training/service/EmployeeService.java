package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.repo.EmployeeRepo;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepo repo;
	
	
	
}
