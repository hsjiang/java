package com.example.newio;

import java.nio.ByteBuffer;

/**
 * Created by riven_chris on 15/8/8.
 */
public class GetData {

    private static final int SIZE = 1024;

    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocate(SIZE);

        //Allocation automatically zeroes the ByteBuffer
        int i = 0;
        while (i++ < buffer.limit()) {
            if (buffer.get() != 0)
                System.out.println("nonZero");
        }
        System.out.println("i = " + i);
        buffer.rewind();

        //store and read a char array;
        buffer.asCharBuffer().put("Howdy!");
        char c;
        while ((c = buffer.getChar()) != 0) {
            System.out.print(c + " ");
        }
        System.out.println();
        buffer.rewind();

        //store and read a short
        buffer.asShortBuffer().put((short) 471142);
        System.out.println(buffer.getShort());
        buffer.rewind();

        //store and read a int
        buffer.asIntBuffer().put(2147483647);
        System.out.println(buffer.getInt());
        buffer.rewind();

        //store and read a long
        buffer.asLongBuffer().put(2147483647);
        System.out.println(buffer.getLong());
        buffer.rewind();

        //store and read a float
        buffer.asFloatBuffer().put(2147483647);
        System.out.println(buffer.getFloat());
        buffer.rewind();

        //store and read a double
        buffer.asDoubleBuffer().put(2147483647);
        System.out.println(buffer.getDouble());
        buffer.rewind();

    }
}
