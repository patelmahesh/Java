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
@FunctionalInterface
public interface Calculator extends MathOperation, AdvanceOperations {

    default void print(int a, int b) {
        System.out.println(a + " " + b);
    }

}
