/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.hackerrank;

/**
 *
 * @author Administrator
 */
public class Kangaroo {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        int a = x1 * v1;
        int b = x2 * v2;
        if (a == b) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        String result = kangaroo(0, 2, 5, 3);
        System.out.println(result);
    }
}
