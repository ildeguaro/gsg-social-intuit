package com.gsgtech.gapp.social.intuit.config.xml;

import org.springframework.social.config.xml.AbstractProviderConfigBeanDefinitionParser;
import org.springframework.social.security.provider.SocialAuthenticationService;

import com.gsgtech.gapp.social.intuit.config.support.IntuitApiHelper;
import com.gsgtech.gapp.social.intuit.connect.IntuitConnectionFactory;
import com.gsgtech.gapp.social.intuit.security.IntuitAuthenticationService;

public class IntuitConfigBeanDefinitionParser extends AbstractProviderConfigBeanDefinitionParser {

    public IntuitConfigBeanDefinitionParser() {
        super(IntuitConnectionFactory.class, IntuitApiHelper.class);
	}
	
	@Override
	protected Class<? extends SocialAuthenticationService<?>> getAuthenticationServiceClass() {
	        return IntuitAuthenticationService.class;
	}

}
