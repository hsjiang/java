package com.example.queue;

import com.example.Generator;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by riven_chris on 15/7/23.
 */
public class QueueBehavior {

    private static int count = 10;

    static <T> void test(Queue<T> queue, Generator<T> gen) {
        for (int i = 0; i < count; i++) {
            queue.offer(gen.next());
        }

        while (queue.peek() != null)
            System.out.print(queue.remove() + " ");
        System.out.println();
    }

    static class Gen implements Generator<String> {
        String[] s = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",};
        int i;

        @Override
        public String next() {
            return s[i++];
        }
    }

    public static void main(String[] args) {
        test(new LinkedList<String>(), new Gen());
        test(new PriorityQueue<String>(), new Gen());
        test(new ArrayBlockingQueue<String>(count), new Gen());
        test(new LinkedBlockingQueue<String>(), new Gen());

        Deque deque;
        PriorityQueue<String> priorityQueue;

    }
}
