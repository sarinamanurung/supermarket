package com.eksad.supermarket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.eksad.supermarket.entity.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter @Setter
//@EqualsAndHashCode

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = "brand")
public class Brand extends BaseEntity{
	
// lombok untuk melihat otomatis codingan yang dibikin
	
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	@EqualsAndHashCode.Include
	
	
	@Column(nullable = false)
	private String name;
	
	@Column(name = "product_type")
	private String productType;
		
	

	
}
