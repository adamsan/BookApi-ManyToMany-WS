package com.example.bookapimanytomany.controller.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NoSingleWordValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NoSingleWord {
    String message() default "must contain multiple words";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
