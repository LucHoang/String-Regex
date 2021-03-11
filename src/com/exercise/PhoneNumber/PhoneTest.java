package com.exercise.PhoneNumber;

import com.exercise.ValidateNameClass.NameExample;

public class PhoneTest {
    private static PhoneExample phoneExample;
    public static final String[] name = new String[] {"84-0978889648", "842978489648", "84-1978489648", "84-09b8489648"};

    public static void main(String[] args) {
        phoneExample = new PhoneExample();
        for (String name: name) {
            boolean isvalid = phoneExample.validate(name);
            System.out.println(name +" "+ isvalid);
        }
    }
}
