package com.group4.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class TextNullValidator implements ConstraintValidator<TextNull,String> {


    @Override
    public void initialize(TextNull unique) {
        unique.message();
    }

    @Override
    public boolean isValid(String text, ConstraintValidatorContext context) {
        if (text.equals("") || text == null) {
            return false;
        }
        return true;
    }
}