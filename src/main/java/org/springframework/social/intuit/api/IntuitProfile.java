package org.springframework.social.intuit.api;

import java.io.Serializable;

import com.intuit.ia.connection.User;


/**
 * Model class representing a Intuit user's profile information.
 * 
 * @author Jeffrey Williams
 */

public class IntuitProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private String emailAddress;
	
	public IntuitProfile() {
	}

	public IntuitProfile(User user) {		
		firstName = user.getFirstName();
		lastName = user.getLastName();
		emailAddress = user.getEmailAddress();
	}

	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
}
