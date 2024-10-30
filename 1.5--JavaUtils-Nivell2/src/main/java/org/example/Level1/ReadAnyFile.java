package org.example.Level1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAnyFile {

    public void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
