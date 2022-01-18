package com.HostipalManagement.REST_API.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="doctors")
public class Doctors {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="age")
	private int age;
	
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
	@Column(name="specialization")
	private String specialization;
	@JsonIgnore
	@OneToMany(mappedBy="doctor")
	private List<Patients> patient;

	public Doctors() {
//		super();
	}
	
	public Doctors(int age, String name, String gender, String specialization) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.specialization = specialization;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "Doctors [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", specialization="
				+ specialization + "]";
	}
	
	public List<Patients> getPatient() {
		
		return patient;
	}
}
