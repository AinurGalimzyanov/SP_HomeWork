package com.example.sb_homework.api.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

@NotNull
@Size(min = 2, max = 50)
@Target({ FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { })
@Documented
public @interface NameConstraint {
    String message() default "{NameConstraint.invalid}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}