/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.pojo;

/**
 *
 * @author dpimac
 */
public class C extends B{

    {
        System.out.println("Instance Block");
    }
    
    public C() {
        System.out.println("C");
    }
 
    static {
        System.out.println("Static in C");
    }
    
    
    public static void main(String[] args) {
        System.out.println("Main");
        C c = new C();
    }
    
    
    
}
