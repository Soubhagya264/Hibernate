package com.tut;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String street;
	private String City;
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", City=" + City + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public Address(int id, String street, String city) {
		super();
		this.id = id;
		this.street = street;
		this.City = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
