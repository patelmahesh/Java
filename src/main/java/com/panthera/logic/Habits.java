/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.logic;

/**
 *
 * @author Mahesh
 */
public class Habits {

    public boolean smoking;
    public boolean alcohol;
    public boolean dailyExercise;
    public boolean drugs;

    public Habits(boolean smoking, boolean alcohol, boolean dailyExercise, boolean drugs) {
        this.smoking = smoking;
        this.alcohol = alcohol;
        this.dailyExercise = dailyExercise;
        this.drugs = drugs;
    }

    public Habits() {

    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public boolean isDailyExercise() {
        return dailyExercise;
    }

    public void setDailyExercise(boolean dailyExercise) {
        this.dailyExercise = dailyExercise;
    }

    public boolean isDrugs() {
        return drugs;
    }

    public void setDrugs(boolean drugs) {
        this.drugs = drugs;
    }

  

}
