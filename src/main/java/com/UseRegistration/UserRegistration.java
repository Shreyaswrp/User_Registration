package com.UseRegistration;
import java.util.regex.Pattern;
public class UserRegistration {

    private final String NAME_PATTERN = "^[A-Z][A-Za-z]{2,}";
    private final String EMAIL_PATTERN = "^[0-9a-z]+[+_.-]?[0-9a-z]+[@][0-9a-z]+[.][a-z]{2,}[.]?[a-z]+$";
    private final String MOBILE_NUMBER_PATTERN = "^[0-9]{2}[ ][0-9]{10}";
    private final String PASSWORD_PATTERN = "(?=.*[A-Z].*)(?=.*[0-9].*)[a-zA-Z0-9]{8,}";


    public boolean validateName(String Name) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(Name).matches();
    }
    public boolean validateEmailID(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
    public boolean validateMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(mobileNumber).matches();
    }
    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
