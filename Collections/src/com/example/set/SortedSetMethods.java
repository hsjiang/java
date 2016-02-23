package com.example.set;

import java.util.TreeSet;

/**
 * Created by riven_chris on 15/7/23.
 */
public class SortedSetMethods {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("f");
        set.add("g");
        set.add("h");
        set.add("i");

        System.out.println(set.first());
        System.out.println(set.pollFirst());
        System.out.println(set);
        System.out.println(set.last());

        System.out.println(set.headSet("f"));
        System.out.println(set.tailSet("g"));
    }
}
