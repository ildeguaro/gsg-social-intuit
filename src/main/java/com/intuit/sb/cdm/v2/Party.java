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
import javax.xml.bind.annotation.XmlType;


/**
 *  Specifies the base Party that describes the party model 
 * 
 * <p>Java class for Party complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmBase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}PartyGroup"/>
 *         &lt;element name="Role" type="{http://www.intuit.com/sb/cdm/v2}roleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomField" type="{http://www.intuit.com/sb/cdm/v2}CustomField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party", propOrder = {
    "typeOf",
    "name",
    "addresses",
    "phones",
    "webSites",
    "emails",
    "externalId",
    "roles",
    "customFields"
})
@XmlRootElement(name = "Party")
public class Party
    extends CdmBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TypeOf", required = true)
    protected PartyType typeOf;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Address")
    protected List<PhysicalAddress> addresses;
    @XmlElement(name = "Phone")
    protected List<TelephoneNumber> phones;
    @XmlElement(name = "WebSite")
    protected List<WebSiteAddress> webSites;
    @XmlElement(name = "Email")
    protected List<EmailAddress> emails;
    @XmlElement(name = "ExternalId")
    protected String externalId;
    @XmlElement(name = "Role")
    protected List<RoleType> roles;
    @XmlElement(name = "CustomField")
    protected List<CustomField> customFields;

    /**
     * Gets the value of the typeOf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getTypeOf() {
        return typeOf;
    }

    /**
     * Sets the value of the typeOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTypeOf(PartyType value) {
        this.typeOf = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleType }
     * 
     * 
     */
    public List<RoleType> getRoles() {
        if (roles == null) {
            roles = new ArrayList<RoleType>();
        }
        return this.roles;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomField }
     * 
     * 
     */
    public List<CustomField> getCustomFields() {
        if (customFields == null) {
            customFields = new ArrayList<CustomField>();
        }
        return this.customFields;
    }

}
