package com.UseRegistration;
import java.util.regex.Pattern;
public class UserRegistration {

    private final String NAME_PATTERN = "^[A-Z][A-Za-z]{2,}";
    private final String EMAIL_PATTERN = "^[0-9a-z]+[+_.-]?[0-9a-z]+[@][0-9a-z]+[.][a-z]{2,}[.]?[a-z]+$";

    public boolean validateName(String Name) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(Name).matches();
    }
    public boolean validateEmailID(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}
