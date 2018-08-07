/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.logic;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mahesh
 */
public class ShuffleNumber {

    public static Integer getShuffledNo(int data) {

        int[] digits = Integer.toString(data).chars().map(c -> c - '0').toArray();
        int[] result = new int[digits.length];

        int counter = 0;
        int start = 0;

        for (int i = 0, j = digits.length - 1; i < digits.length; i++, j--) {
            if (counter >= digits.length) {
                break;
            }
            result[i] = digits[start];

            i++;
            start++;
            counter = counter + 1;
            System.out.println(counter);
            if (counter >= digits.length) {
                break;
            }

            result[i] = digits[j];

            counter = counter + 1;

        }

        StringBuilder resultData = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            resultData.append(result[i]);
        }

        return Integer.parseInt(resultData.toString());
    }

    public static void main(String[] args) {
        System.out.println("12345");
        System.out.println(ShuffleNumber.getShuffledNo(12345));

    }
}
