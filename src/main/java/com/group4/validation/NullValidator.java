package com.group4.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class NullValidator implements ConstraintValidator<UserNull,String> {


    @Override
    public void initialize(UserNull unique) {
        unique.message();
    }

    @Override
    public boolean isValid(String text, ConstraintValidatorContext context) {
        if (text.equals("")) {
            return false;
        }
        return true;
    }
}