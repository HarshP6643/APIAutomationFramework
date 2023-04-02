package com.demo.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.demo.constants.FrameworkConstants;
import com.demo.utils.PropertyUtils;

public final class ExtentReport {

    public static ExtentReports extentReports;
    public static ExtentTest extentTest;

    public static void initReports(){
        extentReports=new ExtentReports();
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(FrameworkConstants.extentReportPath);
        extentReports.attachReporter(extentSparkReporter);
        extentReports.setSystemInfo("test", "Demo");
    }

    public static void tearDownReports(){
        extentReports.flush();
    }

    public static void createTest(String methodName){
        extentTest = extentReports.createTest(methodName);
        ExtentManager.setExtentTest(extentTest);
    }


}
