package com.example.sb_homework.api.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

@Target({ FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MySizeTextValidator.class)
@Documented
public @interface TextConstraint {
    String message() default "Invalid text field.The text size should be in the range from 10 to 200";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}