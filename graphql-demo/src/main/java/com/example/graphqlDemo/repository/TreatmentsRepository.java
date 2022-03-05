package com.example.graphqlDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.graphqlDemo.entity.Treatment;;

public interface TreatmentsRepository extends JpaRepository<Treatment,Long> {

}
