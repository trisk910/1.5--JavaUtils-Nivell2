package org.example.Level1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class SaveListTXT {

    public void saveDirectoryTreeToFile(String directoryPath, String outputFileName) {
        ListTreeDirectory listTreeDirectory = new ListTreeDirectory();
        String directoryTree = listTreeDirectory.listDirectoryTree(directoryPath);
        String outputPath = Paths.get("src", "main", "resources", outputFileName).toString();
        try (FileWriter writer = new FileWriter(outputPath)) {
            writer.write(directoryTree);
        } catch (IOException e) {
           e.getMessage();
        }
    }
}