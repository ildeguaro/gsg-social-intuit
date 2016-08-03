package org.springframework.social.intuit.domain;

import java.io.Serializable;

public class RestResponse implements Serializable{

	private final static long serialVersionUID = 1L;
	protected Companies companies;	
	
	public Companies getCompanies() {
	    return companies;
	}	
	
	public void setCompaniesMetaData(Companies value) {
	    this.companies= value;
	}

}
