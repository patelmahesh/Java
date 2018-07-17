/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Administrator
 */
public class StreamSample {

    public static void main(String[] args) {
        List<String> myList
                = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream().filter(s -> s.startsWith("a")).map(String::toUpperCase).sorted().forEach(System.out::println);

        //count
        long count = myList.stream().distinct().count();
        System.out.println(count);

        //For Iterating
        boolean isExist = myList.stream().anyMatch(element -> element.contains("a2"));
        System.out.println(isExist);

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("India");
        list.add("Thursday");
        list.add("");
        list.add("");

        //Filtering
        list.stream().filter(e -> e.startsWith("I")).forEach(System.out::println);

        //Matching
        boolean isValid = list.stream().anyMatch(element -> element.contains("h")); // true
        boolean isValidOne = list.stream().allMatch(element -> element.contains("h")); // false
        boolean isValidTwo = list.stream().noneMatch(element -> element.contains("h")); // false

        //Collecting
        List<String> resultList = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
        resultList.forEach(System.out::println);

        Arrays.asList("a1", "a2", "a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);  // a1

    }
}
