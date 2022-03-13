package com.example.graphqlDemo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
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

public class Doctors implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long idDoctors;
	public String name;
	public String surname;
	
	@OneToOne
	public Profession profession;
	
	public String college;
	public int experience;
	public String tcNo;

}
