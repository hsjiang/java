package com.riven_chris.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by riven_chris on 2017/1/17.
 */
public class Lambdas {

    public static void main(String[] args) {
        Arrays.asList("a", "b", "c").forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        });
        Arrays.asList("a", "b", "c").forEach(str -> System.out.print(str + " "));
        Arrays.asList("a", "b", "c").forEach((String str) -> System.out.print(str + " "));


    }
}
