package com.ouzeren.Banque.Entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User  extends AbstractEntity{


    @NotNull(message ="le prenom ne doit pas etre vide")
    @NotBlank(message ="le prenom ne doit pas etre null")
    @NotEmpty
	private String firstname;
    
    
    @NotNull
    @NotBlank
    @NotEmpty(message ="le prenom ne doit pas etre null")
	private String lastname;
     
    
    @NotNull
    @NotBlank
    @NotEmpty
    @Email
	private String email;

    
    
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min =8 ,max = 12 )
	private String password;
	
	
	private boolean active;

	@Past
	private LocalDateTime birthdate; 

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



}
