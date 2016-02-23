package com.example.eventchecker;

/**
 * Created by riven_chris on 15/8/19.
 */
public class EvenGenerator extends IntGenerator {

    private int currentValue = 0;

    @Override
    public int next() {
        ++currentValue;//danger point here!
        Thread.yield();
        ++currentValue;
        return currentValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
