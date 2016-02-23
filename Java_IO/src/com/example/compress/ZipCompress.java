package com.example.compress;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.*;

/**
 * Created by riven_chris on 15/8/11.
 */
public class ZipCompress {

    public static void main(String[] args) throws IOException {

        args = new String[]{"test_files/data4.txt", "test_files/data5.txt"};

        FileOutputStream fs = new FileOutputStream("test_files/test.zip");

        CheckedOutputStream cos = new CheckedOutputStream(fs, new Adler32());

        ZipOutputStream zos = new ZipOutputStream(cos);

        BufferedOutputStream bos = new BufferedOutputStream(zos);
        zos.setComment("A test of java Zipping");

        for (String arg : args) {
            System.out.println("Writing file " + arg);
            BufferedReader in = new BufferedReader(new FileReader(arg));
            zos.putNextEntry(new ZipEntry(arg));
            int c;
            while ((c = in.read()) != -1) {
                bos.write(c);
            }
            in.close();
            bos.flush();
        }
        bos.close();

        System.out.println("CheckSum: " + cos.getChecksum().getValue());
        System.out.println("Read File");
        FileInputStream fis = new FileInputStream("test_files/test.zip");
        CheckedInputStream cis = new CheckedInputStream(fis, new Adler32());
        ZipInputStream zis = new ZipInputStream(cis);
        BufferedInputStream bis = new BufferedInputStream(zis);
        ZipEntry ze;
        while ((ze = zis.getNextEntry()) != null) {
            System.out.println("Reading file: " + ze);
            int x;
            while ((x = bis.read()) != -1) {
                System.out.write(x);
            }
        }

        if (args.length == 1) {
            System.out.println("CheckSum: " + cos.getChecksum().getValue());
        }
        bis.close();


        ZipFile zf = new ZipFile("test_files/test.zip");
        Enumeration e = zf.entries();
        while (e.hasMoreElements()) {
            ZipEntry ze2 = (ZipEntry) e.nextElement();
            System.out.println("File: " + ze2);
        }

    }
}
