package com.HostipalManagement.REST_API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.HostipalManagement.REST_API.Repository.DoctorsRepository;
//import com.HostipalManagement.REST_API.Repository.PatientsRepository;
import com.HostipalManagement.REST_API.model.Doctors;
//import com.HostipalManagement.REST_API.model.Patients;
import com.HostipalManagement.REST_API.service.DoctorService;
import com.HostipalManagement.REST_API.service.PatientService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {
//	@Autowired
//	private DoctorsRepository doctorRepository;
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private PatientService patientService;
	@GetMapping("/doctors")
	public List<Doctors> getAllDoctors(){
		return doctorService.findAll();
	}
	
	@PostMapping("/add-doctor")
	public Doctors addDoctor(@RequestBody Doctors doctor) {
		return doctorService.save(doctor);
		
	}
	
	@GetMapping(value="/doctors/countPatient/{dId}")
	public int countPatients(@PathVariable int dId){
		int count = this.patientService.countPatientByDoctor(dId);
		return count;
	}
}
