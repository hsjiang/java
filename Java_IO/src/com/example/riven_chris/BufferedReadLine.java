package com.example.riven_chris;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by riven_chris on 2017/2/16.
 */
public class BufferedReadLine {

    public static void main(String[] args) {
        String str = "STOR Python学习手册(第4版).txt";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(str.getBytes())));
        try {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
