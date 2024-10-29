package org.example.Level1;

import java.io.File;
import java.util.Arrays;

public class ListDirectoryAZ {
    public void listDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.isDirectory()) {
            System.out.println("Format de ruta incorrecte.");
        }else {
            String[] files = directory.list();
            if (files != null) {
                Arrays.sort(files);
                for (String file : files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("Aquest directori esta buit.");
            }
        }
    }
}
