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

import com.athletestate.model.Workout;
import com.athletestate.service.WorkoutService;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

    private final WorkoutService workoutService;

    public WorkoutController(WorkoutService workoutService){
        this.workoutService = workoutService;
    }

    @PostMapping
    public Workout createWorkout(@RequestBody Workout workout){
        return workoutService.createWorkout(workout);
    }

    @PutMapping("/{id}")
    public Workout UpdateWorkout(@PathVariable Integer id,@RequestBody Workout workout){
        return workoutService.updateWorkout(id, workout);
    }
    @GetMapping
    public List<Workout> getAllWorkouts(){
        return workoutService.getAllWorkouts();
    }
    @GetMapping("/{id}")
    public Workout getWorkoutById(@PathVariable Integer id){
        return workoutService.getWorkoutById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteWorkout(@PathVariable Integer id){
        workoutService.deleteWorkout(id);
    }
    
    
}