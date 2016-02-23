package com.example;

import java.util.*;

/**
 * Created by riven_chris on 15/5/13.
 */
public class PrintContainers {

    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        collection.add("mouse");
        collection.add("tiger");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        map.put("mouse", "Micky");
        map.put("tiger", "Scott");
        return map;
    }

    static void print(Collection collection) {
        System.out.println(collection);
    }

    static void print(Map map) {
        System.out.println(map);
    }

    public static void main(String[] args) {
        print(fill(new ArrayList<String>()));
        print(fill(new LinkedList<String>()));
        print(fill(new HashSet<String>()));
        print(fill(new LinkedHashSet<String>()));

        print(fill(new HashMap<String, String>()));
        print(fill(new TreeMap<String, String>()));
        print(fill(new LinkedHashMap<String, String>()));
    }
}
