/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.java8;

import java.util.function.Supplier;

/**
 *
 * @author Administrator
 */
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> helloStrSupplier = () -> new String("Hello");
        String helloStr = helloStrSupplier.get();
        System.out.println("String in helloStr is->" + helloStr + "<-");
    }

}
