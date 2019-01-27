/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.hackerrank;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;

/**
 *
 * @author Administrator
 */
public class SherlockAnagrams {

    static int sherlockAndAnagrams(String s) {

        Map<String, Long> list = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() >= 2).collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        return 1;
    }

    public static void main(String[] args) {
        int result = sherlockAndAnagrams("Mahesh Patel");
    }
}
