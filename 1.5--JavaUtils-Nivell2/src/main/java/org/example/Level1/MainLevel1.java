package org.example.Level1;

public class MainLevel1 {
    public static void main(String[] args) {
        System.out.println("----------Ex1----------");
        ListDirectoryAZ listDirectoryAZ = new ListDirectoryAZ();
        System.out.println("Ex1: ");
        listDirectoryAZ.listDirectory("./src");

        System.out.println("\n----------Ex2----------");
        ListTreeDirectory listTreeDirectory = new ListTreeDirectory();
        String dList = listTreeDirectory.listDirectoryTree("./src");
        System.out.println(dList);

        System.out.println("\n----------Ex3----------");
        SaveListTXT saveListTXT = new SaveListTXT();
        saveListTXT.saveDirectoryTreeToFile("./src/", "DirectoryList.txt");
        System.out.println("Arxiu guardat com a DirectoryList.txt");

        System.out.println("\n----------Ex4----------");
        ReadAnyFile readAnyFile = new ReadAnyFile();
        readAnyFile.readFile("./src/main/resources/DirectoryList.txt");

        System.out.println("\n----------Ex5----------");
        ObjectSerialize objectSerialize = new ObjectSerialize();
        ObjectT myObject = new ObjectT("Hola", 123);
        String serFilePath = "./src/main/resources/objectTS.ser";
        objectSerialize.serializeObject(myObject, serFilePath);

        ObjectDeSerialize objectDeSerialize = new ObjectDeSerialize();
        ObjectT deserializedObject = (ObjectT) objectDeSerialize.deserializeObject(serFilePath);
        System.out.println("Deserialized Object: " + deserializedObject);
    }
}