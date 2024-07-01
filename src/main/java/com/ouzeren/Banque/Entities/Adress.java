package com.ouzeren.Banque.Entities;

import jakarta.persistence.Entity;


import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="adresses")
public class Adress extends AbstractEntity{

	
	
	private String street;
	
	private Integer houseNumber;
	
	private Integer zipCode;
	
	private String city;
	
	private String country;
	
	
	@OneToOne
	@JoinColumn(name="id_user")
	private User user;



	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
