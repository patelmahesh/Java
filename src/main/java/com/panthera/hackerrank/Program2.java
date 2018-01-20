/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.hackerrank;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Program2 {

    public static void main(String[] args) {

        System.out.println("Select the Bank Name");
        System.out.println("1.ICICI");
        System.out.println("2.HDFC");
        Scanner in = new Scanner(System.in);

        int bankId = in.nextInt();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Message to Transfer");
        String message = input.nextLine();
        switch (bankId) {
            case 1:
                ICICI icici = new ICICI();
                String encryptedMsg = icici.encrypt(message);
                System.out.println("The Encrypted message is : " + encryptedMsg);
                System.out.println("The Decrypted message is : " +icici.decrypt(encryptedMsg));
                break;
            case 2:
                HDFC hdfc = new HDFC();
                String encryptMsg = hdfc.encrypt(message);
                System.out.println("The Encrypted message is : " + encryptMsg);
                System.out.println("The Decrypted message is : " +hdfc.decrypt(encryptMsg));
                break;
            default:
                System.out.println("Invalid Type");
        }

    }

}
