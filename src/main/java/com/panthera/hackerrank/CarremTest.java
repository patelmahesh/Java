/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mahesh
 */
public class CarremTest {

    static String winner(int[] andrea, int[] maria, String s) {
        int start = 0;
        List<Integer> pointAsd = new ArrayList<>();
        List<Integer> pontMar = new ArrayList<>();
        int sumAsd = 0;
        int sumMar = 0;

        if (s == "Even") {
            start = 0;
        } else {
            start = 1;
        }

        for (int i = start; i < andrea.length; i = i + 2) {
            pointAsd.add(andrea[i] - maria[i]);
            pontMar.add(maria[i] - andrea[i]);
        }

        for (int i = 0; i < pointAsd.size(); i++) {
            sumAsd = sumAsd + pointAsd.get(i);
        }

        for (int i = 0; i < pontMar.size(); i++) {
            sumMar = sumMar + pontMar.get(i);
        }
        if (sumAsd < sumMar) {
            return "Maria";
        } else if (sumAsd > sumMar) {
            return "Andrea";
        } else {
            return "Tie";
        }

    }

    public static void main(String[] args) {
        int[] andrea = {1, 2, 3};
        int[] maria = {2, 1, 3};

        CarremTest test = new CarremTest();
        System.out.println(CarremTest.winner(andrea, maria, "Odd"));;

    }

}
