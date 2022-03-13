package com.example.graphqlDemo.dto;


import com.example.graphqlDemo.entity.Doctors;
import com.example.graphqlDemo.entity.Patients;
import com.example.graphqlDemo.entity.Profession;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TreatmentsDto {
	public Doctors doctor;
	public Patients patient;
	public String disease;
	public String description;
	public String medicine;

}
