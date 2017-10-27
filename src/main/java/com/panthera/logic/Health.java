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
public class Health {

    public boolean hypertension;
    public boolean bloodPressure;
    public boolean bloodSugar;
    public boolean overweight;

    public int HealthCondition;

    public Health(boolean hypertension, boolean bloodPressure, boolean bloodSugar, boolean overweight) {
        this.hypertension = hypertension;
        this.bloodPressure = bloodPressure;
        this.bloodSugar = bloodSugar;
        this.overweight = overweight;
    }

    public Health() {
    }

    public boolean isHypertension() {
        return hypertension;
    }

    public void setHypertension(boolean hypertension) {
        this.hypertension = hypertension;
    }

    public boolean isBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(boolean bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public boolean isBloodSugar() {
        return bloodSugar;
    }

    public void setBloodSugar(boolean bloodSugar) {
        this.bloodSugar = bloodSugar;
    }

    public boolean isOverweight() {
        return overweight;
    }

    public void setOverweight(boolean overweight) {
        this.overweight = overweight;
    }

}
