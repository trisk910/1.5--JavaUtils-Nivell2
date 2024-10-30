package org.example.Level1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDeSerialize {
    public Object deserializeObject(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Object obj = ois.readObject();
            System.out.println("Object has been deserialized from " + filePath);
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            e.getMessage();
            return null;
        }
    }
}
