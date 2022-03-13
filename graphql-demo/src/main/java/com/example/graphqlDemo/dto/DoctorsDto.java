package com.example.graphqlDemo.dto;



import com.example.graphqlDemo.entity.Profession;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class DoctorsDto {

	public String name;
	public String surname;
	public Profession profession;
	public String college;
	public int experience;
	public String tcNo;
}
