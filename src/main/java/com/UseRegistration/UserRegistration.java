package com.UseRegistration;
import java.util.regex.Pattern;
public class UserRegistration {

    private final String FIRST_NAME_PATTERN = "^[A-Z][A-Za-z]{2,}";
    private final String LAST_NAME_PATTERN = "^[A-Z][A-Za-z]{2,}";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
}
