package com.example.riven_chris;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by riven_chris on 15/8/3.
 */
public class BufferedInputFile {

    public static String read(String name) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(name));
        String s;
        StringBuilder sb = new StringBuilder();
//        LinkedList<String> list = new LinkedList<String>();
        while ((s = br.readLine()) != null) {
            sb.append(s + "\n");
//            list.add(s + "\n");
        }
        br.close();

//        Iterator<String> iterator = list.descendingIterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next());
//        }

        return sb.toString();
//        return null;
    }

    public static void main(String[] args) {
        try {
            System.out.println(read("Java_IO/src/com/example/riven_chris/BufferedInputFile.java"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
