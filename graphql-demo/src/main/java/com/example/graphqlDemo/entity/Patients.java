package com.example.graphqlDemo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="patients")
@Getter
@Setter
@NoArgsConstructor
public class Patients implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long idPatients;
	public String name;
	public String surname;
	public String tcNo;
	public String bloodType;
}
