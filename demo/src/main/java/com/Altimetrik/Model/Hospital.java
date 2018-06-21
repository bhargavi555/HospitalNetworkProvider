package com.Altimetrik.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class Hospital {

	public Hospital() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private String id;

	@Column(name = "name", nullable = false)
	private String hospitalName;

	@OneToMany
	@JoinColumn(name = "physician_Id", nullable = false)
	private Physician physicians;
	
	@OneToMany
	@JoinColumn(name = "speciality_Id", nullable = false)
	private Speciality specialities;

}
