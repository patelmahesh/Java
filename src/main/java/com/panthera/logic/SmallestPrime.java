/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.logic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Mahesh
 */
public class SmallestPrime {

    public static Integer getSmallestOdd(List<Integer> data) {
        return data.stream().filter(x -> x % 2 != 0).min(Comparator.comparing(Integer::valueOf)).get();
    }

    public static void main(String[] args) {
        int[] ints = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};
        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
        System.out.println(getSmallestOdd(list));

    }

}
