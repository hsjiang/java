package com.example.compress;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by riven_chris on 15/8/11.
 */
public class GZIPCompress {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("test_files/data3.txt"));

        GZIPOutputStream out = new GZIPOutputStream(new BufferedOutputStream(
                new FileOutputStream("test_files/test.gz")));

        System.out.println("Writing File");
        int c;
        while ((c = br.read()) != -1) {
            out.write(c);
        }
        out.close();
        br.close();
        System.out.println("Reading File");

        BufferedReader in = new BufferedReader(new InputStreamReader(
                new GZIPInputStream(new FileInputStream("test_files/test.gz"))));
        String s;
        while ((s = in.readLine()) != null) {
            System.out.println(s);
        }
        in.close();
    }
}
