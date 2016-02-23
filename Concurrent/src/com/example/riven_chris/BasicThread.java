package com.example.riven_chris;

/**
 * Created by riven_chris on 15/8/13.
 */
public class BasicThread {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new LiftOff());
            thread.start();
        }
        System.out.println("Waiting fo LiftOff");
    }
}
/* output
Waiting fo LiftOff
#0(9).
#0(8).
#0(7).
#0(6).
#0(5).
#0(4).
#0(3).
#0(2).
#0(1).
#0(LiftOff).//90% match

sometimes with no call Thread.yield()
#0(9).
#0(8).
#0(7).
#0(6).
#0(5).
#0(4).
#0(3).
#0(2).
#0(1).
#0(LiftOff).
Waiting fo LiftOff

sometimes while called Thread.yield()
#0(9).
Waiting fo LiftOff
#0(8).
#0(7).
#0(6).
#0(5).
#0(4).
#0(3).
#0(2).
#0(1).
#0(LiftOff).
 */