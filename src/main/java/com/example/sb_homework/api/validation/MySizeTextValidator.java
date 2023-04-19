package com.example.sb_homework.api.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MySizeTextValidator implements ConstraintValidator<TextConstraint, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.length() <= 200 && value.length() >= 10;
    }
}
