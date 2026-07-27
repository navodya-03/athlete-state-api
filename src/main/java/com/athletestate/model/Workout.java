package com.athletestate.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "workouts")
public class Workout {
    @Column(name="workout_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workoutId;
    
    
    @ManyToOne
    @JoinColumn(name = "athlete_id")
    private Athlete athleteId;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "focus_area")
    private String focusArea;

    public Workout(){
    }

    public int getWorkoutId() {
        return workoutId;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getFocusArea() {
        return focusArea;
    }
public void setWorkoutId(int workoutId) {
    this.workoutId = workoutId;
}
public void setDate(LocalDate date) {
    this.date = date;
}
public void setFocusArea(String focusArea) {
    this.focusArea = focusArea;
}
    
}
