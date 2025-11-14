package com.testinium.And.Util.Data;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class DataReader {

    private static Properties properties = new Properties();

    static {
        loadProperties();
    }

    private static void loadProperties() {
        try {
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream("env/default/user.properties"),
                    StandardCharsets.UTF_8);
            properties.load(reader);
        } catch (IOException e) {
            throw new RuntimeException("user.properties dosyası yüklenirken hata oluştu!", e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }

    public static int getInt(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }

    public static boolean getBoolean(String key) {
        return Boolean.parseBoolean(properties.getProperty(key));
    }
}
