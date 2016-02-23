package com.example.cooperation;

import java.io.PipedReader;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by riven_chris on 15/8/20.
 */
public class WaxOMatic {

    public static void main(){
        WaxOMatic waxOMatic = new WaxOMatic();

        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t;
        ThreadPoolExecutor executor;
        LinkedBlockingQueue q;
        PipedReader p;

        Condition c;
        ReentrantLock r;
    }
}
