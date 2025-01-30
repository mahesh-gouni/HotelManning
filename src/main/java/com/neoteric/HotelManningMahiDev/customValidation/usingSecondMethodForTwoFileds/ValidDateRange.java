package com.neoteric.HotelManningMahiDev.customValidation.usingSecondMethodForTwoFileds;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DateRangesValidates.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface ValidDateRange {

    String message() default "Start date must be before end date";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
