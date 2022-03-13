package com.example.graphqlDemo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqlDemo.entity.Doctors;
import com.example.graphqlDemo.repository.DoctorsRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DoctorsQueryResolver implements GraphQLQueryResolver{

	@Autowired
	private DoctorsRepository doctorsRepository;
	
	public List<Doctors> getDoctors(){
		return doctorsRepository.findAll();
	}
}
