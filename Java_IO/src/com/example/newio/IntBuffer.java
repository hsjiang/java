package com.example.newio;

import java.nio.*;

/**
 * Created by riven_chris on 15/8/8.
 */
public class IntBuffer {

    private static final int SIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(SIZE);

        java.nio.IntBuffer buffer = byteBuffer.asIntBuffer();
        //store an array of int
        buffer.put(new int[]{11, 42, 47, 99, 143, 811, 1016});

        //absolute location read and write
        System.out.println(buffer.get(3));
        buffer.put(3, 1811);

        //Setting a new limit before rewinding the buffer.
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }

    }

}
