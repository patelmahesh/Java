/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.codility;

/**
 *
 * @author dpimac
 */
public class PermCheck {

    public static void main(String[] args) {
        int[] A = new int[]{4, 1, 2, 3};
        int[] counter = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 1 || A[i] > A.length) {
                // Out of range
                //  return 0;
            } else if (counter[A[i] - 1] == 1) {
                // met before
                //return 0;
            } else {
                // first time meet
                counter[A[i] - 1] = 1;
            }
        }
        //return 1;
    }

/*
    
A non-empty array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
is a permutation, but array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.

Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [1..1,000,000,000].

    
*/
    
}
