//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.03 at 03:30:34 PM EDT 
//


package com.intuit.sb.cdm.v2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * company specific collection of attributes
 * 
 * <p>Java class for CompanyMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalRealmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QBNRegisteredCompanyName" type="{http://www.intuit.com/sb/cdm/v2}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="CompanySignUpDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LatestUploadDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LatestWritebackDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="QBVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlavorStratum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SampleFile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QBNCompanyUserAdminIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QBNCompanyUserAdminEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SyncEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LatestForcedSyncDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SyncEnvironmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Offering" type="{http://www.intuit.com/sb/cdm/v2}Offering" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}AddressGroup" minOccurs="0"/>
 *         &lt;element name="LegalAddress" type="{http://www.intuit.com/sb/cdm/v2}PhysicalAddress" minOccurs="0"/>
 *         &lt;element name="IndustryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalYearStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IncomeTaxYearStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaxForm" type="{http://www.intuit.com/sb/cdm/v2}TaxFormEnum" minOccurs="0"/>
 *         &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyMetaData", propOrder = {
    "externalRealmId",
    "qbnRegisteredCompanyName",
    "companySignUpDateTime",
    "latestUploadDateTime",
    "latestWritebackDateTime",
    "qbVersion",
    "companyFileName",
    "flavorStratum",
    "sampleFile",
    "qbnCompanyUserAdminIdNumber",
    "qbnCompanyUserAdminEmail",
    "syncEnabled",
    "latestForcedSyncDateTime",
    "syncEnvironmentName",
    "offerings",
    "addresses",
    "phones",
    "emails",
    "faxes",
    "webSites",
    "legalAddress",
    "industryType",
    "fiscalYearStart",
    "incomeTaxYearStart",
    "taxForm",
    "taxIdentifier"
})
@XmlRootElement(name = "CompanyMetaData")
public class CompanyMetaData
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ExternalRealmId")
    protected String externalRealmId;
    @XmlElement(name = "QBNRegisteredCompanyName")
    protected String qbnRegisteredCompanyName;
    @XmlElement(name = "CompanySignUpDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar companySignUpDateTime;
    @XmlElement(name = "LatestUploadDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestUploadDateTime;
    @XmlElement(name = "LatestWritebackDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestWritebackDateTime;
    @XmlElement(name = "QBVersion")
    protected String qbVersion;
    @XmlElement(name = "CompanyFileName")
    protected String companyFileName;
    @XmlElement(name = "FlavorStratum")
    protected String flavorStratum;
    @XmlElement(name = "SampleFile")
    protected Boolean sampleFile;
    @XmlElement(name = "QBNCompanyUserAdminIdNumber")
    protected String qbnCompanyUserAdminIdNumber;
    @XmlElement(name = "QBNCompanyUserAdminEmail")
    protected String qbnCompanyUserAdminEmail;
    @XmlElement(name = "SyncEnabled")
    protected Boolean syncEnabled;
    @XmlElement(name = "LatestForcedSyncDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestForcedSyncDateTime;
    @XmlElement(name = "SyncEnvironmentName")
    protected String syncEnvironmentName;
    @XmlElement(name = "Offering")
    protected List<Offering> offerings;
    @XmlElement(name = "Address")
    protected List<PhysicalAddress> addresses;
    @XmlElement(name = "Phone")
    protected List<TelephoneNumber> phones;
    @XmlElement(name = "Email")
    protected List<EmailAddress> emails;
    @XmlElement(name = "Fax")
    protected List<String> faxes;
    @XmlElement(name = "WebSite")
    protected List<WebSiteAddress> webSites;
    @XmlElement(name = "LegalAddress")
    protected PhysicalAddress legalAddress;
    @XmlElement(name = "IndustryType")
    protected String industryType;
    @XmlElement(name = "FiscalYearStart")
    protected Integer fiscalYearStart;
    @XmlElement(name = "IncomeTaxYearStart")
    protected Integer incomeTaxYearStart;
    @XmlElement(name = "TaxForm")
    protected TaxFormEnum taxForm;
    @XmlElement(name = "TaxIdentifier")
    protected String taxIdentifier;

    /**
     * Gets the value of the externalRealmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRealmId() {
        return externalRealmId;
    }

    /**
     * Sets the value of the externalRealmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRealmId(String value) {
        this.externalRealmId = value;
    }

    /**
     * Gets the value of the qbnRegisteredCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQBNRegisteredCompanyName() {
        return qbnRegisteredCompanyName;
    }

    /**
     * Sets the value of the qbnRegisteredCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQBNRegisteredCompanyName(String value) {
        this.qbnRegisteredCompanyName = value;
    }

    /**
     * Gets the value of the companySignUpDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompanySignUpDateTime() {
        return companySignUpDateTime;
    }

    /**
     * Sets the value of the companySignUpDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompanySignUpDateTime(XMLGregorianCalendar value) {
        this.companySignUpDateTime = value;
    }

    /**
     * Gets the value of the latestUploadDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestUploadDateTime() {
        return latestUploadDateTime;
    }

    /**
     * Sets the value of the latestUploadDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestUploadDateTime(XMLGregorianCalendar value) {
        this.latestUploadDateTime = value;
    }

    /**
     * Gets the value of the latestWritebackDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestWritebackDateTime() {
        return latestWritebackDateTime;
    }

    /**
     * Sets the value of the latestWritebackDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestWritebackDateTime(XMLGregorianCalendar value) {
        this.latestWritebackDateTime = value;
    }

    /**
     * Gets the value of the qbVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQBVersion() {
        return qbVersion;
    }

    /**
     * Sets the value of the qbVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQBVersion(String value) {
        this.qbVersion = value;
    }

    /**
     * Gets the value of the companyFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyFileName() {
        return companyFileName;
    }

    /**
     * Sets the value of the companyFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyFileName(String value) {
        this.companyFileName = value;
    }

    /**
     * Gets the value of the flavorStratum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlavorStratum() {
        return flavorStratum;
    }

    /**
     * Sets the value of the flavorStratum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlavorStratum(String value) {
        this.flavorStratum = value;
    }

    /**
     * Gets the value of the sampleFile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSampleFile() {
        return sampleFile;
    }

    /**
     * Sets the value of the sampleFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSampleFile(Boolean value) {
        this.sampleFile = value;
    }

    /**
     * Gets the value of the qbnCompanyUserAdminIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQBNCompanyUserAdminIdNumber() {
        return qbnCompanyUserAdminIdNumber;
    }

    /**
     * Sets the value of the qbnCompanyUserAdminIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQBNCompanyUserAdminIdNumber(String value) {
        this.qbnCompanyUserAdminIdNumber = value;
    }

    /**
     * Gets the value of the qbnCompanyUserAdminEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQBNCompanyUserAdminEmail() {
        return qbnCompanyUserAdminEmail;
    }

    /**
     * Sets the value of the qbnCompanyUserAdminEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQBNCompanyUserAdminEmail(String value) {
        this.qbnCompanyUserAdminEmail = value;
    }

    /**
     * Gets the value of the syncEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncEnabled() {
        return syncEnabled;
    }

    /**
     * Sets the value of the syncEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncEnabled(Boolean value) {
        this.syncEnabled = value;
    }

    /**
     * Gets the value of the latestForcedSyncDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestForcedSyncDateTime() {
        return latestForcedSyncDateTime;
    }

    /**
     * Sets the value of the latestForcedSyncDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestForcedSyncDateTime(XMLGregorianCalendar value) {
        this.latestForcedSyncDateTime = value;
    }

    /**
     * Gets the value of the syncEnvironmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncEnvironmentName() {
        return syncEnvironmentName;
    }

    /**
     * Sets the value of the syncEnvironmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncEnvironmentName(String value) {
        this.syncEnvironmentName = value;
    }

    /**
     * Gets the value of the offerings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Offering }
     * 
     * 
     */
    public List<Offering> getOfferings() {
        if (offerings == null) {
            offerings = new ArrayList<Offering>();
        }
        return this.offerings;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAddress }
     * 
     * 
     */
    public List<PhysicalAddress> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<PhysicalAddress>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the phones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelephoneNumber }
     * 
     * 
     */
    public List<TelephoneNumber> getPhones() {
        if (phones == null) {
            phones = new ArrayList<TelephoneNumber>();
        }
        return this.phones;
    }

    /**
     * Gets the value of the emails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAddress }
     * 
     * 
     */
    public List<EmailAddress> getEmails() {
        if (emails == null) {
            emails = new ArrayList<EmailAddress>();
        }
        return this.emails;
    }

    /**
     * Gets the value of the faxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFaxes() {
        if (faxes == null) {
            faxes = new ArrayList<String>();
        }
        return this.faxes;
    }

    /**
     * Gets the value of the webSites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webSites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebSites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebSiteAddress }
     * 
     * 
     */
    public List<WebSiteAddress> getWebSites() {
        if (webSites == null) {
            webSites = new ArrayList<WebSiteAddress>();
        }
        return this.webSites;
    }

    /**
     * Gets the value of the legalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getLegalAddress() {
        return legalAddress;
    }

    /**
     * Sets the value of the legalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setLegalAddress(PhysicalAddress value) {
        this.legalAddress = value;
    }

    /**
     * Gets the value of the industryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryType() {
        return industryType;
    }

    /**
     * Sets the value of the industryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryType(String value) {
        this.industryType = value;
    }

    /**
     * Gets the value of the fiscalYearStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFiscalYearStart() {
        return fiscalYearStart;
    }

    /**
     * Sets the value of the fiscalYearStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFiscalYearStart(Integer value) {
        this.fiscalYearStart = value;
    }

    /**
     * Gets the value of the incomeTaxYearStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIncomeTaxYearStart() {
        return incomeTaxYearStart;
    }

    /**
     * Sets the value of the incomeTaxYearStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIncomeTaxYearStart(Integer value) {
        this.incomeTaxYearStart = value;
    }

    /**
     * Gets the value of the taxForm property.
     * 
     * @return
     *     possible object is
     *     {@link TaxFormEnum }
     *     
     */
    public TaxFormEnum getTaxForm() {
        return taxForm;
    }

    /**
     * Sets the value of the taxForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxFormEnum }
     *     
     */
    public void setTaxForm(TaxFormEnum value) {
        this.taxForm = value;
    }

    /**
     * Gets the value of the taxIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdentifier() {
        return taxIdentifier;
    }

    /**
     * Sets the value of the taxIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdentifier(String value) {
        this.taxIdentifier = value;
    }

}
