package com.example.newio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * Created by riven_chris on 15/8/7.
 */
public class BufferToText {
    private static final int SIZE = 1024;
    private static final String file = "test_files/data3.txt";
    private static final String content = "1234123412341234一二三四五";

    public static void main(String[] args) throws IOException {
        FileChannel fc = new FileOutputStream(file).getChannel();
        fc.write(ByteBuffer.wrap(content.getBytes()));
        fc.close();
        fc = new FileInputStream(file).getChannel();
        ByteBuffer bf = ByteBuffer.allocate(SIZE);
        fc.read(bf);
        bf.flip();
        //doesn't work
        System.out.println(bf.asCharBuffer().toString());

        //decode using this system's default charset
        bf.rewind();
        String encoding = System.getProperty("file.encoding");
        System.out.println("Decoded Using " + encoding + ":" + Charset.forName(encoding).decode(bf));
        //or, we could encode with something that will print:
        fc = new FileOutputStream(file).getChannel();
        fc.write(ByteBuffer.wrap(content.getBytes("UTF-16BE")));
        fc.close();
        fc = new FileInputStream(file).getChannel();
        bf.clear();
        fc.read(bf);
        bf.flip();
        System.out.println(bf.asCharBuffer());

        //Use a CharBuffer to write through:
        fc = new FileOutputStream(file).getChannel();
        bf = ByteBuffer.allocate(24);// more than needed
        bf.asCharBuffer().put("六七八九");
        fc.write(bf);
        fc.close();
        //read and display
        fc = new FileInputStream(file).getChannel();
        bf.clear();
        fc.read(bf);
        bf.flip();
        System.out.println(bf.asCharBuffer());
    }
}
