package com.group4.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.group4.Service.UserService;

public class UserUniqueValidator implements ConstraintValidator<UniqueEmail,String> {

    @Autowired
    private UserService userService;

    @Override
    public void initialize(UniqueEmail unique) {
        unique.message();
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if (!email.equals("") && userService.findByemail(email) != null) {
            return false;
        }
        return true;
    }
}