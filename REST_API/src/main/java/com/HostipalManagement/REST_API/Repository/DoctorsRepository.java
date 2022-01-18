package com.HostipalManagement.REST_API.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HostipalManagement.REST_API.model.Doctors;

@Repository
public interface DoctorsRepository extends JpaRepository<Doctors, Integer> {
	
	Doctors save(Doctors doctor);
	
	List<Doctors> findAll();
	
	Doctors findById(int id);
}
