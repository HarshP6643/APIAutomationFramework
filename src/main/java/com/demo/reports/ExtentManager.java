package com.demo.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {

    private ExtentManager() {}

    public static final ThreadLocal<ExtentTest> extentTestThreadLocal = new ThreadLocal<>();

    protected static ExtentTest getExtentTest() {
        return extentTestThreadLocal.get();
    }

    protected static void setExtentTest(ExtentTest extentTest) {
        extentTestThreadLocal.set(extentTest);
    }

}
