package org.springframework.social.intuit.domain;

import java.io.Serializable;


import com.intuit.sb.cdm.v2.CdmCollections;

public class SearchResults    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected CdmCollections cdmCollections;
    protected Integer count;
    protected Integer currentPage;

    
    public CdmCollections getCdmCollections() {
        return cdmCollections;
    }

    
    public void setCdmCollections(CdmCollections value) {
        this.cdmCollections = value;
    }

    
    public Integer getCount() {
        return count;
    }

    
    public void setCount(Integer value) {
        this.count = value;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }
   
    public void setCurrentPage(Integer value) {
        this.currentPage = value;
    }
}
