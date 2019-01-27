/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.logic;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class TestLogic {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        int[] result = new int[array.length];
        int counter = 0;
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {

            if ((array.length % 2 != 0) ? counter == array.length - 1 : counter == array.length) {
                if (array.length % 2 != 0) {
                    result[counter] = array[i];
                }
                break;
            }
            result[counter] = array[i];
            counter++;
            result[counter] = array[j];
            counter++;
        }

        Arrays.stream(result)
                .forEach(e -> System.out.print(e + " "));

    }


}
