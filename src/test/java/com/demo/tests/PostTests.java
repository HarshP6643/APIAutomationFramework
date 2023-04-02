package com.demo.tests;

import com.demo.builder.RequestBuilder;
import com.demo.pojo.Employee;
import static com.demo.utils.RandomUtils.*;

import com.demo.reports.ExtentLogger;
import com.demo.utils.FakerUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;


public class PostTests {



    @Test
    public void postCallTest(){

        Employee employeeBuilder = Employee.builder()
                .setId(getNumber())
                .setFirstName(getFirstName())
                .setLastName(getLastName())
                .build();

        RequestSpecification requestSpecification = RequestBuilder.buildRequestForPostCalls()
                .body(employeeBuilder);

        ExtentLogger.requestLogger(requestSpecification);

        Response response = requestSpecification.post("/employees");

        assertThat(response.getStatusCode()).isEqualTo(205);
    }
}
