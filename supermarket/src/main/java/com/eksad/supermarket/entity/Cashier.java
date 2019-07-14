package com.eksad.supermarket.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

//	jika  descriminator value namanya sama bida tidak menggunakan discriminator tetapi jika berbeda maka diperlukan discriminator


@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@DiscriminatorValue("Cashier")
public class Cashier extends Person {
	
	private String shift;

}
