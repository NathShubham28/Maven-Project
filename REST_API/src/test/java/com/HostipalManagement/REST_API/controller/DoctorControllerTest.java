package com.HostipalManagement.REST_API.controller;

import static org.junit.Assert.*;
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

import com.HostipalManagement.REST_API.Repository.DoctorsRepository;
//import com.HostipalManagement.REST_API.controller.DoctorController;
import com.HostipalManagement.REST_API.model.Doctors;
import com.HostipalManagement.REST_API.service.DoctorService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class DoctorControllerTest {
	
	@MockBean
	private DoctorService doctorService;
	
	Doctors doc1 = new Doctors();
	
	@Autowired
	private DoctorController controller;
	
	@Autowired
	private DoctorsRepository doctorRepository;
	
	@Test
	public void contextLoads() throws Exception {
		Assert.assertNotNull(controller);
	}
	
	@Test
	public void getAllDoctorsTest() {
//		Doctors doc1 = new Doctors();
		doc1.setId(1);
		doc1.setAge(23);
		doc1.setName("Shubham Nath");
		doc1.setGender("Male");
		doc1.setSpecialization("Dentist");
		when(this.doctorService.findAll()).thenReturn(Stream.of(doc1).collect(Collectors.toList()));
		assertEquals(1,this.doctorService.findAll().size());
	}

	
	@Test
	public void testaddDoctor() {
		doc1.setId(10);
		doc1.setAge(23);
		doc1.setName("Shubham Nath");
		doc1.setGender("Male");
		doc1.setSpecialization("Dentist");
		doctorRepository.save(doc1);
		Assert.assertNotNull(doctorRepository.findById(10));
	}
	
}
