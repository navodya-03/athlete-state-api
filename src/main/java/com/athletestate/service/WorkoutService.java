package com.athletestate.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.boot.registry.classloading.spi.ClassLoaderService.Work;
import org.springframework.stereotype.Service;

import com.athletestate.model.Workout;
import com.athletestate.repository.WorkoutRepository;
@Service
public class WorkoutService {
    
    private final WorkoutRepository workoutRepository;

    public WorkoutService(WorkoutRepository workoutRepository){
        this.workoutRepository = workoutRepository;
    }

    public Workout createWorkout(Workout workout){
        return workoutRepository.save(workout);

    }
    public List<Workout> getAllWorkouts(){
        return workoutRepository.findAll();
    }

    public Workout getWorkoutById(Integer id){
        return workoutRepository.findById(id).orElseThrow(()-> new RuntimeException("user not found"));

    }

    public Workout updateWorkout(Integer id, Workout workoutDetails){

        Workout temp = workoutRepository.findById(id).orElseThrow(()->new RuntimeException("no user find by this id"+ id));

        temp.setFocusArea(workoutDetails.getFocusArea());

        return temp;

        
    }

    public void deleteWorkout(Integer id){
        workoutRepository.deleteById(id);

    }
}
