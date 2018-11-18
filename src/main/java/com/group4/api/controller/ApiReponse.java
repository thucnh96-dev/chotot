package com.group4.api.controller;

public class ApiReponse {
private String mesg;
private String code;
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public ApiReponse(String mesg, String code) {
	super();
	this.mesg = mesg;
	this.code = code;
}
}
