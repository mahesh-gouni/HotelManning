package com.neoteric.HotelManningMahiDev.customValidation.usingTwofields;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class DateRangeValidator implements ConstraintValidator<DateRange, Object> {
    private String beforeFieldName;
    private String afterFieldName;

    @Override
    public void initialize(DateRange constraintAnnotation) {
        beforeFieldName = constraintAnnotation.before();
        afterFieldName = constraintAnnotation.after();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
//        try {
//            final Field beforeDateField = value.getClass().getDeclaredField(beforeFieldName);
//            beforeDateField.setAccessible(true);
//
//            final Field afterDateField = value.getClass().getDeclaredField(afterFieldName);
//            afterDateField.setAccessible(true);
//
//            final LocalDate beforeDate = (LocalDate) beforeDateField.get(value);
//            final LocalDate afterDate = (LocalDate) afterDateField.get(value);
//            return beforeDate.isEqual(afterDate) || beforeDate.isBefore(afterDate);
//
//        } catch (NoSuchFieldException | IllegalAccessException ignored) {
//            return false;
//        }
//    }
        try {
            Field beforeField = value.getClass().getDeclaredField(beforeFieldName);
            Field afterField = value.getClass().getDeclaredField(afterFieldName);

            beforeField.setAccessible(true);
            afterField.setAccessible(true);

            Object beforeValue = beforeField.get(value);
            Object afterValue = afterField.get(value);

            if (beforeValue == null || afterValue == null) {
                return true; // Let @NotNull handle null checks separately
            }

            if (beforeValue instanceof LocalDate && afterValue instanceof LocalDate) {
                return ((LocalDate) beforeValue).isBefore((LocalDate) afterValue);
            }

            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    }


