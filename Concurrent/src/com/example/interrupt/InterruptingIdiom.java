package com.example.interrupt;

import java.util.concurrent.TimeUnit;

/**
 * Created by riven_chris on 15/8/20.
 */
public class InterruptingIdiom {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Blocked3());
        t.start();
        TimeUnit.SECONDS.sleep(2);
        t.interrupt();
    }
}

class NeedsCleanUp {
    private final int id;

    public NeedsCleanUp(int id) {
        this.id = id;
        System.out.println("NeedsCleanUp " + id);
    }

    public void cleanUp() {
        System.out.println("Cleaning up " + id);
    }
}

class Blocked3 implements Runnable {

    private volatile double d = 0.0;

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                NeedsCleanUp n1 = new NeedsCleanUp(1);

                System.out.println("Sleeping");
//                Thread.currentThread().interrupt();在第一次调用阻塞之前，经由InterruptedException退出。
                try {
                    TimeUnit.SECONDS.sleep(1);
                    NeedsCleanUp n2 = new NeedsCleanUp(2);
                    try {
                        System.out.println("Calculating");
                        for (int i = 0; i < 2500000; i++)
                            d = d + (Math.PI + Math.E) / d;
                        System.out.println("Finished time-consuming operation");
                    } finally {
                        n2.cleanUp();
                    }
                } finally {
                    n1.cleanUp();
                }
            }
            System.out.println("Exiting via while() test");
        } catch (InterruptedException e) {
            System.out.println("Exiting via InterruptedException");
        }
    }
}
