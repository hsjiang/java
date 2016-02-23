package com.example.riven_chris;

import java.io.*;

/**
 * Created by riven_chris on 15/8/5.
 */
public class BinaryFile {

    public static byte[] read(File file) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        try {
            byte[] data = new byte[bis.available()];
            bis.read(data);
            return data;
        } finally {
            bis.close();
        }
    }

    public static byte[] read(String file) throws IOException {
        return read(new File(file).getAbsoluteFile());
    }

    public static void main(String[] args) throws IOException {
        byte[] bytes = read("Java_IO/src/com/example/riven_chris/BinaryFile.java");
        System.out.println(new String(bytes, "UTF-8"));
    }
}
