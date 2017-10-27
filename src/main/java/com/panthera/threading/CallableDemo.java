/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.threading;

import java.util.concurrent.Callable;

/**
 *
 * @author Mahesh
 */
public class CallableDemo implements Callable {

    String threadName = null;
    Integer data = null;
    static int  count;

    public CallableDemo(String threadName, Integer data) {
        this.threadName = threadName;
        this.data = data;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " " + ":" + data);
        count = count + data ;
        return count;
    }

}
