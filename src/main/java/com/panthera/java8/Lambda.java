/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.java8;

/**
 *
 * @author Administrator
 */
public class Lambda {

    public static void main(String[] args) {

        Lambda lamba = new Lambda();

        Calculator addition = (int a, int b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> {
            return a * b;
        };
        Calculator divison = (a, b) -> a / b;

        System.out.println("Addiction " + lamba.operation(10, 5, addition));
        System.out.println("Subtraction " + lamba.operation(10, 5, subtraction));
        System.out.println("Multiplcation " + lamba.operation(10, 5, multiplication));
        System.out.println("Divion " + lamba.operation(10, 5, divison));

    }

    public int operation(int a, int b, Calculator maths) {
        maths.print(a, b);
        return maths.operation(a, b);
    }

}
