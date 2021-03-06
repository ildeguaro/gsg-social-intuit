//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.03 at 03:30:34 PM EDT 
//


package com.intuit.sb.cdm.v2;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information associating some portion of the payment with a sales transaction that is paid by it.
 * 
 * <p>Java class for PaymentLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}LineBase">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}TxnReferenceGroup" minOccurs="0"/>
 *         &lt;element name="DiscountAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}DiscountReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}DiscountAccountReferenceGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentLine", propOrder = {
    "amount",
    "txnId",
    "txnNum",
    "discountAmt",
    "discountId",
    "discountName",
    "discountAccountId",
    "discountAccountName"
})
public class PaymentLine
    extends LineBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "TxnId")
    protected IdType txnId;
    @XmlElement(name = "TxnNum")
    protected String txnNum;
    @XmlElement(name = "DiscountAmt")
    protected BigDecimal discountAmt;
    @XmlElement(name = "DiscountId")
    protected IdType discountId;
    @XmlElement(name = "DiscountName")
    protected String discountName;
    @XmlElement(name = "DiscountAccountId")
    protected IdType discountAccountId;
    @XmlElement(name = "DiscountAccountName")
    protected String discountAccountName;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the txnId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getTxnId() {
        return txnId;
    }

    /**
     * Sets the value of the txnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setTxnId(IdType value) {
        this.txnId = value;
    }

    /**
     * Gets the value of the txnNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnNum() {
        return txnNum;
    }

    /**
     * Sets the value of the txnNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnNum(String value) {
        this.txnNum = value;
    }

    /**
     * Gets the value of the discountAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    /**
     * Sets the value of the discountAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmt(BigDecimal value) {
        this.discountAmt = value;
    }

    /**
     * Gets the value of the discountId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getDiscountId() {
        return discountId;
    }

    /**
     * Sets the value of the discountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setDiscountId(IdType value) {
        this.discountId = value;
    }

    /**
     * Gets the value of the discountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountName() {
        return discountName;
    }

    /**
     * Sets the value of the discountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountName(String value) {
        this.discountName = value;
    }

    /**
     * Gets the value of the discountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getDiscountAccountId() {
        return discountAccountId;
    }

    /**
     * Sets the value of the discountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setDiscountAccountId(IdType value) {
        this.discountAccountId = value;
    }

    /**
     * Gets the value of the discountAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAccountName() {
        return discountAccountName;
    }

    /**
     * Sets the value of the discountAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAccountName(String value) {
        this.discountAccountName = value;
    }

}
