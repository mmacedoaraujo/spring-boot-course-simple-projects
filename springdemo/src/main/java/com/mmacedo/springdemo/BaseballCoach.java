package com.mmacedo.springdemo;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Do a 30 minute batting practice";
    }
}
