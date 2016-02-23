package com.example.riven_chris;

import java.io.File;
import java.io.IOException;

/**
 * Created by riven_chris on 15/7/30.
 */
public class MakeDirectories {

    private static void usage() {
        System.err.println(
                "Usage:MakeDirectories path1 ...\n" +
                        "Create each path\n" +
                        "Usage:MakeDirectories -d path1 ...\n" +
                        "Delete each path\n" +
                        "Usage:MakeDirectories -r path1 path2\n" +
                        "renames form path1 to path2");
        System.exit(1);
    }

    private static void fileData(File f) {
        System.out.println(
                "Absolute path: " + f.getAbsolutePath() +
                        "\n Can read: " + f.canRead() +
                        "\n Can write: " + f.canWrite() +
                        "\n getName: " + f.getName() +
                        "\n getParent: " + f.getParent() +
                        "\n getPath: " + f.getPath() +
                        "\n length: " + f.length() +
                        "\n lastModified: " + f.lastModified());
        if (f.isFile()) {
            System.out.println("It's a file");
        } else if (f.isDirectory()) {
            System.out.println("It's a directory");
        }

    }

    public static void main(String[] args) {
        File file = new File("testFile");
        File rname = new File("file_test");
        file.renameTo(rname);
//        fileData(file);
//        fileData(rname);
        rname.delete();

        File newFile = new File("file_test.jpg");
        if (newFile.exists()) {
            newFile.delete();
            System.out.println("deleting " + newFile);
        } else {
            newFile.mkdirs();
            System.out.println("creating " + newFile);
        }

//        try {
//            File.createTempFile("icon", ".jpg", newFile);
//            System.out.println("createTempFIle success");
//        } catch (IOException e) {
//            System.out.println("createTempFIle failed");
//            e.printStackTrace();
//        }
    }
}
