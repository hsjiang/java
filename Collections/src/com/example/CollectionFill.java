package com.example;

import java.util.*;

/**
 * Created by riven_chris on 15/7/18.
 */
public class CollectionFill {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Collections.nCopies(5, "sn"));

        System.out.println(list.toString());

        Collections.fill(list, "ss");

        System.out.println(list.toString());

        Set<String> set = new HashSet<String>();
        set.addAll(list);

        HashMap<String, String> map;
    }
}
