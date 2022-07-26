package com.tut;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mystudents")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressId;
	private String name;
	private Certificate certi;
	public Student(int id, int addressId, String name, Date dob, byte[] image) {
		super();
		this.id = id;
		this.addressId = addressId;
		this.name = name;
		this.dob = dob;
		this.image = image;
	}
	public Student(int id, int addressId, String name, Certificate certi, Date dob, byte[] image) {
		super();
		this.id = id;
		this.addressId = addressId;
		this.name = name;
		this.certi = certi;
		this.dob = dob;
		this.image = image;
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	private Date dob;
	private byte[] image;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public Student(int id, String name, Date dob, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.image = image;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", addressId=" + addressId + ", name=" + name + ", certi=" + certi + ", dob=" + dob
				+ ", image=" + Arrays.toString(image) + "]";
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
	
	
	

}
