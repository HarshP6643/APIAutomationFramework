package com.demo.utils;

import com.github.javafaker.Faker;

public final class FakerUtils {

    /*
    *   Third party library management using layers principal
    *  */
    private FakerUtils(){}

    private static final Faker faker = new Faker();

    protected static int randomNumber(int startValue, int endValue){
        return faker.number().numberBetween(startValue,endValue);
    }

    protected static String randomFirstName(){
        return faker.name().firstName();
    }

    protected static String randomLastName(){
        return faker.name().lastName();
    }

}
