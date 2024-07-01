package com.ouzeren.Banque.Entities;




import jakarta.persistence.Entity;


import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact  extends  AbstractEntity{

	
	

	private String firstname;
	
	private String lastname;
	
	private String  email;
	
	private String iban;
	
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;



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

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	
}
