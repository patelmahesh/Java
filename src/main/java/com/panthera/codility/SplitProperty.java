/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.codility;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mahesh
 */
public class SplitProperty {

    public static void main(String[] args) {
        System.out.println("Total ways to print : " + solution(5, 5, new int[]{0, 4, 2, 0}, new int[]{0, 0, 1, 4}));
    }

    public static int solution(int N, int M, int[] X, int[] Y) {
        // write your code in Java SE 8
        List list = new ArrayList();
        int count = 0;
        for (int i = 0; i < X.length; i++) {
            list.add(X[i], Y[i]);
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
              
            }
        }

        return count;
    }
}
