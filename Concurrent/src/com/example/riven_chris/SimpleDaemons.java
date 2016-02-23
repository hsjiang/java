package com.example.riven_chris;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by riven_chris on 15/8/14.
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("sleep() interrupt");
        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);// must call before start
            daemon.start();
        }
        System.out.println("All daemon started");
        TimeUnit.MILLISECONDS.sleep(170);
    }
}
