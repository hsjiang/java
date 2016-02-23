package com.example.eventchecker;

/**
 * Created by riven_chris on 15/8/19.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = true;

    public abstract int next();

    public void cancel() {
        this.canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
