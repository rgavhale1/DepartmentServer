package com.department.server;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;
	
	public Department saveDepartmentDetails(Department department) {
		return departmentRepository.save(department);
	}

	public Optional<Department> getDeparmentById(Long id) {
		return 	departmentRepository.findById(id);
		
	}

}
