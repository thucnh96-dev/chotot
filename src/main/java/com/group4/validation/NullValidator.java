package com.group4.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class NullValidator implements ConstraintValidator<NullText,String> {


    @Override
    public void initialize(NullText unique) {
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