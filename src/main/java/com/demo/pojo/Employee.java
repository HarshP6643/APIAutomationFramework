package com.demo.pojo;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(setterPrefix = "set")
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
}
