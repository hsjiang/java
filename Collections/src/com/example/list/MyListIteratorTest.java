package com.example.list;

import com.example.Countries;

import java.util.*;

/**
 * Created by riven_chris on 15/7/22.
 */
public class MyListIteratorTest {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(Countries.names());

        LinkedList<String> linkedList = new LinkedList<String>(Countries.names());

        Iterator<String> iterator1 = arrayList.iterator();
        Iterator<String> iterator2 = linkedList.iterator();

        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
        System.out.println();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }

        ListIterator<String> listIterator1 = arrayList.listIterator(arrayList.size());
        ListIterator<String> listIterator2 = linkedList.listIterator();

        System.out.println();
        while (listIterator1.hasPrevious()) {
            System.out.print(listIterator1.previous() + " " + listIterator2.previousIndex() + ", ");
            if (listIterator2.hasNext()) {
                listIterator1.add(listIterator2.next());
                listIterator1.previous();  //让cursor向前移动一位
            }
        }

        System.out.println();
        System.out.print(arrayList.toString());
    }
}
