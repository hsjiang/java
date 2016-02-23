package com.example.riven_chris;

import java.util.LinkedHashMap;

/**
 * Created by riven_chris on 15/8/26.
 */
public class SwapValue {

    public static void main(String[] args) {
        int a = 1, b = 2;

        a = a ^ b;
        System.out.println("a: " + a);
        b = b ^ a;
        a = a ^ b;

        System.out.println("a: " + a + " ,b: " + b);
    }
}
