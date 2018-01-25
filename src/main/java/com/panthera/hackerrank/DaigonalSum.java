/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.hackerrank;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class DaigonalSum {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int rightDaigSum = 0;     
        int leftDaigSum = 0;
                
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i]==a[j]){
                    rightDaigSum = rightDaigSum + a[i][j];
                }
                if(i+j == a.length-1){
                    leftDaigSum = leftDaigSum + a[i][j];
                }
                
            }
        }
        return Math.abs(rightDaigSum - leftDaigSum);
    }

    
    /*
    00 01 02 03 
    10 11 12 13
    20 21 22 23
    30 31 32 33
    
    */
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
        
        
    }
}
