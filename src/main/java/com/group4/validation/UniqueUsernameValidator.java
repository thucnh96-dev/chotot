package com.group4.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.group4.Service.UserService;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername,String>{

	 @Autowired
	    private UserService userService;

	    @Override
	    public void initialize(UniqueUsername unique) {
	        unique.message();
	    }


	@Override
	public boolean isValid(String username, ConstraintValidatorContext context) {
		if (!username.equals("") && userService.findByUsername(username) != null) {
         return false;
     }
     return true;
	}

}
