package org.example.Level1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerialize {
    public void serializeObject(Object obj, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(obj);
            System.out.println("Object has been serialized to " + filePath);
        } catch (IOException e) {
           e.getMessage();
        }
    }
}
