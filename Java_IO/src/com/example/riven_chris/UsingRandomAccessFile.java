package com.example.riven_chris;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by riven_chris on 15/8/5.
 */
public class UsingRandomAccessFile {
    private static String file = "test_files/rtest.dat";

    static void display() throws IOException {
        RandomAccessFile raf = new RandomAccessFile(file, "r");
        for (int i = 0; i < 7; i++) {
            System.out.println("Value " + i + ": " + raf.readDouble());
        }
        System.out.println(raf.readUTF());
        raf.close();

//        raf.seek();
    }

    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        for (int i = 0; i < 7; i++) {
            raf.writeDouble(i * 1.414);
        }

        raf.writeUTF("The end of the file");

        raf.close();

        display();
    }
}
