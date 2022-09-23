package com.mmacedo.springdemo;

public class SoccerCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do 100 kicks to the goal";
    }
}
