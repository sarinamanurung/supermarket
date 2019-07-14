package com.eksad.supermarket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;


@Data
@Entity
@Table (name = "person_address")
public class PersonAddress {
	
	@Id
	@Column(name = "person_id")
	private Long id;
	
	@ToString.Exclude
	@OneToOne
	@MapsId
	private Person person;
	
	@Column(nullable = false)
	private String address;
	
	private String city;
	
}
