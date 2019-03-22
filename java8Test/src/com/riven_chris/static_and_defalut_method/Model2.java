package com.riven_chris.static_and_defalut_method;

@FunctionalInterface
public interface Model2<T> {
    T get();

    default void function2() {
        System.out.println("Model2 function2");
    }
}
