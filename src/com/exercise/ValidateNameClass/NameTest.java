package com.exercise.ValidateNameClass;

public class NameTest {
    private static NameExample nameExample;
    public static final String[] name = new String[] {"C0318G", "M0318G", "P0323A"};

    public static void main(String[] args) {
        nameExample = new NameExample();
        for (String name: name) {
            boolean isvalid = nameExample.validate(name);
            System.out.println(name +" "+ isvalid);
        }
    }
}
