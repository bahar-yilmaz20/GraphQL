package com.example.graphqlDemo.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqlDemo.entity.Patients;
import com.example.graphqlDemo.repository.PatientRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PatientsQueryResolver implements GraphQLQueryResolver  {
	
	@Autowired
	private PatientRepository patientsRepository;
	
	public List<Patients> getPatients(Long idPatients){
		return patientsRepository.getByIdPatients(idPatients);
	}
	
	public List<Patients> getById(){
		return patientsRepository.findAll();
	}
	
}
