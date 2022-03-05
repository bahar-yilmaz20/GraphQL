package com.example.graphqlDemo.dto;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PatientsDto {
	public String name;
	public String surname;
	public String tcNo;
	public String bloodType;
}
