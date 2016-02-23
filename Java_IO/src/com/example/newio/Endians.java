package com.example.newio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * Created by riven_chris on 15/8/8.
 */
public class Endians {

    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.wrap(new byte[12]);
        buffer.asCharBuffer().put("abcdef");
        System.out.println(Arrays.toString(buffer.array()));
        buffer.rewind();

        buffer.order(ByteOrder.BIG_ENDIAN);
        buffer.asCharBuffer().put("abcdef");
        System.out.println(Arrays.toString(buffer.array()));
        buffer.rewind();

        buffer.order(ByteOrder.LITTLE_ENDIAN);
        buffer.asCharBuffer().put("abcdef");
        System.out.println(Arrays.toString(buffer.array()));
        buffer.rewind();
    }
}
