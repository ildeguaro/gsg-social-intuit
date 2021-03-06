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
 * Adjusted inventory item, along with adjusted quantity, adjusted value, and other descriptive information
 * 
 * <p>Java class for InventoryAdjustmentLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryAdjustmentLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}LineBase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}ItemReferenceGroup" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="QtyAdj" type="{http://www.intuit.com/sb/cdm/v2}QtyAdj" minOccurs="0"/>
 *           &lt;element name="ValueAdj" type="{http://www.intuit.com/sb/cdm/v2}ValueAdj" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryAdjustmentLine", propOrder = {
    "itemId",
    "itemName",
    "itemType",
    "valueAdj",
    "qtyAdj"
})
public class InventoryAdjustmentLine
    extends LineBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemId")
    protected IdType itemId;
    @XmlElement(name = "ItemName")
    protected String itemName;
    @XmlElement(name = "ItemType")
    protected ItemTypeEnum itemType;
    @XmlElement(name = "ValueAdj")
    protected ValueAdj valueAdj;
    @XmlElement(name = "QtyAdj")
    protected QtyAdj qtyAdj;

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setItemId(IdType value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link ItemTypeEnum }
     *     
     */
    public ItemTypeEnum getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTypeEnum }
     *     
     */
    public void setItemType(ItemTypeEnum value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the valueAdj property.
     * 
     * @return
     *     possible object is
     *     {@link ValueAdj }
     *     
     */
    public ValueAdj getValueAdj() {
        return valueAdj;
    }

    /**
     * Sets the value of the valueAdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAdj }
     *     
     */
    public void setValueAdj(ValueAdj value) {
        this.valueAdj = value;
    }

    /**
     * Gets the value of the qtyAdj property.
     * 
     * @return
     *     possible object is
     *     {@link QtyAdj }
     *     
     */
    public QtyAdj getQtyAdj() {
        return qtyAdj;
    }

    /**
     * Sets the value of the qtyAdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link QtyAdj }
     *     
     */
    public void setQtyAdj(QtyAdj value) {
        this.qtyAdj = value;
    }

}
