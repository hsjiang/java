package com.riven_chris.static_and_defalut_method;

@FunctionalInterface
public interface Model<T> {
    T get();

    static void function1() {
        System.out.println("Model function1");
    }

    default void function2() {
        System.out.println("Model function2");
    }
}
