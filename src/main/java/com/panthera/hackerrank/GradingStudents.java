/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GradingStudents {

    private static final Scanner scan = new Scanner(System.in);

    static int[] gradingStudents(int[] grades) {
        int[] result = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {

            int differnce = (int) (Math.ceil(grades[i] / 5) * 5 + 5) - grades[i];
            if (differnce < 3 && grades[i] >= 38) {
                result[i] = grades[i] + differnce;
            } else {
                result[i] = grades[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }

}
