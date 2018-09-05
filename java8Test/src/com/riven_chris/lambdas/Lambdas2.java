package com.riven_chris.lambdas;

public class Lambdas2 {

    public static void main(String[] args) {
        G<String, Integer> g = String::length;

        System.out.print(g.apply("hahha"));
    }

    interface G<A, B> {
        B apply(A a);
    }
}
