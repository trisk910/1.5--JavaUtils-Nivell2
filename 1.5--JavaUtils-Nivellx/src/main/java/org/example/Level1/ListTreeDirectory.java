package org.example.Level1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ListTreeDirectory {
    public void listDirectoryTree(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.isDirectory()) 
            System.out.println("Format de ruta incorrecte.");
        else
            listDirectoryContents(directory, 0);
    }

    private void listDirectoryContents(File directory, int level) {
        File[] files = directory.listFiles();
        if (files != null) {
            Arrays.sort(files);
            for (File file : files) {
                printFileInfo(file, level);
                if (file.isDirectory()) {
                    listDirectoryContents(file, level + 1);
                }
            }
        }
    }

    private void printFileInfo(File file, int level) {
        String type = file.isDirectory() ? "D" : "F";
        String lastModified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified()));
        String indent = "  ".repeat(level);
        System.out.println(indent + type + " " + file.getName() + " (Last Modified: " + lastModified + ")");
    }
}
