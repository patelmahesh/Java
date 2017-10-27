/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mahesh
 */
public class Target implements Runnable {

    public boolean running = false;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start" + Thread.currentThread().getId());

        List<Target> targets = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            targets.add(new Target());
        }

        for (Target target : targets) {
            Thread thread = new Thread(target);
            thread.start();
            Thread.sleep(3000);
           
            
        }

        System.out.println("End" + Thread.currentThread().getId());
    }

    @Override
    public void run() {
       
        System.out.println("Threading Running " + Thread.currentThread().getId());

    }

}
