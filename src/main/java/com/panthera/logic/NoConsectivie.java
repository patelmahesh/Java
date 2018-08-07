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
public class NoConsectivie {

    public String letter(int noOfA, int noOfB) {
        StringBuilder result = new StringBuilder();

        int countA = 0;
        int countB = 0;
        int a = noOfA;
        int b = noOfB;

        if (noOfA > noOfB) {
            for (int i = 1; i <= noOfA + noOfB; i++) {
                if (((countA != noOfA && countA < 2) || countB == noOfB) && a != 0) {
                    countA++;
                    result.append("a");
                    a--;
                } else {
                    countA = 0;
                    countB++;
                    result.append("b");
                }

            }

        } else if (noOfA < noOfB) {
            for (int i = 1; i <= noOfA + noOfB; i++) {
                if (((countB != noOfB && countB < 2) || countA == noOfA) && b != 0) {
                    countB++;
                    result.append("b");
                } else {
                    b--;
                    countB = 0;
                    countA++;
                    result.append("a");
                }

            }

        } else if (noOfA == noOfB) {

            for (int i = 1; i <= noOfA; i++) {
                result.append("a");
                result.append("b");
            }

        } else {
            return null;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        NoConsectivie cons = new NoConsectivie();
        System.out.println(cons.letter(5, 3));
        System.out.println(cons.letter(3, 3));
        System.out.println(cons.letter(4, 1));

    }

}
