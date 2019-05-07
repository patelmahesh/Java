/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.codility;
/**
 *
 * @author dpimac
 */
public class Permutations {

    public static int  count = 0;

    // Utility function to swap two characters in a character array
    private static void swap(String[] ch, int i, int j) {
        String temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    // Recursive function to generate all permutations of a String
    private static void permutations(String[] ch, int currentIndex) {
        if (currentIndex == ch.length - 1) {
            String[] value = String.join("", ch).replaceAll("(\\w)(?!\\1)", "$1 ").split(" ");
            for (String string : value) {
                if(string.length() > count){
                    count = string.length();
                }
            }

        }

        for (int i = currentIndex; i < ch.length; i++) {
            swap(ch, currentIndex, i);
            permutations(ch, currentIndex + 1);
            swap(ch, currentIndex, i);
        }
    }

    // generate all permutations of a String in Java
    public static void main(String[] args) {
        String[] words = new String[]{"aabb", "aaaa", "bbab"};
        permutations(words, 0);
        System.out.println(count);
    }

}
