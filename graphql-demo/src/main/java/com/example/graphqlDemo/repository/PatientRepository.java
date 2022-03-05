package com.example.graphqlDemo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.graphqlDemo.entity.Patients;

public interface PatientRepository extends JpaRepository<Patients,Long>{

	List<Patients> getByIdPatients(Long idPatients);


}
