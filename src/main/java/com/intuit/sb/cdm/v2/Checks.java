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
 * Provides the definition that allows bulk data transfer of Checks
 * 
 * <p>Java class for Checks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Checks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmCollections">
 *       &lt;sequence>
 *         &lt;element name="Check" type="{http://www.intuit.com/sb/cdm/v2}Check" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Checks", propOrder = {
    "checks"
})
public class Checks
    extends CdmCollections
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Check")
    protected List<Check> checks;

    /**
     * Gets the value of the checks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChecks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Check }
     * 
     * 
     */
    public List<Check> getChecks() {
        if (checks == null) {
            checks = new ArrayList<Check>();
        }
        return this.checks;
    }

}
