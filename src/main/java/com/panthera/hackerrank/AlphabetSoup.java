/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class AlphabetSoup {

    public static void main(String[] args) {

        List<String> messageList = new ArrayList<>();

        System.out.println("Enter Character String : ");
        Scanner in = new Scanner(System.in);
        String alphabetSet = in.nextLine().toLowerCase();
        System.out.println("How many messages are to follow ? ");
        int noOfMessage = in.nextInt();
        for (int i = 0; i < noOfMessage; i++) {
            Scanner inputMsg = new Scanner(System.in);
            messageList.add(inputMsg.nextLine().toLowerCase());

        }
        Map< Character, Integer> alphabetCount = new HashMap<>();
        for (char c : alphabetSet.toCharArray()) {
            if (alphabetCount.containsKey(c)) {
                alphabetCount.put(c, alphabetCount.get(c) + 1);
            } else {
                alphabetCount.put(c, 1);
            }
        }

        
        for (String word : messageList) {
            Boolean isLetterPossible = false;
            Map< Character, Integer> wordCount = new HashMap<>();
            for (char c : word.toCharArray()) {
                if (wordCount.containsKey(c)) {
                    wordCount.put(c, alphabetCount.get(c) + 1);
                } else {
                    wordCount.put(c, 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : wordCount.entrySet()) { 
                if (alphabetCount.containsKey(entry.getKey()) && alphabetCount.get(entry.getKey()) >= entry.getValue()) {
                    isLetterPossible = true;
                } else {
                    isLetterPossible = false;
                    break;
                }
            }
            System.out.println(word + ": " + isLetterPossible);

        }
    }

}
