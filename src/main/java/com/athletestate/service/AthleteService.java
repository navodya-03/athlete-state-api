package com.athletestate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.athletestate.model.Athlete;
import com.athletestate.repository.AthleteRepository;

@Service
public class AthleteService {

    private final AthleteRepository athleteRepository;

    public AthleteService(AthleteRepository athleteRepository){
        this.athleteRepository = athleteRepository;
    }

    public List<Athlete> getAllAthletes(){
        return athleteRepository.findAll();
    }

    public Optional<Athlete> getAthleteById(Integer id){
        return athleteRepository.findById(id);
    }

    public void createAthlete(Athlete athlete){
        athleteRepository.save(athlete);
    }


    

    

    
}
