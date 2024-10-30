package org.example.Level2;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class Config {
    private static Configuration config;

    static {
        Configurations configs = new Configurations();
        try {
            config = configs.properties("src/main/resources/config.properties");
        } catch (ConfigurationException e) {
            e.getMessage();
        }
    }

    public static String getDirectoryPath() {
        return config.getString("directory.path");
    }

    public static String getOutputFilePath() {
        return config.getString("output.file");
    }
}
