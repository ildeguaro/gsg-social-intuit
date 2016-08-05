package com.gsgtech.gapp.social.intuit.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Calendar;

import com.intuit.ipp.data.User;

public class UserResponse implements Serializable{

	private final static long serialVersionUID = 1L;
	protected BigInteger errorCode;
	protected Calendar serverTime;
	protected User user;


	public BigInteger getErrorCode() {
	    return errorCode;
	}
	
	
	public void setErrorCode(BigInteger value) {
	    this.errorCode = value;
	}
	
	
	public Calendar getServerTime() {
	    return serverTime;
	}
	
	
	public void setServerTime(Calendar value) {
	    this.serverTime = value;
	}
	
	
	public User getUser() {
	    return user;
	}
	
	
	public void setUser(User value) {
	    this.user = value;
	}

}
