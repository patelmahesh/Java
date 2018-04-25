/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.utility;

/**
 *
 * @author Administrator
 */
public class test {

    public static void main(String[] args) {
        int stepCount = 0;
        int total = 0;
        for (int i = 0; i < 38; i++) {
            stepCount++;
            if (stepCount % 14 == 0) {
                System.out.println("Mahesh"+stepCount);
            }
        }

    }

}
