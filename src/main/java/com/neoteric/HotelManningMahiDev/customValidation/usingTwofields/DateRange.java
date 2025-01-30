package com.neoteric.HotelManningMahiDev.customValidation.usingTwofields;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = DateRangeValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface DateRange {
    String message() default "{com.neoteric.HotelManningMahiDev.customValidation.usingTwofields.DateRange.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String before();

    String after();
//String message() default "Start date must be before end date";
//
//    Class<?>[] groups() default { };
//
//    Class<? extends Payload>[] payload() default { };
}
