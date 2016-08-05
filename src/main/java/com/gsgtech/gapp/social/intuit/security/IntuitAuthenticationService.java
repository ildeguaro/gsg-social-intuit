package com.gsgtech.gapp.social.intuit.security;


import org.springframework.social.connect.support.OAuth1ConnectionFactory;
import org.springframework.social.security.provider.OAuth1AuthenticationService;

import com.gsgtech.gapp.social.intuit.api.Intuit;
import com.gsgtech.gapp.social.intuit.connect.IntuitConnectionFactory;

public class IntuitAuthenticationService extends OAuth1AuthenticationService<Intuit> {

	public IntuitAuthenticationService(String consumerKey, String consumerSecret) {
		super(new IntuitConnectionFactory(consumerKey, consumerSecret));
	}
}
