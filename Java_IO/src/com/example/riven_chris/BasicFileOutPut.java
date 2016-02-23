package com.example.riven_chris;

import java.io.*;

/**
 * Created by riven_chris on 15/8/4.
 */
public class BasicFileOutPut {
    static String file = "test_files/BasicFileOutPut.out";

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new StringReader(
                BufferedInputFile.read("Java_IO/src/com/example/riven_chris/BasicFileOutPut.java")));

//        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));//执行装饰工作
        PrintWriter pw = new PrintWriter(file);//使用快捷方式
//        BufferedWriter pw = new BufferedWriter(new FileWriter(file));

        int lineCount = 1;

        String s;

        while ((s = br.readLine()) != null) {
            pw.println(lineCount++ + ": " + s);
//            pw.write(lineCount++ + ": " + s + "\n");
        }
        pw.close();

        System.out.println(BufferedInputFile.read(file));
    }
}
