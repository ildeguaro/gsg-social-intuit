package com.gsgtech.gapp.social.intuit.api.impl;

import java.util.List;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.gsgtech.gapp.social.intuit.api.InvoiceOperations;
import com.gsgtech.gapp.social.intuit.domain.SearchResults;
import com.intuit.ipp.data.Customer;
import com.intuit.ipp.data.Invoice;


public class InvoiceTemplate implements InvoiceOperations {
	
	private final boolean isAuthorized;
	private final RestTemplate restTemplate;
	private final String companyId;
	private final String baseUrl;

	public InvoiceTemplate(boolean isAuthorized, RestTemplate restTemplate, String companyId, String baseUrl) {
		this.isAuthorized = isAuthorized;
		this.restTemplate = restTemplate;
		this.companyId = companyId;
		this.baseUrl = baseUrl;
	}

	public Invoice getInvoice(Long id) {
		requireAuthorization();
		return restTemplate.getForObject("{baseURL}/resource/invoice/v2/{companyId}/{invoiceId}", Invoice.class, baseUrl, companyId, id);
	}

//	public List<Invoice> getInvoices() {
//		requireAuthorization();		
//		SearchResults response = restTemplate.postForObject("{baseURL}/resource/invoices/v2/{companyId}", null, SearchResults.class, baseUrl, companyId);
//		if(response != null){
//			return ((Invoices)response.getCdmCollections()).getInvoices();
//		}
//		return null;
//	}
	
	public List<Invoice> getInvoices() {
		requireAuthorization();		
		SearchResults response = restTemplate.postForObject("{baseURL}/resource/invoices/v2/{companyId}", null, SearchResults.class, baseUrl, companyId);
		if(response != null){
			return ((List<Invoice>)response.getCdmCollections());
		}
		return null;
	}

//	public List<Invoice> getInvoices(Customer customer) {
//		requireAuthorization();
//		MultiValueMap<String, String> criteria = new LinkedMultiValueMap<String, String>();
//		criteria.add("Filter", "CustomerId :EQUALS: " + customer.getId());
//		SearchResults response = restTemplate.postForObject("{baseURL}/resource/invoices/v2/{companyId}", criteria, SearchResults.class, baseUrl, companyId);
//		if(response != null){
//			return ((Invoices)response.getCdmCollections()).getInvoices();
//		}
//		return null;
//	}
	
	public List<Invoice> getInvoices(Customer customer) {
		requireAuthorization();
		MultiValueMap<String, String> criteria = new LinkedMultiValueMap<String, String>();
		criteria.add("Filter", "CustomerId :EQUALS: " + customer.getId());
		SearchResults response = restTemplate.postForObject("{baseURL}/resource/invoices/v2/{companyId}", criteria, SearchResults.class, baseUrl, companyId);
		if(response != null){
			return ((List<Invoice>)response.getCdmCollections());
		}
		return null;
	}

	public Invoice update(Invoice invoice) {
		requireAuthorization();
		return restTemplate.postForObject("{baseURL}/resource/invoice/v2/{companyId}/{customerID}", invoice, Invoice.class, baseUrl, companyId, invoice.getId());
	}

	public Invoice create(Invoice invoice) {
		requireAuthorization();
		return restTemplate.postForObject("{baseURL}/resource/invoice/v2/{companyId}", invoice, Invoice.class, baseUrl, companyId);
	}

	public Invoice save(Invoice invoice) {
		requireAuthorization();
		if(invoice.getId() != null && invoice.getId() != null){
			return update(invoice);
		}
		else {
			return create(invoice);
		}
	}

	public boolean delete(Invoice invoice) {
		requireAuthorization();
		Invoice response = restTemplate.postForObject("{baseURL}/resource/invoice/v2/{companyId}/{customerID}?methodx=delete", buildDelete(invoice), Invoice.class, baseUrl, companyId, invoice.getId());
		return (response.getId() == null);
	}

	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException("intuit");
		}
	}

	private Invoice buildDelete(Invoice invoice){
		Invoice delete = new Invoice();
		delete.setSyncToken(invoice.getSyncToken());
		delete.setId(invoice.getId());
		
		return delete;
	}
}