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
public class HDFC implements BankTransfers {

    @Override
    public String encrypt(String data) {
        StringBuilder encryptMsg = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (c % 2 == 0) {
                c -= 1;
                encryptMsg.append(c);
            } else if (c % 2 != 0) {
                c += 1;
                encryptMsg.append(c);
            }
        }
        return encryptMsg.toString();
    }

    @Override
    public String decrypt(String data) {
        return encrypt(data);
        /*    StringBuilder decryptMsg = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (c % 2 == 0) {
                c -= 1;
                decryptMsg.append(c);
            } else if (c % 2 != 0) {
                c += 1;
                decryptMsg.append(c);
            }
        }
        return decryptMsg.toString();*/
    }

}
