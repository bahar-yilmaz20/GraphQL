package com.example.graphqlDemo.api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphqlDemo.dto.PatientsDto;
import com.example.graphqlDemo.entity.Patients;
import com.example.graphqlDemo.repository.PatientRepository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PatientsMutationResolver implements GraphQLMutationResolver {

	//@Autowired
	private final PatientRepository patientsRepository;
	
	public Patients createPatients(PatientsDto patientsDTO)
	{
		return patientsRepository.save(dtoTOEntity(patientsDTO));
	}
	private Patients dtoTOEntity(PatientsDto patientsDTO)
	{
		Patients patient= new Patients();
		patient.setName(patientsDTO.getName());
		patient.setSurname(patientsDTO.getSurname());
		patient.setTcNo(patientsDTO.getTcNo());
		patient.setBloodType(patientsDTO.getBloodType());
		return patient;
	}
}
