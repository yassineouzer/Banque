package com.ouzeren.Banque.Entities;

import java.math.BigDecimal;




import java.time.LocalDateTime;



import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;




@Entity
@Table(name="transactions")
public class Transaction extends AbstractEntity{

   
	
	private BigDecimal amount;
	
	private String destinationIban;
	
    @Enumerated(EnumType.STRING)
	private TransactionType  type;
	
	private LocalDateTime dateCreation;
	
	private LocalDateTime  lastUpdated;

	  @ManyToOne
	  @JoinColumn(name="id_user") 
	  private User user;
	 
	
	


	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getDestinationIban() {
		return destinationIban;
	}

	public void setDestinationIban(String destinationIban) {
		this.destinationIban = destinationIban;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public LocalDateTime getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDateTime dateCreation) {
		this.dateCreation = dateCreation;
	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	
	
}
