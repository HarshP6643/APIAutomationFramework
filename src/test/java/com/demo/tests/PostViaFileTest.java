package com.demo.tests;

import com.demo.constants.FrameworkConstants;
import com.demo.utils.FileUtils;
import org.testng.annotations.Test;

public class PostViaFileTest {

    /*
    * Sending request body from file
    * */

    @Test
    public void postCallViaJsonFile(){

        String body = FileUtils.readJsonAndGetAsString(FrameworkConstants.requestJsonFolderPath+ "request.json");

        System.out.println(body);
    }
}
