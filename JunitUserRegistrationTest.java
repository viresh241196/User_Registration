package com.junituserregistration;

import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.Assert;
import org.junit.Test;


public class JunitUserRegistrationTest {

    @Test
    public void givenNameAsNullReturnException() throws UserRegistrationException{
        UserRegistrations checkName = new UserRegistrations();
        try {
            boolean name = checkName.nameValid(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, name);
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullType, e.type);
        }
    }
    @Test
    public void givenNameAsEmptyReturnException() throws UserRegistrationException {
        UserRegistrations checkName = new UserRegistrations();
        try {
            boolean name = checkName.nameValid("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, name);
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void givenEmailAsNullReturnException() throws UserRegistrationException {
        UserRegistrations checkEmail = new UserRegistrations();
        try {
            boolean email = checkEmail.emailValid(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, email);
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenEmailAsEmptyReturnException() throws UserRegistrationException {
        try {
            UserRegistrations checkEmail = new UserRegistrations();
            boolean email = checkEmail.emailValid("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, email);
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void givenNumberAsNullReturnException() throws UserRegistrationException {
        UserRegistrations checkPhone = new UserRegistrations();
        try {
            boolean phone = checkPhone.phoneValid(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, phone);
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullType, e.type);
        }
    }
    @Test
    public void givenNumberEmpty_shouldThrowException() throws UserRegistrationException {
        UserRegistrations checkPhone = new UserRegistrations();
        try {
            boolean phone = checkPhone.phoneValid("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, phone);
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void givenPasswordAsNullReturnException() throws UserRegistrationException {
        UserRegistrations checkPassword = new UserRegistrations();
        try {
            boolean password = checkPassword.passwordValid(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, password);
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenPasswordEmpty_shouldThrowException() throws UserRegistrationException {
        UserRegistrations checkPassword = new UserRegistrations();
        try {
            boolean password = checkPassword.passwordValid("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, password);
        }catch (UserRegistrationException e) {
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
