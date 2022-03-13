package com.example.graphqlDemo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqlDemo.entity.Treatment;
import com.example.graphqlDemo.repository.TreatmentsRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TreatmentsQueryResolver implements GraphQLQueryResolver{
	
	@Autowired
	private TreatmentsRepository treatmentsRepository;
	
	public List<Treatment> getAllTreatments()
	{
		return treatmentsRepository.findAll();
	}

}
