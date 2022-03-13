package com.example.graphqlDemo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor

public class Profession {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long idProfession;
	public String nameOfProfession;
	
}
