package com.exercise.ValidateNameClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameExample {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String NAME_CLASS = "^[ACP]{1,}[\\d]{4,}[GHIKLM]$";

    public NameExample() {
        pattern = Pattern.compile(NAME_CLASS);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
