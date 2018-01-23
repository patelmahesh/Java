/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TwoSumArray {

    public  static void twosum(int total, int data[]) {
        int result[] = new int[2];
        
        Map<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            Integer val = map.get(total  - data[i]);
            if(val == null){
                map.put(data[i], i);
            }else{
                result[0] = val;
                result[1] = i;
                break;
            }
        }
        System.out.println(result[0]+ " " +result[1] );
        
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("No Of Element :");
        int noOfElements = sc.nextInt();
        int data[] = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            data[i] = sc.nextInt();
        }
        System.out.print("Total Value :");
        int totatValue = sc.nextInt();
        TwoSumArray.twosum(totatValue, data);
        
    }

}
