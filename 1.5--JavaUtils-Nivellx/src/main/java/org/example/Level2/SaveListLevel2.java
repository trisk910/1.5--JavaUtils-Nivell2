package org.example.Level2;

import org.example.Level1.ListTreeDirectory;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class SaveListLevel2 {


    public void saveDirectoryTreeToFile() {
        ListTreeDirectory listTreeDirectory = new ListTreeDirectory();
        String directoryTree = listTreeDirectory.listDirectoryTree(Config.getDirectoryPath());

        String outputPath = Paths.get("src", "main", "resources", Config.getOutputFilePath()).toString();

        try (FileWriter writer = new FileWriter(outputPath)) {
            writer.write(directoryTree);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}