//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.03 at 03:30:34 PM EDT 
//


package org.springframework.social.intuit.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.intuit.sb.cdm.v2.CdmCollections;
import com.intuit.sb.cdm.v2.CompanyMetaData;


public class Companies  extends CdmCollections  implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<CompanyMetaData> companyMetaDatas;

   
    public List<CompanyMetaData> getCompanyMetaDatas() {
        if (companyMetaDatas == null) {
            companyMetaDatas = new ArrayList<CompanyMetaData>();
        }
        return this.companyMetaDatas;
    }

}