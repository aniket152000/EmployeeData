package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeeEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="shortrofile")
	private String short_profile;
	
	@Column(name="longprofile")
	private String long_profile;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="doj")
	private String doj;
	
	@Column(name="location")
	private String location;
	
	@Column(name="salary")
	private String salary;
	
	@Column(name="shift")
	private String shift;
	
	@Column(name="acedemics")
	private String acedemics;
	
	@Column(name="experience")
	private String experience;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contactno")
	private Integer contactno;
	
	public EmployeeEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeEntity(Integer id, String name, String designation, String short_profile, String long_profile,
			String dob, String doj, String location, String salary, String shift, String acedemics, String experience,
			String address, String email, Integer contactno) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.short_profile = short_profile;
		this.long_profile = long_profile;
		this.dob = dob;
		this.doj = doj;
		this.location = location;
		this.salary = salary;
		this.shift = shift;
		this.acedemics = acedemics;
		this.experience = experience;
		this.address = address;
		this.email = email;
		this.contactno = contactno;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getShort_profile() {
		return short_profile;
	}
	public void setShort_profile(String short_profile) {
		this.short_profile = short_profile;
	}
	public String getLong_profile() {
		return long_profile;
	}
	public void setLong_profile(String long_profile) {
		this.long_profile = long_profile;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getAcedemics() {
		return acedemics;
	}
	public void setAcedemics(String acedemics) {
		this.acedemics = acedemics;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getContactno() {
		return contactno;
	}
	public void setContactno(Integer contactno) {
		this.contactno = contactno;
	}
	
	
	
	
	
	
}
