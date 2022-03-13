package com.example.graphqlDemo.api;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphqlDemo.dto.DoctorsDto;
import com.example.graphqlDemo.dto.ProfessionDto;
import com.example.graphqlDemo.entity.Doctors;
import com.example.graphqlDemo.entity.Profession;
import com.example.graphqlDemo.repository.DoctorsRepository;
import com.example.graphqlDemo.repository.ProfessionRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DoctorsMutationResolver implements GraphQLMutationResolver  {
	
	private final DoctorsRepository doctorsRepository;
	
	private final ProfessionRepository professionRepository;
	
	public Doctors createDoctors(DoctorsDto doctorDTO)
	{
		return doctorsRepository.save(dtoTOEntity(doctorDTO));
	}
	private Doctors dtoTOEntity(DoctorsDto doctorDTO)
	{
		Doctors doctor= new Doctors();
		doctor.setName(doctorDTO.getName());
		doctor.setSurname(doctorDTO.getSurname());
		doctor.setTcNo(doctorDTO.getTcNo());
		doctor.setCollege(doctorDTO.getCollege());
		doctor.setExperience(doctorDTO.getExperience());
		doctor.setProfession(dtoToEntityProfession(doctorDTO.getProfession()));
		return doctor;
	}
	private Profession dtoToEntityProfession(Profession professionDto)
	{
		Profession profession=professionRepository.getByNameOfProfession(professionDto.getNameOfProfession());
		if(profession==null)
		{
			Profession profession1=new Profession();
			profession1.setNameOfProfession(professionDto.getNameOfProfession());
			professionRepository.save(profession1);
			return profession1;
		}
		else {
			return profession;
		}
			
	}
	
	
}
