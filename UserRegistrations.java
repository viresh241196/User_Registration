package com.junituserregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserValidation{
    boolean matchPattern(String pattern, String name);
}
public class UserRegistrations {
    static String namePattern = "^[A-Z][a-zA-Z]{3,}";
    static String emailPattern ="^abc[a-zA-Z0-9.]*@bl[.]co[.][a-z]{2,3}";
    static String phonePattern ="^[0-9]{2}[: :][0-9]{10}";
    static String passwordPattern ="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{8,}$";
    UserValidation validate = (String pattern, String name) -> Pattern.matches(pattern, name);

    public boolean nameValidation(String name) throws UserRegistrationException {
        try {
            if (name.isEmpty()) throw new UserRegistrationException("Entered value is empty",
                    UserRegistrationException.ExceptionType.EmptyType);
            return validate.matchPattern(namePattern,name);
        } catch (NullPointerException e) {
            throw new UserRegistrationException("entered null", UserRegistrationException.ExceptionType.NullType);
        }
    }

    public boolean emailValidation(String email) throws UserRegistrationException {
        try {
            if (email.isEmpty()) throw new UserRegistrationException("Entered value is empty",
                    UserRegistrationException.ExceptionType.EmptyType);
            return validate.matchPattern(emailPattern,email);
        } catch (NullPointerException e) {
            throw new UserRegistrationException("entered null", UserRegistrationException.ExceptionType.NullType);
        }
    }

    public boolean phoneValidation(String phoneNumber) throws UserRegistrationException {
        try {
            if (phoneNumber.isEmpty()) throw new UserRegistrationException("Entered value is empty",
                    UserRegistrationException.ExceptionType.EmptyType);
            return validate.matchPattern(phonePattern,phoneNumber);
        } catch (NullPointerException e) {
            throw new UserRegistrationException("entered null", UserRegistrationException.ExceptionType.NullType);
        }
    }

    public boolean passwordValidation(String password) throws UserRegistrationException {
        try {
            if (password.isEmpty()) throw new UserRegistrationException("Entered value is empty",
                    UserRegistrationException.ExceptionType.EmptyType);
            return validate.matchPattern(passwordPattern,password);
        } catch (NullPointerException e) {
            throw new UserRegistrationException("entered null", UserRegistrationException.ExceptionType.NullType);
        }
    }

    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }

    public static boolean emailSampleValidation(String email) {
        String regx = "^abc[a-zA-Z0-9.+-]*@[a-z]*[.][a-z]{2,5}[.,a-z]{0,5}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
