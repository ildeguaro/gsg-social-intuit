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
import javax.xml.bind.annotation.XmlType;


/**
 * Financial Transaction information that pertains to the entire ItemReceipt.
 * 
 * <p>Java class for ItemReceiptHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemReceiptHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}HeaderPurchase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}APAccountReferenceGroup" minOccurs="0"/>
 *         &lt;element name="TxnId" type="{http://www.intuit.com/sb/cdm/v2}IdType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemReceiptHeader", propOrder = {
    "apAccountId",
    "apAccountName",
    "txnIds"
})
public class ItemReceiptHeader
    extends HeaderPurchase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "APAccountId")
    protected IdType apAccountId;
    @XmlElement(name = "APAccountName")
    protected String apAccountName;
    @XmlElement(name = "TxnId")
    protected List<IdType> txnIds;

    /**
     * Gets the value of the apAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getAPAccountId() {
        return apAccountId;
    }

    /**
     * Sets the value of the apAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setAPAccountId(IdType value) {
        this.apAccountId = value;
    }

    /**
     * Gets the value of the apAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPAccountName() {
        return apAccountName;
    }

    /**
     * Sets the value of the apAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPAccountName(String value) {
        this.apAccountName = value;
    }

    /**
     * Gets the value of the txnIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txnIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxnIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdType }
     * 
     * 
     */
    public List<IdType> getTxnIds() {
        if (txnIds == null) {
            txnIds = new ArrayList<IdType>();
        }
        return this.txnIds;
    }

}
