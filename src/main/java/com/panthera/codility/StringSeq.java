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
public class StringSeq {

    public static void main(String[] args) {
        int a = 1, b = 8;
        StringBuilder sb = new StringBuilder();
        
        if (a == b) {
            for (int i = 0; i < a; i++) {
                sb.append("a");
                sb.append("b");
            }
        }
        
        if (a > b) {
            int countB = 2, noOfA = a, noOfB = b;
            if (a >= (b * b)) {
                System.out.println("Not Possible");
            } else {
                if ((a / b) >= 2) {
                    countB = 1;
                }

                while (noOfA > 0 || noOfB > 0) {
                    if (noOfA > 0) {
                        sb.append("a");
                        noOfA--;
                        if (noOfA > 0) {
                            sb.append("a");
                            noOfA--;
                        }
                    }
                    if (noOfB > 0) {
                        if (countB == 2) {
                            sb.append("b");
                            noOfB--;
                            if (noOfB > 0) {
                                sb.append("b");
                                noOfB--;
                            }
                        } else {
                            sb.append("b");
                            noOfB--;
                        }
                    }
                }

            }
        }
        
        if (b > a) {
            int countA = 2, noOfA = a, noOfB = b;
            if (b >= (a * a)) {
                System.out.println("Not Possible");
            } else {
                if ((b / a) >= 2) {
                    countA = 1;
                }

                while (noOfB > 0 || noOfA > 0) {
                    if (noOfB > 0) {
                        sb.append("b");
                        noOfB--;
                        if (noOfB > 0) {
                            sb.append("b");
                            noOfB--;
                        }
                    }
                    if (noOfA > 0) {
                        if (countA == 2) {
                            sb.append("a");
                            noOfA--;
                            if (noOfA > 0) {
                                sb.append("a");
                                noOfA--;
                            }
                        } else {
                            sb.append("a");
                            noOfA--;
                        }
                    }
                }

            }
        }
        System.out.println(sb.toString());

    }
}
