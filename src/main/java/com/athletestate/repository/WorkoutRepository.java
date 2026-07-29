package com.athletestate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.athletestate.model.Workout;

public interface WorkoutRepository extends JpaRepository<Workout,Integer> {

    List<Workout>findByAthleteId(Integer athleteId);

    List<Workout>findByFocusArea(String focusArea);
    
} 
    
 
