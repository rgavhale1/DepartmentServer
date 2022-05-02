package com.department.server;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	Logger logger = LoggerFactory.getLogger(DepartmentController.class);

	/*
	 * @Bean Sampler defaultSampler() { return Sampler.ALWAYS_SAMPLE; }
	 */

	@PostMapping(path = "/save", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	ResponseEntity<Long> saveDepartmentDeatils(@RequestBody Department department) {
		Department SavedDepartment = departmentService.saveDepartmentDetails(department);
		return new ResponseEntity<>(SavedDepartment.getId(), HttpStatus.OK);
	}

	@GetMapping(path = "/get/{departmentId}")
	ResponseEntity<Department> getDeparmentById(@PathVariable("departmentId") Long id) {
		logger.info("inside getDeparmentById method ");

		Optional<Department> deaprtment = departmentService.getDeparmentById(id);
		if (deaprtment.isPresent()) {
			return new ResponseEntity<>(deaprtment.get(), HttpStatus.OK);

		} else {
			throw new NullPointerException();
		}

	}

}
