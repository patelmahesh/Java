/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.datastructure;

import java.util.Scanner;

/**
 *
 * @author Mahesh
 */
public class Array {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No of elements : ");
        int noOfelements = scanner.nextInt();
        int[] elements = new int[noOfelements];
        for (int i = 0; i < noOfelements; i++) {
            elements[i] = scanner.nextInt();
        }
        
        
        for (int i = noOfelements- 1 ; i >= 0; i--) {
            System.out.print(elements[i]+ " ");
        }
        
        
    }
    
    
}
