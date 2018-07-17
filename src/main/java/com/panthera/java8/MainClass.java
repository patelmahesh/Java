/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.java8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class MainClass {
    
    public static void main(String[] args) {
        List<String> pointList = new ArrayList();
        pointList.add("1");
        pointList.add("2");
        
        pointList.forEach(p -> {
            System.out.println(p);
        });
        
        
        
        
        
        
    }
}
