package com.example.newio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by riven_chris on 15/8/6.
 */
public class ChannelCopy {

    private static final int SIZE = 1024;

    public static void main(String[] args) throws IOException {
        FileChannel in = new FileInputStream("test_files/data.txt").getChannel(),
                out = new FileOutputStream("test_files/data2.txt").getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(SIZE);

        //本例中并不是处理此类操作的最理想方式。使用特殊方法transferTo()和transferFrom()。
        while (in.read(buffer) != -1) {
            buffer.flip();//Prepare for writing
            out.write(buffer);
            buffer.clear();//Prepare for reading
        }
    }
}
