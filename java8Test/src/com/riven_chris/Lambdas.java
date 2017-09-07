package com.riven_chris;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * Created by riven_chris on 2017/1/17.
 */
public class Lambdas {

    public static void main(String[] args) {
        Arrays.asList("a", "b", "c").forEach(str -> System.out.print(str + " "));
        Arrays.asList("a", "b", "c").forEach((String str) -> System.out.print(str + " "));
    }
}
