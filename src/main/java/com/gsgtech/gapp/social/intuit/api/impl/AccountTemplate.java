package com.gsgtech.gapp.social.intuit.api.impl;

import java.util.List;
import org.springframework.social.MissingAuthorizationException;
import org.springframework.web.client.RestTemplate;

import com.gsgtech.gapp.social.intuit.api.AccountOperations;
import com.intuit.ipp.data.Account;


public class AccountTemplate implements AccountOperations {
	
	private final boolean isAuthorized;
	private final RestTemplate restTemplate;
	private final String companyId;
	private final String baseUrl;

	public AccountTemplate(boolean isAuthorized, RestTemplate restTemplate, String companyId, String baseUrl) {
		super();
		this.isAuthorized = isAuthorized;
		this.restTemplate = restTemplate;
		this.companyId = companyId;
		this.baseUrl = baseUrl="https://sandbox-quickbooks.api.intuit.com/v3/";
	}

	public Account getAccount(Long accountId) {
		requireAuthorization();
		return restTemplate.getForObject("{baseUrl}/v3/company/{companyId}/account/{accountId}", Account.class, baseUrl, companyId, accountId);
	}
	
	public List<Account> getBankAccounts() {
		return null;
		
	}	
	
	@SuppressWarnings("unchecked")
	public List<Account> getAccounts() {
		requireAuthorization();		
		String theQuery = "select * from Account";	
		return restTemplate.getForObject("{baseUrl}/company/{companyId}/query?query={theQuery}", List.class,baseUrl,companyId,theQuery);
		
	}
	
	public Account create(Account account) {
		requireAuthorization();
		return restTemplate.postForObject("{baseUrl}/v3/company/{companyId}/{accountId}", account, Account.class, baseUrl, companyId);
	}
	
	public Account update(Account account) {
		requireAuthorization();
		return restTemplate.postForObject("{baseUrl}/v3/company/{companyId}/{accountId}?operation=update", account, Account.class, baseUrl, companyId, account.getId());
	}	

	public Account save(Account account) {
		requireAuthorization();
		if(account.getId() != null && account.getId() != null){
			return update(account);
		}
		else {
			return create(account);
		}
	}
	
	public boolean delete(Account account) {
		requireAuthorization();
		Account response = restTemplate.postForObject("{baseUrl}/v3/company/{companyId}/account/{accountId}", buildDelete(account), Account.class, baseUrl, companyId, account.getId());
		return (response.getId() == null);
	}
	
	private Account buildDelete(Account account){
		Account delete = new Account();
		delete.setSyncToken(account.getSyncToken());
		delete.setId(account.getId());
		
		return delete;
	}
	
	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException("intuit");
		}
	}

}
