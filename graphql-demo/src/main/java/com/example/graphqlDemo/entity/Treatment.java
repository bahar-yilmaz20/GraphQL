package com.example.graphqlDemo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Treatment implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long idTreatment;
	
	@OneToOne
	public Doctors doctor;
	@OneToOne
	public Patients patient;	
	public String disease;
	public String description;
	public String medicine;
	
	

}
