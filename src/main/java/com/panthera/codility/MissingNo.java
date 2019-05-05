/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.codility;

import java.util.Arrays;

/**
 *
 * @author dpimac
 */
public class MissingNo {

    public static void main(String[] args) {
        
        int A[] = new int[]{1, 3, 6, 4, 1, 2};
        int max = Arrays.stream(A).max().getAsInt();
        int min = Arrays.stream(A).min().getAsInt();

        for (int i = min; i <= max; i++) {
            if (Arrays.asList(A).contains(i)) {
                System.out.println(i);
            }
        }
    }

}
/*

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

 */
