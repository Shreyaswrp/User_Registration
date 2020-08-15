package com.UseRegistration;

import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest {

    @Test
    public void giveFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Shreya");
        Assert.assertTrue(result);
    }

    @Test
    public void giveFirstName_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userValidation = new UserRegistration();
        boolean result = userValidation.validateFirstName("Sh");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Swaroop");
        Assert.assertTrue(result);
    }
    @Test
    public void giveLastName_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userValidation = new UserRegistration();
        boolean result = userValidation.validateLastName("Sw");
        Assert.assertFalse(result);
    }
}
