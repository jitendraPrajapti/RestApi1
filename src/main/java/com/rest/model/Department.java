package com.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data 
@Entity
@Table(name="Department") 
public class Department {
	
	@Id
	@GeneratedValue
	private Integer did;
	@Column(name="city")
	private String City;
	@Column(name="state")
	private String  state;
	@Column(name="ZipCode")
	private String ZipCode;

}
