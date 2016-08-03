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
 * QBO only: Financial transaction representing an expenditure via Cash.
 * 
 * <p>Java class for CashPurchase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashPurchase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmBase">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.intuit.com/sb/cdm/v2}CashPurchaseHeader" minOccurs="0"/>
 *         &lt;element name="Line" type="{http://www.intuit.com/sb/cdm/v2}CashPurchaseLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashPurchase", propOrder = {
    "header",
    "lines"
})
@XmlRootElement(name = "CashPurchase")
public class CashPurchase
    extends CdmBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Header")
    protected CashPurchaseHeader header;
    @XmlElement(name = "Line")
    protected List<CashPurchaseLine> lines;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link CashPurchaseHeader }
     *     
     */
    public CashPurchaseHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashPurchaseHeader }
     *     
     */
    public void setHeader(CashPurchaseHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashPurchaseLine }
     * 
     * 
     */
    public List<CashPurchaseLine> getLines() {
        if (lines == null) {
            lines = new ArrayList<CashPurchaseLine>();
        }
        return this.lines;
    }

}