package com.example.graphqlDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.graphqlDemo.entity.Profession;

public interface ProfessionRepository extends JpaRepository<Profession,Long> {

}
