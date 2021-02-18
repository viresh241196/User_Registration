package com.junituserregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitUserRegistrationTest {
    private Assertions Assert;

    @Test
    public void nameValid() {
        UserRegistrations checkName = new UserRegistrations();
        Boolean mood = checkName.nameValid("Viresh");
        Assert.assertEquals(true, mood);
    }

    @Test
    public void emailValid() {
        UserRegistrations checkEmail = new UserRegistrations();
        Boolean mood = checkEmail.emailValid("abcViresh@bl.co.in");
        Assert.assertEquals(true, mood);
    }

    @Test
    public void phoneValid() {
        UserRegistrations checkPhone = new UserRegistrations();
        Boolean mood = checkPhone.phoneValid("91 1234567890");
        Assert.assertEquals(true, mood);
    }

    @Test
    public void passwordValid() {
        UserRegistrations checkPassword = new UserRegistrations();
        Boolean mood = checkPassword.passwordValid("@1Viresh");
        Assert.assertEquals(true, mood);
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
        String mood = moodAnalyser.analyseMood("this is a sad Message");
        Assert.assertEquals("SAD", mood);
    }
}
