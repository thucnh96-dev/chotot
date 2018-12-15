package com.group4.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class SercurityServiceImpl implements SecurityService {
	@Autowired
	UserDetailsService userdetailsService;
	@Autowired
	AuthenticationManager authenticationmanage;
	
	

	@Override
	public String findloggedUsername() {
		Object userdatels=SecurityContextHolder.getContext().getAuthentication().getDetails();
		if (userdatels instanceof UserDetails) {
			return ((UserDetails) userdatels).getUsername();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void autologin(String username, String password) {
	  UserDetails userDetails =userdetailsService.loadUserByUsername(username);
	  UsernamePasswordAuthenticationToken passwordAuthenticationToken
	  =new UsernamePasswordAuthenticationToken(userDetails, password,userDetails.getAuthorities());
	  if(passwordAuthenticationToken.isAuthenticated()) {
		  SecurityContextHolder.getContext().setAuthentication(passwordAuthenticationToken);
		  System.out.println("Auto login oke");
	  }
		
	}

}
