package com.demo.builder;

import com.demo.reports.ExtentLogger;
import com.demo.utils.PropertyUtils;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.Objects;

import static io.restassured.RestAssured.given;

public final class RequestBuilder { // keeping final so that no one can extend it

    private RequestBuilder(){/* So we cant create obj of the class */}


    public static RequestSpecification buildRequestForGetCalls(){
        return given().baseUri(PropertyUtils.getProperties("baseurl"))
                .log().all();
    }

    public static RequestSpecification buildRequestForPostCalls(){
        return given().baseUri(PropertyUtils.getProperties("baseurl"))
                .log().all().contentType(ContentType.JSON);
    }

}
