package org.springframework.social.intuit.api;

import java.io.Serializable;

import com.intuit.ipp.data.EmailAddress;
import com.intuit.ipp.data.User;



/**
 * Model class representing a Intuit user's profile information.
 * 
 * @author Jeffrey Williams
 */

public class IntuitProfile implements Serializable {
	private static final long serialVersionUID = 1L;
	private String idUser;
	private String displayName;
	private String firstName;
	private String lastName;
	private EmailAddress emailAddress;
	
	
	public IntuitProfile() {
	}

	public IntuitProfile(User user) {	
		idUser = user.getId();
		displayName = user.getDisplayName();
		firstName = user.getGivenName();
		lastName = user.getFamilyName();
		emailAddress = user.getEmailAddr().get(0);
		
	}
	
	public String getDisplayName() {
		return displayName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public EmailAddress getEmailAddress() {
		return emailAddress;
	}

	public String getIdUser() {
		return idUser;
	}
}
