/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.threading;

/**
 *
 * @author Mahesh
 */
public class HelloThread extends Thread{

    public static void main(String[] args) {

        System.out.println("Start " + Thread.currentThread().getId());
        HelloThread thread = new HelloThread();
        thread.start();
        System.out.println("End " + Thread.currentThread().getId());
    }

    @Override
    public void run() {
        System.out.println("Threading Running " + Thread.currentThread().getId());

    }
}
