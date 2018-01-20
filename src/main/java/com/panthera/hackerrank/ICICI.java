/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.hackerrank;

/**
 *
 * @author Administrator
 */
public class ICICI  implements BankTransfers{

     @Override
    public String encrypt(String data) {
        StringBuilder encryptMsg = new  StringBuilder();
        for (char c : data.toCharArray()) {
            c += 1;
            encryptMsg.append(c);
            encryptMsg.append("1");
        }
        return encryptMsg.toString();
    }

    @Override
    public String decrypt(String data) {
       
        StringBuilder decryptMsg = new  StringBuilder();
        String encryptMsg = data.replaceAll("1", "");
        for (char c : encryptMsg.toCharArray()) {
            c -= 1;
            decryptMsg.append(c);
        }
        return decryptMsg.toString();
    }
    
}
