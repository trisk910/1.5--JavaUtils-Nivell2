package org.example.Level1;

import java.io.Serializable;

public class ObjectT implements Serializable {
    private String name;
    private int value;

    public ObjectT(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyObject{name='" + name + "', value=" + value + "}";
    }
}
