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
public class CountDiv {

    public static void main(String[] args) {
        int A = 6;
        int B = 10;
        int K = 2;
        int count = 0;
        if (A % K == 0) {
            System.out.println((B / K) - (A / K) + 1);
        } else {
            // A is not divisible by K 
            System.out.println((B / K) - (A / K));
        }

    }

    /*
    Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Write an efficient algorithm for the following assumptions:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.

     */
}
