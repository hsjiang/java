package com.example.riven_chris;

import java.lang.annotation.Target;

/**
 * Created by riven_chris on 15/8/17.
 */
public class JoinTest {

    public static void main(String[] args) {
        TarThread tarThread = new TarThread("target");
        tarThread.start();
        OriThread oriThread = new OriThread("ori", tarThread);
        oriThread.start();
    }
}

class OriThread extends Thread {
    private TarThread tarThread;

    public OriThread(String threadName, TarThread tarThread) {
        super(threadName);
        this.tarThread = tarThread;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started");
        try {
            tarThread.join();
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupt");
        }
        System.out.println(getName() + " completed");
    }

    @Override
    public void interrupt() {
        System.out.println(getName() + " interrupt");
        super.interrupt();
    }
}

class TarThread extends Thread {

    public TarThread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println(getName() + " started");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("tar interrupt");
        }
        System.out.println(getName() + " completed ");
    }
}
