package com.ouzeren.Banque.Entities;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends AbstractEntity{

	

	private String nom;

	@OneToOne
	@JoinColumn(name = "id_user")
	private User user;

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
