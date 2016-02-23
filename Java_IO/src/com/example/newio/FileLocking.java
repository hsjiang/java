package com.example.newio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

/**
 * Created by riven_chris on 15/8/10.
 */
public class FileLocking {

    public static void main(String[] args) throws IOException, InterruptedException {
        FileOutputStream fos = new FileOutputStream("test_files/data2.txt");
        FileLock lock = fos.getChannel().tryLock();
        if (lock != null) {
            System.out.println("Locked File");
            TimeUnit.SECONDS.sleep(2);
            lock.release();
            System.out.println("Released Lock");
        }
        fos.close();
    }
}
