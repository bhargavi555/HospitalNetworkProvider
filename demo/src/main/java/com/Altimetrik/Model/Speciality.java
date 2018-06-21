package com.Altimetrik.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Speciality {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private String id;

	@Column(name = "name", nullable = false)
	private String specialityName;

	@OneToMany
	@JoinColumn(name = "hosp_Id", nullable = false)
	private Hospital hospitals;

}
