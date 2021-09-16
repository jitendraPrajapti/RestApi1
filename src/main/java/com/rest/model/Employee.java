package com.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EmpDetails")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="eid")
	private Integer eid;
	@Column(name="ename")
	private String ename;
	@Column(name="esal")
	private String esal;
	@Column(name="dert")
	private String dert;
	@Column(name="addrs")
	private String addrs;

}
