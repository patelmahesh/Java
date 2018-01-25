/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author Administrator
 */
public class Operations {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        Integer[] result = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            Integer sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    sum = sum + arr[j];
                }

            }
            result[i] = sum;
        }
        Arrays.sort(result);
        System.out.println(result[0] + " " + result[result.length - 1]);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
