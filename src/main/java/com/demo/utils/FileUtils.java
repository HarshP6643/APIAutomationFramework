package com.demo.utils;

import io.restassured.response.Response;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class FileUtils {

    private FileUtils(){}

    public static String readJsonAndGetAsString(String filePath){
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void storeStringAsJsonFile(String filePath, Response response){
        try {
            Files.write(Paths.get(filePath), response.asByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
