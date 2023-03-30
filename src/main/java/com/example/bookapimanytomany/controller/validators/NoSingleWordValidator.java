package com.example.bookapimanytomany.controller.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NoSingleWordValidator implements ConstraintValidator<NoSingleWord, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        String[] s = value.split(" ");
        return s.length > 1;
    }
}
