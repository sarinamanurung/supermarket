package com.eksad.supermarket.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.criteria.Fetch;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "transaction")

public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	TemporalType menyeleksi yang akan di simpan ke dalam database apakah waktu, hari dll
	
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	
	private Date date;
	
	private String remark;
	
//	EqualsAndHashCode standar implementasi, hashcode hasil perhitungan dari value
	
	@EqualsAndHashCode.Exclude
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "transaction",
				fetch = FetchType.LAZY)
		
		
	private Set<TransactionDetail> details;
	
	
	
	

}
