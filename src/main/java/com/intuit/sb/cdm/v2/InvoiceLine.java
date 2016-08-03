//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.03 at 03:30:34 PM EDT 
//


package com.intuit.sb.cdm.v2;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * A service or product sold, along with quantity, price, and other descriptive information
 * 
 * <p>Java class for InvoiceLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}LineSales">
 *       &lt;sequence>
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}TxnLineReferenceGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceLine", propOrder = {
    "serviceDate",
    "txnId",
    "txnLineId"
})
public class InvoiceLine
    extends LineSales
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ServiceDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Calendar serviceDate;
    @XmlElement(name = "TxnId")
    protected IdType txnId;
    @XmlElement(name = "TxnLineId")
    protected IdType txnLineId;

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDate(Calendar value) {
        this.serviceDate = value;
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
     * Gets the value of the txnLineId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getTxnLineId() {
        return txnLineId;
    }

    /**
     * Sets the value of the txnLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setTxnLineId(IdType value) {
        this.txnLineId = value;
    }

}