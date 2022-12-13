package com.hsjiang.demo;

public class CacheLinePadding {
    public static volatile long[] arr = new long[16];

    public static volatile long[] arr2 = new long[2];

    public static void main(String[] args) throws InterruptedException {
        doArr1();
    }

    public static void doArr1() throws InterruptedException {
        doArray(arr);
    }

    public static void doArray2() throws InterruptedException {
        doArray(arr2);
    }

    public static void doArray(long[] arr) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10_0000_0000L; i++) {
                arr[0] = i;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10_0000_0000L; i++) {
                arr[0] = i;
            }
        });
        long start = System.nanoTime();
        t1.start();
        t2.start();
        t1.join();
        System.out.println("t1 join");
        t2.join();
        System.out.println("t2 join");
        System.out.println((System.nanoTime() - start) / 100_0000);
    }
}
