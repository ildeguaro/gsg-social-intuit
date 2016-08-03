//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.03 at 03:30:34 PM EDT 
//


package com.intuit.sb.cdm.v2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds complete information about a payment received by credit card
 * 
 * <p>Java class for CreditCardPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditChargeInfo" type="{http://www.intuit.com/sb/cdm/v2}CreditChargeInfo" minOccurs="0"/>
 *         &lt;element name="CreditChargeResponse" type="{http://www.intuit.com/sb/cdm/v2}CreditChargeResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardPayment", propOrder = {
    "creditChargeInfo",
    "creditChargeResponse"
})
public class CreditCardPayment
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CreditChargeInfo")
    protected CreditChargeInfo creditChargeInfo;
    @XmlElement(name = "CreditChargeResponse")
    protected CreditChargeResponse creditChargeResponse;

    /**
     * Gets the value of the creditChargeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditChargeInfo }
     *     
     */
    public CreditChargeInfo getCreditChargeInfo() {
        return creditChargeInfo;
    }

    /**
     * Sets the value of the creditChargeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditChargeInfo }
     *     
     */
    public void setCreditChargeInfo(CreditChargeInfo value) {
        this.creditChargeInfo = value;
    }

    /**
     * Gets the value of the creditChargeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CreditChargeResponse }
     *     
     */
    public CreditChargeResponse getCreditChargeResponse() {
        return creditChargeResponse;
    }

    /**
     * Sets the value of the creditChargeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditChargeResponse }
     *     
     */
    public void setCreditChargeResponse(CreditChargeResponse value) {
        this.creditChargeResponse = value;
    }

}