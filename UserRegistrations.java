package com.junituserregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrations {

    public boolean nameValid(String name) {
        String regx = "^[A-Z][a-zA-Z]{3,}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public boolean emailValid(String email) {
        String regx = "^abc[a-zA-Z0-9.]*@bl[.]co[.][a-z]{2,3}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean phoneValid(String phoneNumber) {
        String regx = "^[0-9]{2}[: :][0-9]{10}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public boolean passwordValid(String password) {
        String regx = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{8,}$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public String analyseMood(String message) {
        if (message.contains("SAd"))
            return "SAD";
        else
            return "HAPPY";
    }
}
