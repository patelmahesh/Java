/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.java8;

import com.panthera.pojo.Employee;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 *
 * @author Administrator
 */
public class FunctionalTypes {

    public static void main(String[] args) {

        //Fuctional Interface
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", s -> s.length());
        System.out.println(value + "" + nameMap.size());

        List<Employee> employeeList
                = Arrays.asList(new Employee("Tom Jones", 45),
                        new Employee("Harry Major", 25),
                        new Employee("Ethan Hardy", 65),
                        new Employee("Nancy Smith", 15),
                        new Employee("Deborah Sprightly", 29));

        // Apply
        Function<Employee, String> empToString = (Employee e) -> {
            return e.getFirstName();
        };
        //And Then
        Function<String, String> initialFunction = (String s) -> s.substring(0, 1);

        //Compose
        Function<Employee, Employee> empFirstName
                = (Employee e) -> {
                    int index = e.getFirstName().indexOf(" ");
                    String firstName = e.getFirstName().substring(0, index);
                    e.setFirstName(firstName);
                    return e;
                };

        List<String> empNameList = convertEmpList(employeeList, empToString);
        empNameList.forEach(System.out::println);

        List<String> empNameList2 = convertEmpList(employeeList, empToString.andThen(initialFunction));
        empNameList2.forEach(System.out::println);

        List<String> empNameList3 = convertEmpList(employeeList, empToString.compose(empFirstName));
        empNameList3.forEach(System.out::println);

        //Static identity
        List<Employee> empNameListInitials = applyIdentityToEmpList(employeeList, Function.identity());
        empNameListInitials.forEach(System.out::println);

    }

    public static List<String> convertEmpList(List<Employee> employeeList, Function<Employee, String> empToString) {
        List<String> empNameList = new ArrayList<>();
        employeeList.forEach((emp) -> {
            empNameList.add(empToString.apply(emp));
        });
        return empNameList;
    }

    public static List<Employee> applyIdentityToEmpList(List<Employee> employeeList, Function<Employee, Employee> empToString) {
        List<Employee> empNameList = new ArrayList<>();
        employeeList.forEach((emp) -> {
            empNameList.add(empToString.apply(emp));
        });
        return empNameList;
    }

}
