package com.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by riven_chris on 15/5/17.
 */
public class LinkedListMethods {

    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        System.out.println(l.getFirst() + "," + l.element() + "," + l.peek());

        System.out.println(l.poll() + "," + l.remove());

        Iterator<Integer> iterator = l.descendingIterator(); //反序遍历
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");
        }

        System.out.println("\n" + l.peekFirst() + "," + l.peekLast());

        l.offer(11);
        System.out.println(l);

        l.add(12);
        System.out.println(l);
    }
}
