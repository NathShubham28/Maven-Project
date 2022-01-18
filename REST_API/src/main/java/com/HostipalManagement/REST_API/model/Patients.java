package com.HostipalManagement.REST_API.model;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="patients")
public class Patients {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="date_of_visit")
	private String dateOfVisit;
	
	@ManyToOne
	@JoinColumn(name="visited_doctor", referencedColumnName = "id")
	private Doctors doctor;
	
	public Patients() {
//		super();
	}

	
	public Patients(String name, String dateOfVisit, Doctors doctor) {
		super();
		this.name = name;
		this.dateOfVisit = dateOfVisit;
		this.doctor = doctor;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	public Doctors getDoctor() {
		return doctor;
	}
}
