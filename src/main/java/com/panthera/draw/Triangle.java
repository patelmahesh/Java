/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.draw;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Triangle {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No Of Element :");
        int noOfElements = sc.nextInt();
        
        //Right Angle 
        for (int i = 0; i <= noOfElements; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //Inverse Logic
        for (int i = noOfElements; i >= 0; i--) {
            for (int j = noOfElements; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //Inverse Right Angle 
        for (int i = 0; i < noOfElements; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
              System.out.println(" ");
        }
        
        
        
        
    }
    
}
