package com.example.cooperation;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by riven_chris on 15/8/21.
 */
public class PipedIO {

    public static void main(String[] args) throws Exception {
        Sender sender = new Sender();
        Receiver receiver = new Receiver(sender);

        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(sender);
        exec.execute(receiver);
        TimeUnit.SECONDS.sleep(4);
        exec.shutdownNow();
    }
}

class Sender implements Runnable {

    private Random random = new Random(47);
    private PipedWriter out = new PipedWriter();

    public PipedWriter getPipedWriter() {
        return this.out;
    }

    @Override
    public void run() {
        try {
            while (true) {
                for (char c = 'A'; c <= 'z'; c++) {
                    out.write(c);
                    System.out.println("Write: " + c + ", ");
                    TimeUnit.MILLISECONDS.sleep(random.nextInt(500));
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e + " Sender sleep interrupted");
        } catch (IOException e) {
            System.out.println(e + " Sender write exception");
        }
    }
}

class Receiver implements Runnable {

    private PipedReader in;

    public Receiver(Sender sender) throws IOException {
        in = new PipedReader(sender.getPipedWriter());
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Read: " + (char) in.read() + ", ");
            }
        } catch (IOException e) {
            System.out.println(e + " Receiver read exception");
        }
    }
}
