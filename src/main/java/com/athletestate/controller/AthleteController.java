package com.athletestate.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.athletestate.dto.AthleteCreateRequest;
import com.athletestate.model.Athlete;
import com.athletestate.service.AthleteService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/athletes")
public class AthleteController {

    private final AthleteService athleteService;

    public AthleteController(AthleteService athleteService){
        this.athleteService = athleteService;
    }


    @GetMapping
    public List<Athlete> getAllAthletes(){
        return athleteService.getAllAthletes();
    }

    @PostMapping

    public Athlete saveAthlete(@Valid @RequestBody AthleteCreateRequest dto){

        return athleteService.createAthlete(dto);

        
        
        
    }

    @PutMapping("/{id}")
    public Athlete updateAthlete(@PathVariable Integer id, @RequestBody Athlete details){
        return athleteService.updateAthleteById(id, details);
    }

    @DeleteMapping("/{id}")
    public void deleteAthlete(@PathVariable Integer id){
        athleteService.deleteAthlete(id);
    }


    
}
