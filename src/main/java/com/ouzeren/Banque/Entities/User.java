package com.ouzeren.Banque.Entities;

import java.util.List;

import jakarta.persistence.Entity;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User  extends AbstractEntity{



	private String firstname;

	private String lastname;

	private String email;

	private boolean active;


	@OneToMany(mappedBy = "user") 
	private List<Transaction> transactions;
	
	@OneToMany(mappedBy = "user")
	private List<Contact> contacts;

	@OneToOne
	private Account account;

	@OneToOne
	private Adress adresse;

	@OneToOne
	private Role role;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}



	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;

}
