package com.example.riven_chris;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.URLConnection;

/**
 * Created by riven_chris on 15/8/3.
 * 格式化的内存输入
 */
public class FormattedMemoryInput {

    public static void main(String[] args) {

        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new ByteArrayInputStream(
                    BufferedInputFile.read("Java_IO/src/com/example/riven_chris/FormattedMemoryInput.java").getBytes()
            ));

            while (dis.available() != 0) {
                System.out.print((char) dis.readByte());//中文字符会乱码
            }
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("end of stream");
        }
    }
}
