package org.springframework.social.intuit.api.impl;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.intuit.api.CompanyOperations;
import org.springframework.social.intuit.domain.RestResponse;
import org.springframework.web.client.RestTemplate;

import com.intuit.ipp.data.Company;


public class CompanyTemplate implements CompanyOperations {
	
	private static final String url = "https://services.intuit.com/sb/company/v2/availableList";
	
	private final boolean isAuthorized;
	private final RestTemplate restTemplate;
	
	public CompanyTemplate(boolean isAuthorized, RestTemplate restTemplate) {
		super();
		this.isAuthorized = isAuthorized;
		this.restTemplate = restTemplate;
	}

	public Company getCompany() {
		requireAuthorization();
		RestResponse restResponse = restTemplate.getForObject(url, RestResponse.class);
		if(restResponse != null){
			//return restResponse.getCompanies().getCompanyMetaDatas().get(1);
			return restResponse.getCompanies().getCompanyMetaDatas().get(1);

		}
		return null;
	}
	
	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException("intuit");
		}
	}

}
