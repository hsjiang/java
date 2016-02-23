package com.example.riven_chris;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by riven_chris on 15/8/17.
 */
public class CaptureUncaughtException {

    public static void main(String[] args) {

        //代码中使用处处相同的处理器
//        Thread.setDefaultUncaughtExceptionHandler(new UnCaughtExceptionHandler());

        ExecutorService exec = Executors.newCachedThreadPool(new HandlerThreadFactory());
        exec.execute(new MyThread());
    }

    static class UnCaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread thread, Throwable ex) {
            System.out.println("caught" + ex);
        }
    }

    static class HandlerThreadFactory implements ThreadFactory {
        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            t.setUncaughtExceptionHandler(new UnCaughtExceptionHandler());
            return t;
        }
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            throw new RuntimeException("12345");
        }
    }
}
