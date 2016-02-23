package com.example.newio;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

/**
 * Created by riven_chris on 15/8/7.
 */
public class AvailableCharSets {

    public static void main(String[] args) {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        Iterator<String> iterator = charsets.keySet().iterator();

        while (iterator.hasNext()) {
            String csName = iterator.next();
            System.out.print(csName);

            Iterator<String> aliases = Charset.forName(csName).aliases().iterator();
            if (aliases.hasNext()) {
                System.out.print(": ");
            }
            while (aliases.hasNext()) {
                System.out.print(aliases.next());
                if (aliases.hasNext())
                    System.out.print(", ");
            }
            System.out.println();
        }
    }
}
