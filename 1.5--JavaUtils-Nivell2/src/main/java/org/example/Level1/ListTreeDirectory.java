package org.example.Level1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ListTreeDirectory {
    public String listDirectoryTree(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.isDirectory() || !directory.canRead()) {
            return "Format de ruta incorrecte.";
        }
        StringBuilder result = new StringBuilder();
        listDirectoryContents(directory, 0, result);
        return result.toString();
    }

    private void listDirectoryContents(File directory, int level, StringBuilder result) {
        File[] files = directory.listFiles();
        if (files != null && files.length > 0) {
            Arrays.sort(files);
            for (File file : files) {
                appendFileInfo(file, level, result);
                if (file.isDirectory()) {
                    listDirectoryContents(file, level + 1, result);
                }
            }
        }
    }

    private void appendFileInfo(File file, int level, StringBuilder result) {
        String type = file.isDirectory() ? "D" : "F";
        String lastModified = new SimpleDateFormat("dd-MM-yyyy").format(new Date(file.lastModified()));
        String indent = "  ".repeat(level);
        result.append(indent).append(type).append(" ").append(file.getName())
                .append(" (Ultima modificacio: ").append(lastModified).append(")\n");
    }
}

