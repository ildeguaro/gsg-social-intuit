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
 * Provides the definition that allows bulk data transfer of UOMs
 * 
 * <p>Java class for UOMs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UOMs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmCollections">
 *       &lt;sequence>
 *         &lt;element name="UOM" type="{http://www.intuit.com/sb/cdm/v2}UOM" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UOMs", propOrder = {
    "uoms"
})
public class UOMs
    extends CdmCollections
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UOM")
    protected List<UOM> uoms;

    /**
     * Gets the value of the uoms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uoms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUOMS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UOM }
     * 
     * 
     */
    public List<UOM> getUOMS() {
        if (uoms == null) {
            uoms = new ArrayList<UOM>();
        }
        return this.uoms;
    }

}