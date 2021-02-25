package com.junituserregistration;

import org.junit.rules.ExpectedException;

import org.junit.Assert;
import org.junit.Test;


public class JunitUserRegistrationTest {

    @Test
    public void checkNameValidationReturnTrue() {
        UserRegistrations checkName = new UserRegistrations();
        try {
            Assert.assertEquals(true, checkName.nameValidation("Viresh"));
        } catch (Exception e) {
            System.out.println("Invalid with exception " + e);
        }
    }

    @Test
    public void givenNameAsNullReturnException() throws UserRegistrationException {
        UserRegistrations checkName = new UserRegistrations();
        try {
            boolean name = checkName.nameValidation(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, name);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenNameAsEmptyReturnException() throws UserRegistrationException {
        UserRegistrations checkName = new UserRegistrations();
        try {
            boolean name = checkName.nameValidation("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, name);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void checkEmailValidationReturnTrue() {
        UserRegistrations checkEmail = new UserRegistrations();
        try {
            Assert.assertEquals(true, checkEmail.emailValidation("abcViresh@bl.co"));
        } catch (Exception e) {
            System.out.println("Invalid with exception " + e);
        }
    }

    @Test
    public void givenEmailAsNullReturnException() throws UserRegistrationException {
        UserRegistrations checkEmail = new UserRegistrations();
        try {
            boolean email = checkEmail.emailValidation(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, email);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenEmailAsEmptyReturnException() throws UserRegistrationException {
        try {
            UserRegistrations checkEmail = new UserRegistrations();
            boolean email = checkEmail.emailValidation("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, email);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void checkPhoneValidationReturnTrue() {
        UserRegistrations checkPhone = new UserRegistrations();
        try {
            Assert.assertEquals(true, checkPhone.phoneValidation("91 1478523698"));
        } catch (Exception e) {
            System.out.println("Invalid with exception " + e);
        }
    }

    @Test
    public void givenNumberAsNullReturnException() throws UserRegistrationException {
        UserRegistrations checkPhone = new UserRegistrations();
        try {
            boolean phone = checkPhone.phoneValidation(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, phone);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenNumberEmpty_shouldThrowException() throws UserRegistrationException {
        UserRegistrations checkPhone = new UserRegistrations();
        try {
            boolean phone = checkPhone.phoneValidation("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, phone);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void checkPasswordValidationReturnTrue() {
        UserRegistrations checkPassword = new UserRegistrations();
        try {
            Assert.assertEquals(true, checkPassword.passwordValidation("Abc@12435"));
        } catch (Exception e) {
            System.out.println("Invalid with exception " + e);
        }
    }

    @Test
    public void givenPasswordAsNullReturnException() throws UserRegistrationException {
        UserRegistrations checkPassword = new UserRegistrations();
        try {
            boolean password = checkPassword.passwordValidation(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, password);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenPasswordEmpty_shouldThrowException() throws UserRegistrationException {
        UserRegistrations checkPassword = new UserRegistrations();
        try {
            boolean password = checkPassword.passwordValidation("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, password);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void givenMessage_whenNotSad_ShouldReturnHappy() {
        UserRegistrations moodAnalyser = new UserRegistrations();
        String mood = moodAnalyser.analyseMood("this is a Happy Message");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        UserRegistrations moodAnalyser = new UserRegistrations();
        String mood = moodAnalyser.analyseMood("this is a Sad Message");
        Assert.assertEquals("SAD", mood);
    }

}
