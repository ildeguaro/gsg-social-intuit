package com.gsgtech.gapp.social.intuit.connect;

import org.springframework.social.connect.support.OAuth1ConnectionFactory;

import com.gsgtech.gapp.social.intuit.api.Intuit;

/**
 * Intuit ConnectionFactory implementation.
 * @author Jeffrey Williams
 */
public class IntuitConnectionFactory extends OAuth1ConnectionFactory<Intuit> {

	public IntuitConnectionFactory(String consumerKey, String consumerSecret) {
		super("intuit", new IntuitServiceProvider(consumerKey, consumerSecret), new IntuitAdapter());
	}
	
}
