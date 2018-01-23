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
        
        System.out.println("\nRight Angle\n");        
        for (int i = 0; i <= noOfElements; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("\nInverse Logic\n");        
        for (int i = noOfElements; i >= 0; i--) {
            for (int j = noOfElements; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("\nMirror Right Angle\n");        
        for (int i = 0; i <= noOfElements; i++) {
            for (int j = 0; j < noOfElements - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    
        
        System.out.println("\nInverse Triangle\n");
        for (int i = noOfElements; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("\nMirror Inverse Triangle\n");        
        for (int i = 0; i <= noOfElements; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < noOfElements - i ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        
        
    }
    
}
