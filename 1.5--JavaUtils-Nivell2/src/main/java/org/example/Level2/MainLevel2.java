package org.example.Level2;

import org.example.Level1.ListDirectoryAZ;
import org.example.Level1.ListTreeDirectory;
import org.example.Level1.ReadAnyFile;

import org.example.Level2.Config;

public class MainLevel2 {
    public static void main(String[] args) {
        System.out.println("----------Ex1----------");
        ListDirectoryAZ listDirectoryAZ = new ListDirectoryAZ();
        System.out.println("Ex1: ");
        listDirectoryAZ.listDirectory(Config.getDirectoryPath());

        System.out.println("\n----------Ex2----------");
        ListTreeDirectory listTreeDirectory = new ListTreeDirectory();
        String dList = listTreeDirectory.listDirectoryTree(Config.getDirectoryPath());
        System.out.println(dList);

        System.out.println("\n----------Ex3----------");
        SaveListLevel2 saveList = new SaveListLevel2();
        saveList.saveDirectoryTreeToFile();
        System.out.println("Arxiu guardat com a DirectoryList.txt" + Config.getOutputFilePath());

        System.out.println("\n----------Ex4----------");
        ReadAnyFile readAnyFile = new ReadAnyFile();
        readAnyFile.readFile("src/main/resources/" + Config.getOutputFilePath());
    }
}