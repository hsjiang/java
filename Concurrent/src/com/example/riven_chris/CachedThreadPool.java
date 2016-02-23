package com.example.riven_chris;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by riven_chris on 15/8/13.
 */
public class CachedThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Executors.newFixedThreadPool(5);
        Executors.newScheduledThreadPool(5);
        Executors.newSingleThreadExecutor();
        Executors.newWorkStealingPool();

        for (int i = 0; i < 5; i++) {
            executor.execute(new LiftOff());
            FutureTask f = (FutureTask) executor.submit(new LiftOff());
            f.cancel(true);
        }
        executor.shutdown();
    }
}
