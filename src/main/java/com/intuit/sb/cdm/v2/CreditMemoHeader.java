//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.03 at 03:30:34 PM EDT 
//


package com.intuit.sb.cdm.v2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * Information that pertains to the entire CreditMemo
 * 
 * <p>Java class for CreditMemoHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditMemoHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}HeaderSales">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}ARAccountReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}SalesTermReferenceGroup" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BillAddr" type="{http://www.intuit.com/sb/cdm/v2}PhysicalAddress" minOccurs="0"/>
 *         &lt;element name="ShipAddr" type="{http://www.intuit.com/sb/cdm/v2}PhysicalAddress" minOccurs="0"/>
 *         &lt;element name="BillEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}ShipMethodReferenceGroup" minOccurs="0"/>
 *         &lt;element name="RemainingCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Detail" type="{http://www.intuit.com/sb/cdm/v2}PaymentDetail" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}QboDiscountGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditMemoHeader", propOrder = {
    "arAccountId",
    "arAccountName",
    "salesTermId",
    "salesTermName",
    "dueDate",
    "billAddr",
    "shipAddr",
    "billEmail",
    "shipMethodId",
    "shipMethodName",
    "remainingCredit",
    "detail",
    "discountRate",
    "discountAmt",
    "discountAccountId",
    "discountAccountName",
    "discountTaxable"
})
public class CreditMemoHeader
    extends HeaderSales
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ARAccountId")
    protected IdType arAccountId;
    @XmlElement(name = "ARAccountName")
    protected String arAccountName;
    @XmlElement(name = "SalesTermId")
    protected IdType salesTermId;
    @XmlElement(name = "SalesTermName")
    protected String salesTermName;
    @XmlElement(name = "DueDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dueDate;
    @XmlElement(name = "BillAddr")
    protected PhysicalAddress billAddr;
    @XmlElement(name = "ShipAddr")
    protected PhysicalAddress shipAddr;
    @XmlElement(name = "BillEmail")
    protected String billEmail;
    @XmlElement(name = "ShipMethodId")
    protected IdType shipMethodId;
    @XmlElement(name = "ShipMethodName")
    protected String shipMethodName;
    @XmlElement(name = "RemainingCredit")
    protected BigDecimal remainingCredit;
    @XmlElement(name = "Detail")
    protected PaymentDetail detail;
    @XmlElement(name = "DiscountRate")
    protected BigDecimal discountRate;
    @XmlElement(name = "DiscountAmt")
    protected BigDecimal discountAmt;
    @XmlElement(name = "DiscountAccountId")
    protected IdType discountAccountId;
    @XmlElement(name = "DiscountAccountName")
    protected String discountAccountName;
    @XmlElement(name = "DiscountTaxable")
    protected Boolean discountTaxable;

    /**
     * Gets the value of the arAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getARAccountId() {
        return arAccountId;
    }

    /**
     * Sets the value of the arAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setARAccountId(IdType value) {
        this.arAccountId = value;
    }

    /**
     * Gets the value of the arAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARAccountName() {
        return arAccountName;
    }

    /**
     * Sets the value of the arAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARAccountName(String value) {
        this.arAccountName = value;
    }

    /**
     * Gets the value of the salesTermId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getSalesTermId() {
        return salesTermId;
    }

    /**
     * Sets the value of the salesTermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setSalesTermId(IdType value) {
        this.salesTermId = value;
    }

    /**
     * Gets the value of the salesTermName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTermName() {
        return salesTermName;
    }

    /**
     * Sets the value of the salesTermName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTermName(String value) {
        this.salesTermName = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(Calendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the billAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getBillAddr() {
        return billAddr;
    }

    /**
     * Sets the value of the billAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setBillAddr(PhysicalAddress value) {
        this.billAddr = value;
    }

    /**
     * Gets the value of the shipAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getShipAddr() {
        return shipAddr;
    }

    /**
     * Sets the value of the shipAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setShipAddr(PhysicalAddress value) {
        this.shipAddr = value;
    }

    /**
     * Gets the value of the billEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillEmail() {
        return billEmail;
    }

    /**
     * Sets the value of the billEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillEmail(String value) {
        this.billEmail = value;
    }

    /**
     * Gets the value of the shipMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getShipMethodId() {
        return shipMethodId;
    }

    /**
     * Sets the value of the shipMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setShipMethodId(IdType value) {
        this.shipMethodId = value;
    }

    /**
     * Gets the value of the shipMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipMethodName() {
        return shipMethodName;
    }

    /**
     * Sets the value of the shipMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipMethodName(String value) {
        this.shipMethodName = value;
    }

    /**
     * Gets the value of the remainingCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainingCredit() {
        return remainingCredit;
    }

    /**
     * Sets the value of the remainingCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainingCredit(BigDecimal value) {
        this.remainingCredit = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetail }
     *     
     */
    public PaymentDetail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetail }
     *     
     */
    public void setDetail(PaymentDetail value) {
        this.detail = value;
    }

    /**
     * Gets the value of the discountRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    /**
     * Sets the value of the discountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountRate(BigDecimal value) {
        this.discountRate = value;
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

    /**
     * Gets the value of the discountTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscountTaxable() {
        return discountTaxable;
    }

    /**
     * Sets the value of the discountTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscountTaxable(Boolean value) {
        this.discountTaxable = value;
    }

}
