package com.example.newio;

import jdk.management.resource.internal.inst.SocketInputStreamRMHooks;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SocketChannel;
import java.util.TreeMap;

/**
 * Created by riven_chris on 15/8/10.
 * 交换相邻字符，对CharBuffer中字符进行编码和译码
 */
public class UsingBuffers {

    private static void symmetricScramble(CharBuffer charBuffer) {
        while (charBuffer.hasRemaining()) {
            charBuffer.mark();
            char c1 = charBuffer.get();
            char c2 = charBuffer.get();
            charBuffer.reset();
            charBuffer.put(c2).put(c1);
        }
    }

    public static void main(String[] args) {
        char[] data = "UsingBuffers".toCharArray();
        ByteBuffer bb = ByteBuffer.allocate(data.length * 2);
        CharBuffer cb = bb.asCharBuffer();
        cb.put(data);
        System.out.println(cb.rewind());
        symmetricScramble(cb);
        System.out.println(cb.rewind());
        symmetricScramble(cb);
        System.out.println(cb.rewind());

        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
        new Thread(r).start();
    }
}
