package com.example;

import java.util.*;

/**
 * Created by riven_chris on 15/5/13.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
//        Collection<Integer> c = new HashSet<Integer>();
//        for (int i = 0; i < 10; i++) {
//            c.add(i);
//        }
//
//        for (Integer i : c) {
//            System.out.print(i + ", ");
//        }

        Integer[] array = new Integer[]{1, 3, 5, 4, 2};
        Arrays.asList(1, 2, 3, 4);

        Arrays.sort(array);
        List<Integer> list = Arrays.asList(array);

        //UnsupportedOperationException
//        list.add(9);
//        list.remove(1);
        for (Integer i : list) {
//            System.out.print(i + ", ");
        }

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
//        linkedList.remove(1);
        linkedList.add(1, 4);
//        System.out.print("\n" + linkedList);

        Integer[] fillArray = new Integer[15];
        Arrays.fill(fillArray, 2, 10, 4);
        System.out.print(Arrays.asList(fillArray));

    }
}
