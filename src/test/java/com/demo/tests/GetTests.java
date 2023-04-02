package com.demo.tests;


import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.demo.builder.RequestBuilder;
import com.demo.reports.ExtentLogger;
import com.demo.reports.ExtentManager;
import com.demo.reports.ExtentReport;
import io.restassured.response.Response;
import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class GetTests extends BaseTest {

    @Test
    public void getEmployeeDetails(Method method){
        Response response = RequestBuilder.buildRequestForGetCalls().get("/employees");

        response.prettyPrint();

        /* If you want to save response using method name */

        System.out.println("Method Name is :: " +method.getName());

        assertThat(response.getStatusCode()).isEqualTo(250);
    }

}
