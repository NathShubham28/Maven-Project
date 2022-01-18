package com.HostipalManagement.REST_API.controller;
//package org.junit;
import org.junit.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import com.HostipalManagement.REST_API.controller.PatientController;
//import com.HostipalManagement.REST_API.Repository.PatientsRepository;
//import com.HostipalManagement.REST_API.model.Doctors;
import com.HostipalManagement.REST_API.model.Patients;
import com.HostipalManagement.REST_API.service.PatientService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class PatientControllerTest {
	
	@Autowired
	private PatientController controller;
	@MockBean
	private PatientService patientService;
	
	@Test
	public void contextLoads() throws Exception {
		Assert.assertNotNull(null, controller);
	}
	
	@Test
	public void getAllPatientsTest() {
		Patients patient = new Patients();
		patient.setId(1);
		patient.setDateOfVisit("12-03-2020");
		patient.setName("Shubham Nagar");
		
		when(patientService.findAll()).thenReturn(Stream.of(patient).collect(Collectors.toList()));
		assertEquals(1,patientService.findAll().size());
	}
	
}
