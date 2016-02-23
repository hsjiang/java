package com.example.riven_chris;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by riven_chris on 15/7/29.
 */
public class DirList {

    public static void main(String[] args) {
        File path = new File("Java_IO");
//        String[] array = path.list();
        String[] array = path.list(new DirFilter("(\\w)*.iml"));
        System.out.println(path.getAbsolutePath());

        Arrays.sort(array, String.CASE_INSENSITIVE_ORDER);
        for (String s : array) {
            System.out.print(s + ", ");
        }

        path.getAbsoluteFile();

    }

    static class DirFilter implements FilenameFilter {
        private Pattern pattern;

        public DirFilter(String rex) {
            pattern = Pattern.compile(rex);
        }

        @Override
        public boolean accept(File dir, String filename) {
            return pattern.matcher(filename).matches();
        }
    }
}
