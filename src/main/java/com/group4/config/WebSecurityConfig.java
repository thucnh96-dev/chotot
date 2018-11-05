package com.group4.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	UserDetailsService userDetailsService;

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}

@Override
public void configure(HttpSecurity httpSecurity) throws Exception {
	httpSecurity.authorizeRequests().
	antMatchers("/resources/**","/","/auth/register","/loginfalse","/post/**").permitAll()
	.antMatchers("/admin/**").hasAuthority("ADMIN")
	.antMatchers("/user/**").hasAuthority("USER").anyRequest().authenticated()
	.and()
	.formLogin()
	.loginPage("/login")
	.successHandler(new CustomAuthenticationSuccess())
	.failureHandler(new CustomAuthenticationFalse())
	.permitAll()
	.and()
	.logout()
	.permitAll()
	.and()
	.rememberMe().key("chotot").rememberMeParameter("rememberme").tokenValiditySeconds(60*60*24*7)
	.and()
	.exceptionHandling().accessDeniedPage("/403");
}
public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
	authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
}
}
