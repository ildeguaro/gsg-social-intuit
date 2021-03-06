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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the CdmBase type which can be used as base type for all Intuit CDM objects that can be identified and modified as a top level CDM, example for top level CDMs are Party, Customer, Vendor in case of CMO these can extend from CdmBase. Though Physical Address, EmailAddress belong to a Party it can be manipulated as a independent object hence these also can be a "extension" of CdmBase. However CustomFields, Money is always associated with another top level CDM and will not be manipulated as independent object hence these CDMs are not considered as extension of CdmBase 
 * 
 * <p>Java class for CdmBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CdmBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.intuit.com/sb/cdm/v2}IdType" minOccurs="0"/>
 *         &lt;element name="SyncToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetaData" type="{http://www.intuit.com/sb/cdm/v2}ModificationMetaData" minOccurs="0"/>
 *         &lt;element name="ExternalKey" type="{http://www.intuit.com/sb/cdm/v2}IdType" minOccurs="0"/>
 *         &lt;element name="Synchronized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AlternateId" type="{http://www.intuit.com/sb/cdm/v2}NameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CdmBase", propOrder = {
    "id",
    "syncToken",
    "metaData",
    "externalKey",
    "_synchronized",
    "alternateIds"
})
@XmlSeeAlso({
    Note.class,
    Organization.class,
    CreditCardCharge.class,
    PurchaseOrder.class,
    UOM.class,
    Charge.class,
    SalesRep.class,
    InventoryAdjustment.class,
    CreditMemo.class,
    Party.class,
    SalesTax.class,
    TxnGeneric.class,
    JournalEntry.class,
    SalesTaxPaymentCheck.class,
    Discount.class,
    Estimate.class,
    CashPurchase.class,
    Person.class,
    Class.class,
    PaymentMethod.class,
    Bill.class,
    SalesReceipt.class,
    Payment.class,
    VendorCredit.class,
    VendorCreditToApply.class,
    SalesTaxGroup.class,
    SalesOrder.class,
    TimeActivity.class,
    ItemReceipt.class,
    CreditCardCredit.class,
    BillPayment.class,
    Item.class,
    Parties.class,
    Check.class,
    RoleBase.class,
    SalesTaxCode.class,
    Invoice.class,
    ShipMethod.class,
    Account.class,
    SalesTerm.class
})
public abstract class CdmBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Id")
    protected IdType id;
    @XmlElement(name = "SyncToken")
    protected String syncToken;
    @XmlElement(name = "MetaData")
    protected ModificationMetaData metaData;
    @XmlElement(name = "ExternalKey")
    protected IdType externalKey;
    @XmlElement(name = "Synchronized")
    protected Boolean _synchronized;
    @XmlElement(name = "AlternateId")
    protected List<NameValue> alternateIds;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setId(IdType value) {
        this.id = value;
    }

    /**
     * Gets the value of the syncToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncToken() {
        return syncToken;
    }

    /**
     * Sets the value of the syncToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncToken(String value) {
        this.syncToken = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationMetaData }
     *     
     */
    public ModificationMetaData getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationMetaData }
     *     
     */
    public void setMetaData(ModificationMetaData value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the externalKey property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getExternalKey() {
        return externalKey;
    }

    /**
     * Sets the value of the externalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setExternalKey(IdType value) {
        this.externalKey = value;
    }

    /**
     * Gets the value of the synchronized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSynchronized() {
        return _synchronized;
    }

    /**
     * Sets the value of the synchronized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSynchronized(Boolean value) {
        this._synchronized = value;
    }

    /**
     * Gets the value of the alternateIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValue }
     * 
     * 
     */
    public List<NameValue> getAlternateIds() {
        if (alternateIds == null) {
            alternateIds = new ArrayList<NameValue>();
        }
        return this.alternateIds;
    }

}
