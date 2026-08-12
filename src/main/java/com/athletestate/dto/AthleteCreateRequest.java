package com.athletestate.dto;


import jakarta.validation.constraints.NotBlank;

public class AthleteCreateRequest {
    @NotBlank(message = "can not be null")
    private String first_name;
    @NotBlank(message = "can not be null")
    private String last_name;
    

    public AthleteCreateRequest(){

    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    
}
