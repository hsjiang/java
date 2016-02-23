package com.example;

import java.util.*;

/**
 * Created by riven_chris on 15/5/16.
 */
public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println("l1: " + l1);


        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        System.out.println("l2: " + l2);

        l1.add(3, 8);
        System.out.println("l1.add(3,8): " + l1);

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(7);
        set.add(8);
        set.add(9);
        l1.addAll(2, set);
//        System.out.println("l1.addAll(HashSet): " + l1);
        System.out.println("l1.addAll(int,HashSet): " + l1);

        int index = l1.indexOf(8);
        System.out.println("l1.indexOf() " + index);

        int lastIndex = l1.lastIndexOf(8);
        System.out.println("l1.LastIndexOf() " + lastIndex);

        Object[] array = l1.toArray();
        System.out.println("l1.toArray() " + Arrays.asList(array));

//        Integer[] iArray = new Integer[6];
//        iArray = l1.toArray(iArray);
//        System.out.println("l1.toArray(T[]) " + Arrays.asList(iArray));

        System.out.println("l1.subList() " + l1.subList(1, 7));

//        l1.retainAll(l2);
        System.out.println("l1.retainAll()" + l1);

        ListIterator<Integer> listIterator = l1.listIterator(3);
//        l1.iterator();
//        l1.listIterator();

//        listIterator.hasPrevious();
//        listIterator.set(5);
//        listIterator.add(5);
//        listIterator.remove();

        while (listIterator.hasNext()) {
            Integer i = listIterator.next();
            System.out.print(i + ",");
        }

        Map map;
        Stack stack;
        SortedSet sortedSet;

//        Collections.shuffle();
    }
}
