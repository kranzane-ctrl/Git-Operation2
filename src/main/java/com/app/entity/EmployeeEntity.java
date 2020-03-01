package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_GIT_TBL")
@SequenceGenerator(name = "EMPLOYEE_GIT_SEQ", initialValue =1, allocationSize = 1) 
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEE_GIT_SEQ")
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "CITY")
	private String city;

	@Column(name = "CLG")
	private String clg;

	@Column(name = "PHONE")
	private Long phone;

	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(int id, String name, String city, String clg, Long phone) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.clg = clg;
		this.phone = phone;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", city=" + city + ", clg=" + clg + ", phone=" + phone
				+ "]";
	}

}
