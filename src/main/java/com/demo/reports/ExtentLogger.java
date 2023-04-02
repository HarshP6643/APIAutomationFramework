package com.demo.reports;

import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import io.restassured.response.Response;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public final class ExtentLogger {

    private ExtentLogger(){}

    public static void passLogger(String message){
        ExtentManager.getExtentTest().pass(message);
    }

    public static void infoLogger(String message){
        ExtentManager.getExtentTest().info(message);
    }

    public static void failLogger(String message){
        ExtentManager.getExtentTest().fail(MarkupHelper.createLabel(message, ExtentColor.RED));
    }

    public static void responseLogger(Response response){
        ExtentManager.getExtentTest().pass(MarkupHelper.createCodeBlock(response.asPrettyString(), CodeLanguage.JSON));
    }

    public static void requestLogger(RequestSpecification requestSpecification){
        QueryableRequestSpecification query = SpecificationQuerier.query(requestSpecification);
        infoLogger("Post request body");
        infoLogger(query.getHeaders().toString());
        ExtentManager.getExtentTest().pass(MarkupHelper.createCodeBlock(query.getBody(), CodeLanguage.JSON));
    }


}
