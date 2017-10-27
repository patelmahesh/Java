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
public class WorkerThread implements Runnable {

    String threadName = null;
    Integer data = null;

    public WorkerThread(String threadName, Integer data) {
        this.threadName = threadName;
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + ":" + data);

    }

}
