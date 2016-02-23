package com.example;

import java.util.*;

/**
 * Created by riven_chris on 15/7/19.
 */
public class Countries {

    public static final String[][] DATA = {
            {"ALGERIA", "Algiers"},
            {"Angola", "Luanda"},
            {"Benin", "Proto-Novo"},
            {"Botswana", "Gaberone"},
            {"BURKINA FASO", "Ouagadougou"},
            {"BURUNDI", "Bujumbura"},
            {"CAMEROON", "Yaounde"},
            {"CAPE VERDE", "Praia"},
            {"CENTRAL AFRICAN REPUBLIC", "Bangui"},
            {"CHAD", "N'djamena"},
            {"COMOROS", "Moroni"},
    };

    private static class FlyweightMap extends AbstractMap<String, String> {
        private static class Entry implements Map.Entry<String, String> {

            int index;

            Entry(int index) {
                this.index = index;
            }

            @Override
            public String getKey() {
                return DATA[index][0];
            }

            @Override
            public String getValue() {
                return DATA[index][1];
            }

            @Override
            public String setValue(String object) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(Object o) {
                return DATA[index][0].equals(o);
            }
        }

        static class EntrySet extends AbstractSet<Map.Entry<String, String>> {
            private int size;

            public EntrySet(int size) {
                if (size < 0)
                    this.size = size;
                else if (size > DATA.length) {
                    this.size = DATA.length;
                } else
                    this.size = size;
            }

            private class Iter implements Iterator<Map.Entry<String, String>> {

                private Entry entry = new Entry(-1);

                @Override
                public boolean hasNext() {
                    return entry.index < size - 1;
                }

                @Override
                public Map.Entry<String, String> next() {
                    entry.index++;
                    return entry;
                }

                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            }

            @Override
            public Iterator<Map.Entry<String, String>> iterator() {
                return new Iter();
            }

            @Override
            public int size() {
                return size;
            }
        }

        private static Set<Map.Entry<String, String>> entries = new EntrySet(DATA.length);

        @Override
        public Set<Map.Entry<String, String>> entrySet() {
            return entries;
        }
    }

    static Map<String, String> select(final int size) {
        return new FlyweightMap() {
            @Override
            public Set<Map.Entry<String, String>> entrySet() {
                return new EntrySet(size);
            }
        };
    }

    static Map<String, String> map = new FlyweightMap();

    public static Map<String, String> capitals() {
        return map;
    }

    public static Map<String, String> capitals(int size) {
        return select(size);
    }

    static List<String> names = new ArrayList<String>(map.keySet());

    public static List<String> names() {
        return names;
    }

    public static List<String> names(int size) {
        return new ArrayList<String>(select(size).keySet());
    }

    public static void main(String[] args) {
        System.out.println(capitals(2));
    }
}
