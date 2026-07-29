package com.athletestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.athletestate.model.Athlete;

public interface AthleteRepository extends JpaRepository<Athlete,Integer> {

    
}