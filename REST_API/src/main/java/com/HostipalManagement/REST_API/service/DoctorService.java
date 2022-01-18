package com.HostipalManagement.REST_API.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HostipalManagement.REST_API.Repository.DoctorsRepository;
import com.HostipalManagement.REST_API.model.Doctors;
@Service
public class DoctorService {
	
	@Autowired
	private DoctorsRepository doctorRepository;
	
	public Doctors save(Doctors doctor) {
		// TODO Auto-generated method stub
		
		return doctorRepository.save(doctor);
	}

	public List<Doctors> findAll() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	public Doctors findById(int i) {
		// TODO Auto-generated method stub
		
		return doctorRepository.findById(1);
	}
	
}
