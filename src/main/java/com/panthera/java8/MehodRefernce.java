/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author Administrator
 */
public class MehodRefernce {

    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);

        List<Integer> list = Arrays.asList(12, 5, 45, 18, 33, 24, 40);

        List<Integer> moreThanFifty = findNumbers(list, MehodRefernce::isMoreThanFifty);
        moreThanFifty.forEach(System.out::print);
    }

    public static List<Integer> findNumbers(
            List<Integer> l, BiPredicate<Integer, Integer> p) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : l) {
            if (p.test(i, i + 10)) {
                newList.add(i);
            }
        }
        return newList;
    }

    public static boolean isMoreThanFifty(int n1, int n2) {
        return (n1 + n2) > 50;
    }
}
