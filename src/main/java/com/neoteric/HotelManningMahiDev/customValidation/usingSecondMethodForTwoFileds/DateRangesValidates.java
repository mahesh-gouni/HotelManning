package com.neoteric.HotelManningMahiDev.customValidation.usingSecondMethodForTwoFileds;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DateRangesValidates implements ConstraintValidator<ValidDateRange, DateRange> {
    @Override
    public void initialize(ValidDateRange constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(DateRange value, ConstraintValidatorContext context) {
        return value.getStartOfRange().isBefore(value.getEndOfRange());
    }
}
