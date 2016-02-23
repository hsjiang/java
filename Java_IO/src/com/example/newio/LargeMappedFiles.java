package com.example.newio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by riven_chris on 15/8/10.
 */
public class LargeMappedFiles {

    private static final int SIZE = 0x8ffffff;

    public static void main(String[] args) throws IOException {

        MappedByteBuffer out = new RandomAccessFile("test_files/test.dat", "rw")
                .getChannel().map(FileChannel.MapMode.READ_WRITE, 0, SIZE);

        for (int i = 0; i < SIZE; i++) {
            out.put((byte) 'x');
        }
        System.out.println("Finished writing");

        for (int i = SIZE / 2; i < SIZE / 2 + 6; i++) {
            System.out.print((char) out.get(i));
        }
    }
}
