package com.example.riven_chris;

import java.io.*;

/**
 * Created by riven_chris on 15/8/3.
 * 可以使用available()方法查看还有多少可供存取的字符。
 */
public class TestEOF {

    public static void main(String[] args) throws IOException {
//        writeRead();
        testEOF();
    }

    public static void testEOF() throws IOException {
        DataInputStream dis = new DataInputStream(new BufferedInputStream(
                new FileInputStream("Java_IO/src/com/example/riven_chris/TestEOF.java")));
        while (dis.available() != 0) {
            System.out.print((char) dis.readByte());
//            System.out.println(dis.readUTF());//error
        }
    }

    public static void writeRead() throws IOException {

        String s = "可以使用available()方法查看还有多少可供存取的字符。";

        char[] chars = s.toCharArray();

        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
                "Java_IO/write")));

        for (char c : chars) {
            dos.writeChar(c);
        }
//        dos.writeUTF(s);
        dos.flush();

        DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("Java_IO/write")));
        while (dis.available() != 0) {
            System.out.print(dis.readChar());
//            System.out.println(dis.readUTF());
        }
        dis.close();
    }
}
