/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 *
 * @author Administrator
 */
public class Bifunction {

    public static void main(String[] args) {
        BiFunction<String, String, String> bi = (x, y) -> {
            return x + y;
        };

        System.out.println(bi.apply("Mahesh ", " Patel"));

        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 40000);
        salaries.put("Freddy", 10000);
        salaries.put("Samuel", 50000);

        salaries.replaceAll((name, oldValue)
                -> name.equals("Freddy") ? oldValue : oldValue + 20000);

        salaries.forEach((k, v) -> System.out.println(k + " " + v));
    }

}
