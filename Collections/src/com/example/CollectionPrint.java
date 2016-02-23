package com.example;

import java.util.*;

/**
 * Created by riven_chris on 15/7/18.
 */
public class CollectionPrint {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add("string" + i);
        }
        System.out.println(list.toString());

        Set<String> set = new HashSet<String>();
        for (int i = 0; i < 10; i++) {
            set.add("set" + i);
        }
        System.out.println(set.toString());
    }
}
