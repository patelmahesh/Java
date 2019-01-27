/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String result = "";
        String data[];
        data = s.split(":");
        if (s.contains("PM") && !data[0].equals("12")) {
            int hour = Integer.parseInt(data[0]) + 12;
            data[0] = String.valueOf(hour);
        }
        if (s.contains("AM") && data[0].equals("12")) {
            data[0] = "00";

        }
        result = String.join(":", data);
        return result.substring(0, s.length() - 2);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
        String s = "12:40:22AM";
        String result = timeConversion(s);
        System.out.println(result);

    }
}
