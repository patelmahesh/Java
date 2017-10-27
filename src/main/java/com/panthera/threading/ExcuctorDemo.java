/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Mahesh
 */
public class ExcuctorDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExcuctorDemo ex = new ExcuctorDemo();
        ex.process();

    }

    public void process() {
        ExecutorService exService = Executors.newFixedThreadPool(5);
        List<Integer> listData = new ArrayList<>();
        List<Future<Integer>> resultList = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            listData.add(i);
        }

        for (Integer data : listData) {

            /*
            Runnable worker = new WorkerThread("Thread ", data);
            exService.execute(worker);
             */
            CallableDemo worker = new CallableDemo("Thread ", data);
            Future<Integer> result = exService.submit(worker);
            resultList.add(result);
        }
        for (Future<Integer> future : resultList) {
            try {
                System.out.println("Future result is - " + " - " + future.get() + "; And Task done is " + future.isDone());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        exService.shutdown();
        while (!exService.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }

}
