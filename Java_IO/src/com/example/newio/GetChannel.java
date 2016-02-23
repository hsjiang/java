package com.example.newio;

import com.example.riven_chris.BufferedInputFile;
import com.sun.xml.internal.ws.util.ByteArrayBuffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by riven_chris on 15/8/6.
 */
public class GetChannel {
    private static final int SIZE = 1024;
    private static final String FILE = "test_files/data.txt";

    public static void main(String[] args) throws IOException {

        FileChannel fc = new FileOutputStream(FILE).getChannel();
        fc.write(ByteBuffer.wrap(("1234567812345678").getBytes()));//byteBuffer.put()
        fc.close();

        //add to the end of the file
        fc = new RandomAccessFile(FILE, "rw").getChannel();
        fc.position(fc.size());  //move to the end
        fc.write(ByteBuffer.wrap(("1234567812345678").getBytes()));
        fc.close();

        //read the file
        fc = new FileInputStream(FILE).getChannel();
        ByteBuffer bb = ByteBuffer.allocate(SIZE);
        fc.read(bb);
        bb.flip();
//      doesn't work
//        System.out.println(bb.asCharBuffer());

        while (bb.hasRemaining()) {
            System.out.print((char) bb.get());
        }
    }
}
