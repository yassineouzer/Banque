package com.ouzeren.Banque.Entities;




import jakarta.persistence.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;




@Entity
@Table(name="accounts")
public class Account extends AbstractEntity {
	
	


	
	private String iban;
	

	
	
	@OneToOne
	@JoinColumn(name="id_user")
	private User user;



	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}



	
	

}
