package com.ouzeren.Banque.Entities;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {

	
	
	@Id
	@GeneratedValue
	private Integer id;
	
	
	private LocalDateTime creationDate;
	
	private LocalDateTime  lastUpdated;
}
