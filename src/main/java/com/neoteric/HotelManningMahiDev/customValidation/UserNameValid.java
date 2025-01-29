package com.neoteric.HotelManningMahiDev.customValidation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UserNameValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserNameValid {
    String message() default "Invalid User Name";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};


}
