package com.HostipalManagement.REST_API.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HostipalManagement.REST_API.Repository.PatientsRepository;
import com.HostipalManagement.REST_API.model.Doctors;
import com.HostipalManagement.REST_API.model.Patients;

@Service
public class PatientService {
	
	@Autowired
	private PatientsRepository patientRepository;
	
	public Patients getOnePatient(int id) {
		// TODO Auto-generated method stub
		return patientRepository.findById(id);
	}

	public int countPatientByDoctor(int dID) {
		// TODO Auto-generated method stub
		int count = 0;
			List<Patients> patient = this.patientRepository.findAll();
			for(int i = 0; i<patient.size(); i++) {
				Doctors check = patient.get(i).getDoctor();
				if(check.getId()== dID) count++;
			}
		return count;
	}

	public Patients save(Patients patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	public List<Patients> findAll() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	public Patients findById(int i) {
		// TODO Auto-generated method stub
		return patientRepository.findById(i);
	}
	

}
