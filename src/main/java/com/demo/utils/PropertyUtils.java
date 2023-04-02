package com.demo.utils;

import com.demo.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class PropertyUtils {

    private PropertyUtils(){}

    /*
    *  Rather than reading property file everytime,
    *  we need something from property file
    *  Read once and store it in some java collection
    * */

    public static String getProperties(String key){

        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(FrameworkConstants.configPropertyFilePath);
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return String.valueOf(properties.getProperty(key));
    }

}
