/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class AppleOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        

        int apple = (int) Arrays.stream(apples).map(x -> a + x).filter(x -> (x >= s && x <= t)).count();
        int orange = (int) Arrays.stream(oranges).map(x -> b + x).filter(x -> (x >= s && x <= t)).count();
        System.out.println(apple);
        System.out.println(orange);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }*/

        //countApplesAndOranges(s, t, a, b, apples, oranges);
        
         countApplesAndOranges(7, 11, 5, 15, new int[]{11,1,1}, new int[]{-7,-6});

        scanner.close();
    }
}
