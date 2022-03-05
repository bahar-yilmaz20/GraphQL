package com.example.graphqlDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.graphqlDemo.entity.Doctors;

public interface DoctorsRepository extends JpaRepository<Doctors,Long>{

}
