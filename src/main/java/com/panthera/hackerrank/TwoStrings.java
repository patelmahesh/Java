/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.hackerrank;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class TwoStrings {

    static void twoStrings(String s1, String s2) {

        boolean isAvailable = false;
        for (int i = 97; i < (97 + 25); i++) {
            if (s1.indexOf(i) != -1 && s2.indexOf(i) != -1) {
                isAvailable = true;
                break;
            }
        }
        System.out.println(isAvailable == true ? "Yes" : "No");
    }

    public static void main(String[] args) {
        twoStrings("hi", "hworld");
    }

}
