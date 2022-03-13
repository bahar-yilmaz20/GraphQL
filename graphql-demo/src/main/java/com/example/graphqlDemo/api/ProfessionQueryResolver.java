package com.example.graphqlDemo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqlDemo.entity.Profession;
import com.example.graphqlDemo.repository.ProfessionRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProfessionQueryResolver implements GraphQLQueryResolver{

	@Autowired 
	private ProfessionRepository professionRepository;
	
	public List<Profession> getAllProfession(){
		return professionRepository.findAll();
	}
}
