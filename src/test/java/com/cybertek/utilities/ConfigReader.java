package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // to use the value from the properties file

    private static Properties properties;

    static{

        String path = "configuration.properties";

        // java can not read files directly, therefor we need to useFileInputStream
        // class to read files
        // FileInputStream takes the location/path of the file as a constructor



        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            properties = new Properties();
            properties.load(fileInputStream);

            fileInputStream(close);


        } catch (IOException e) {
            e.printStackTrace();
        }

        public static String getProperty(String property){


            return properties.getProperty(property);
        }


    }

}
