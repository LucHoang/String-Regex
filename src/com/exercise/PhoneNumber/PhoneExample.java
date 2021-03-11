package com.exercise.PhoneNumber;

import com.exercise.ValidateNameClass.NameExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String PHONE_NUMBER = "^[\\d]{2}-0[\\d]{9,}$";

    public PhoneExample() {
        pattern = Pattern.compile(PHONE_NUMBER);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
