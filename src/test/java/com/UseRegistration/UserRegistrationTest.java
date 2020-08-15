package com.UseRegistration;

import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest {

    @Test
    public void givenName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateName("Shreya");
        Assert.assertTrue(result);
    }

    @Test
    public void giveName_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userValidation = new UserRegistration();
        boolean result = userValidation.validateName("Sh");
        Assert.assertFalse(result);
    }
    @Test
    public void giveEmailID_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmailID("shreyaswrp@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void giveEmailID_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userValidation = new UserRegistration();
        boolean result = userValidation.validateEmailID("shreyaswrpgmail.com");
        Assert.assertFalse(result);
    }
    @Test
    public void giveMobileNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("91 89881597316");
        Assert.assertTrue(result);
    }

    @Test
    public void giveMobileNumber_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("91-8981597316");
        Assert.assertFalse(result);
    }
    @Test
    public void givePassword_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePassword("password1");
        Assert.assertTrue(result);
    }

    @Test
    public void givePassword_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userValidation = new UserRegistration();
        boolean result = userValidation.validatePassword("passw");
        Assert.assertFalse(result);
    }
}
