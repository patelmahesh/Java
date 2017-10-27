/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.logic;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Mahesh
 */
public class HealthInsurance {

    public UserDetails getUserDetails() {
        Habits habits = new Habits();
        habits.setSmoking(false);
        habits.setAlcohol(true);
        habits.setDrugs(false);
        habits.setDailyExercise(true);

        Health health = new Health();
        health.setBloodPressure(false);
        health.setBloodSugar(false);
        health.setHypertension(false);
        health.setOverweight(true);

        UserDetails user = new UserDetails();
        user.setUserName("Norman Gomes");
        user.setGender("M");
        user.setAge(34);
        user.setHealth(health);
        user.setHabits(habits);

        return user;
    }

    public Map<String, Integer> getPremiumPercentage() {
        Map<String, Integer> preiumPercentage = new LinkedHashMap<>();
        preiumPercentage.put("18-25", 10);
        preiumPercentage.put("25-30", 10);
        preiumPercentage.put("30-35", 10);
        preiumPercentage.put("35-40", 10);
        preiumPercentage.put("40-45", 20);
        preiumPercentage.put("45-50", 25);
        preiumPercentage.put("50-55", 30);
        preiumPercentage.put("55-60", 35);

        return preiumPercentage;

    }

    public int getBadHabits(UserDetails user) {

        int badHabits = 0;

        if (user.getHabits().isDrugs()) {
            badHabits++;
        }
        if (user.getHabits().isAlcohol()) {
            badHabits++;
        }
        if (user.getHabits().isDailyExercise()) {
            badHabits++;
        }

        return badHabits;
    }

    public int getHealthCondition(UserDetails user) {
        int HealthCondition = 0;
        if (user.getHealth().isBloodPressure()) {
            HealthCondition++;
        }
        if (user.getHealth().isBloodSugar()) {
            HealthCondition++;
        }
        if (user.getHealth().isHypertension()) {
            HealthCondition++;
        }
        if (user.getHealth().isOverweight()) {
            HealthCondition++;
        }
        return HealthCondition;
    }

    public float getPremium(UserDetails user) {
        float premiuAmmount = 5000;
        int basePremium = 5000;
        if (user.getAge() < 18) {
            return basePremium;
        }

        //1.
        premiuAmmount = premiuAmmount + (premiuAmmount * getHealthCondition(user)) / 100.0f;

        //2.
        if (user.getHabits().isDailyExercise()) {
            premiuAmmount = premiuAmmount - ((basePremium * 3) / 100.0f);
        }

        premiuAmmount = premiuAmmount + (premiuAmmount * (getBadHabits(user) * 3)) / 100.0f;

        //3.
        if ("M".equals(user.getGender())) {
            premiuAmmount = premiuAmmount + (premiuAmmount * 2) / 100.0f;
        }

        //5
        Map<String, Integer> preiumPercentage = getPremiumPercentage();
        for (Map.Entry<String, Integer> entry : preiumPercentage.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            String[] parts = key.split("-");
            int lowerLimit = Integer.parseInt(parts[0]);
            int upperLimit = Integer.parseInt(parts[1]);
            if (upperLimit >= user.getAge() && user.getAge() <= lowerLimit) {
                premiuAmmount = premiuAmmount + (premiuAmmount * value) / 100.0f;
                break;
            }

        }

        return premiuAmmount;
    }

    public static void main(String[] args) {

        HealthInsurance insurance = new HealthInsurance();
        UserDetails user = insurance.getUserDetails();
        System.out.println("Premium Amount : " + insurance.getPremium(user));
    }

}
