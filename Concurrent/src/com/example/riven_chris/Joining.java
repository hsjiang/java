package com.example.riven_chris;

/**
 * Created by riven_chris on 15/8/17.
 */
class Sleeper extends Thread {
    private int duration = 0;

    public Sleeper(String threadName, int duration) {
        super(threadName);
        this.duration = duration;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted. isInterrupted(): " + isInterrupted());
            return;
        }
        System.out.println(getName() + " awakened");
    }
}

class Joiner extends Thread {
    private Sleeper sleeper;

    public Joiner(String threadName, Sleeper sleeper) {
        super(threadName);
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println(" interrupted");
        }
        System.out.println(getName() + " join completed");
    }
}

public class Joining {
    public static void main(String[] args) {
        Sleeper sleepy = new Sleeper("sleepy", 1500);
        Sleeper grumpy = new Sleeper("grumpy", 1500);

        Joiner dopey = new Joiner("dopey", sleepy);
        Joiner doc = new Joiner("doc", grumpy);

        grumpy.interrupt();
    }
}
