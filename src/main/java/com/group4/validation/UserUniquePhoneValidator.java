package com.group4.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.group4.Service.UserService;

public class UserUniquePhoneValidator  implements ConstraintValidator<UniquePhone,String>{
	 @Autowired
	    private UserService userService;

	    @Override
	    public void initialize(UniquePhone unique) {
	        unique.message();
	    }


	@Override
	public boolean isValid(String phone, ConstraintValidatorContext context) {
<<<<<<< HEAD
		if (!phone.equals("") && userService.findByPhone(phone)!=null) {
=======
		if (!phone.equals("") && userService.findByPhone(phone) != null) {
>>>>>>> feature/trantuyen
            return false;
        }
        return true;
	}

}
