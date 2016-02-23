package com.example.riven_chris;

import java.io.StringReader;

/**
 * Created by riven_chris on 15/8/3.
 * //从内存输入
 */
public class MemoryInput {

    public static void main(String[] args) {
        try {
            StringReader sr = new StringReader(BufferedInputFile.read("Java_IO/src/com/example/riven_chris/MemoryInput.java"));
            int c;
            while ((c = sr.read()) != -1) {
                System.out.print((char) c);//read() 是以int形式返回下一字节，因此必须强制转换为char型；
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
