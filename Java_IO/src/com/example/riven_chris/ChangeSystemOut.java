package com.example.riven_chris;

import java.io.PrintWriter;

/**
 * Created by riven_chris on 15/8/5.
 */
public class ChangeSystemOut {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Hello World");

        System.out.println("");
    }
}
