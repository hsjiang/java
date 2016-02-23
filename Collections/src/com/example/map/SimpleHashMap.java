package com.example.map;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * Created by riven_chris on 15/7/27.
 */
public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

    static final int SIZE = 997;

    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }


}
