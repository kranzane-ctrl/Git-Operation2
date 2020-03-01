package com.app.pojo;

public class Employee {

	private int id;
	private String name;
	private String city;
	private String clg;
	private Long phone;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String city, String clg, Long phone) {
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
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", clg=" + clg + ", phone=" + phone + "]";
	}

}
