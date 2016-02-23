package com.example.hashCode;

import java.util.*;

/**
 * Created by riven_chris on 15/7/27.
 * Creating a good hashCode();
 */
public class CountedString {
    protected static List<String> created = new ArrayList<String>();
    private String s;
    private int id = 0;

    public CountedString(String str) {
        this.s = str;
        created.add(s);
        for (String s1 : created) {
            if (s1.equals(s)) {
                id++;
            }
        }
    }

    @Override
    public String toString() {
        return "String: " + s + " id: " + id + " hashCode: " + hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CountedString &&
                s.equals(((CountedString) o).s) &&
                id == (((CountedString) o).id);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;

        return result;
    }

    public static void main(String[] args) {
//        Map<CountedString, Integer> map = new HashMap<CountedString, Integer>();
//
//        CountedString[] cs = new CountedString[5];
//        for (int i = 0; i < cs.length; i++) {
//            cs[i] = new CountedString("hi");
//            map.put(cs[i], i);
//        }
//        System.out.println(map);
//
//        for (CountedString c : cs) {
//            System.out.println("Looking up: " + c);
//            System.out.println(map.get(c));
//        }

//        Map<Individual, Integer> map = new HashMap<Individual, Integer>();
        Map<Individual, Integer> map = new TreeMap<Individual, Integer>();
        Individual[] cs = new Individual[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new Individual("hi" + i);
            map.put(cs[i], i);
        }
        System.out.println(map);

        for (Individual c : cs) {
            System.out.println("Looking up: " + c);
            System.out.println(map.get(c));
        }

        TreeSet set;
    }
}
