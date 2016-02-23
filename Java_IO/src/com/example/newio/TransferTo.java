package com.example.newio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by riven_chris on 15/8/7.
 */
public class TransferTo {

    public static void main(String[] args) throws IOException {
        FileChannel in = new FileInputStream("test_files/data.txt").getChannel(),
                out = new FileOutputStream("test_files/data2.txt").getChannel();

        in.transferTo(0, in.size(), out);
        //or
//        out.transferFrom(in,0,in.size());

        FileChannel data2In = new FileInputStream("test_files/data2.txt").getChannel();
        ByteBuffer bb = ByteBuffer.allocate(8);

        while (data2In.read(bb) != -1) {
            bb.flip();
            while (bb.hasRemaining())
                System.out.print((char) bb.get());
            bb.clear();
        }
    }
}
