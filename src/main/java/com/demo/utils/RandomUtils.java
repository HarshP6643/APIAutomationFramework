package com.demo.utils;

public final class RandomUtils {

    /*
    * Business layer for Faker library
    *
    * All the business level changes will be made here
    * */

    private RandomUtils(){}

    public static int getNumber(){
        return FakerUtils.randomNumber(1,1000);
    }

    public static String getFirstName(){
        return FakerUtils.randomFirstName();
    }

    public static String getLastName(){
        return FakerUtils.randomLastName();
    }


}
