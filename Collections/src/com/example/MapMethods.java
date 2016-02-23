package com.example;

import java.lang.ref.SoftReference;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by riven_chris on 15/5/21.
 */
public class MapMethods {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        map.put("k5", "v5");
        map.put("k6", "v6");

        Set set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");
        }

        map.remove("", "");

        HashMap hashMap;//单向量表；
        TreeMap treeMap;//双向链表；
        LinkedHashMap linkedHashMap;//双向链表；
        HashSet hashSet;//hashMap；
        TreeSet treeSet;//sortedMap；
        LinkedHashSet linkedHashSet;//LinkedHashMap；
        LinkedBlockingDeque linkedBlockingDeque;//双向链表

        LinkedList linkedList;
        WeakHashMap weakHashMap;
    }
}
