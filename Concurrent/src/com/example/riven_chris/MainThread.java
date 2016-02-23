package com.example.riven_chris;

/**
 * Created by riven_chris on 15/8/13.
 * 这个任务的run()不是由单独的线程驱动的，它是在main()中直接调用的，即总分配给main()的那个线程。
 */
public class MainThread {

    public static void main(String[] args) {
        LiftOff liftOff = new LiftOff();
        liftOff.run();
    }
}
