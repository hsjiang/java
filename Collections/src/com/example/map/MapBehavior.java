package com.example.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by riven_chris on 15/7/24.
 */
public class MapBehavior {

    public static void printKeys(Map<Integer, String> map) {
        System.out.println("Size = " + map.size() + ",");
        System.out.print("keys:");
        System.out.println(map.keySet());
        System.out.println(map.values());

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.print(map.get(iterator.next()) + ",");
        }
    }

    public static void test(Map<Integer, String> map) {
        System.out.println(map.getClass().getSimpleName());
        map.putAll(map);
    }

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        for (int i = 0; i < 10; i++) {
            hashMap.put(i, "s" + i);
        }
        printKeys(hashMap);
        System.out.println();

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(hashMap);
        System.out.println(linkedHashMap);

        //Least-Recently-Used
        linkedHashMap = new LinkedHashMap<Integer, String>(10, 0.75f, true);
        linkedHashMap.putAll(hashMap);
        System.out.println(linkedHashMap);

        for (int i = 0; i < 6; i++) {
            linkedHashMap.get(i);
        }
        System.out.println(linkedHashMap);
        linkedHashMap.get(0);
        System.out.println(linkedHashMap);
    }
}
