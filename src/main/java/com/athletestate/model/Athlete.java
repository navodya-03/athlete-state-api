package com.athletestate.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "athletes")
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int athlete_Id;
    @Column(name = "first_name",nullable = false,length = 100)
    private String first_Name;
    @Column(name = "last_name",nullable = false,length = 100)
    private String last_Name;

    public Athlete(){
    }
    public Athlete(String first_Name,String last_Name){
        this.first_Name = first_Name;
        this.last_Name = last_Name;
    }
    @OneToMany(mappedBy = "athleteId")
    List <Workout> workouts = new ArrayList<>();
    

    public int getAthlete_Id() {
        return athlete_Id;
    }
    public String getFirst_Name() {
        return first_Name;
    }
    public String getLast_Name() {
        return last_Name;
    }
    public void setAthlete_Id(int athlete_Id) {
        this.athlete_Id = athlete_Id;
    }
    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }





    
}
