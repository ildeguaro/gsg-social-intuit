package com.gsgtech.gapp.social.intuit.api;

import com.intuit.ipp.data.EmailAddress;

/**
 * Interface defining the operations for retrieving information about Intuit users.
 * @author Jeffrey Williams
 */
public interface UserOperations {
	String getDisplayName();
	String getFirstName();
	String getLastName();
	EmailAddress getEmailAddress();
	IntuitProfile getUserProfile();

}
