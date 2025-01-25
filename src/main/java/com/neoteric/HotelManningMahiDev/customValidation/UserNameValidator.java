package com.neoteric.HotelManningMahiDev.customValidation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UserNameValidator implements ConstraintValidator<UserNameValid,String> {
    @Override
    public void initialize(UserNameValid constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null&& (s.length() > 8) && (s.length() < 16)&&s.matches("^[a-zA-Z0-9@_]+$");
    }
}
