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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type of the object return in the response to the Generic Transaction Query.
 * 
 * <p>Java class for TxnGeneric complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxnGeneric">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmBase">
 *       &lt;sequence>
 *         &lt;element name="Header" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.intuit.com/sb/cdm/v2}HeaderBase">
 *                 &lt;sequence>
 *                   &lt;element name="TxnType" type="{http://www.intuit.com/sb/cdm/v2}TxnTypeEnum" minOccurs="0"/>
 *                   &lt;group ref="{http://www.intuit.com/sb/cdm/v2}AccountReferenceGroup" minOccurs="0"/>
 *                   &lt;group ref="{http://www.intuit.com/sb/cdm/v2}EntityReferenceGroup" minOccurs="0"/>
 *                   &lt;element name="TotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxnGeneric", propOrder = {
    "header"
})
@XmlRootElement(name = "TxnGeneric")
public class TxnGeneric
    extends CdmBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Header")
    protected TxnGeneric.Header header;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link TxnGeneric.Header }
     *     
     */
    public TxnGeneric.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnGeneric.Header }
     *     
     */
    public void setHeader(TxnGeneric.Header value) {
        this.header = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}HeaderBase">
     *       &lt;sequence>
     *         &lt;element name="TxnType" type="{http://www.intuit.com/sb/cdm/v2}TxnTypeEnum" minOccurs="0"/>
     *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}AccountReferenceGroup" minOccurs="0"/>
     *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}EntityReferenceGroup" minOccurs="0"/>
     *         &lt;element name="TotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "txnType",
        "accountId",
        "accountName",
        "accountType",
        "entityId",
        "entityName",
        "entityType",
        "totalAmt"
    })
    public static class Header
        extends HeaderBase
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "TxnType")
        protected TxnTypeEnum txnType;
        @XmlElement(name = "AccountId")
        protected IdType accountId;
        @XmlElement(name = "AccountName")
        protected String accountName;
        @XmlElement(name = "AccountType")
        protected AccountTypeEnum accountType;
        @XmlElement(name = "EntityId")
        protected IdType entityId;
        @XmlElement(name = "EntityName")
        protected String entityName;
        @XmlElement(name = "EntityType")
        protected EntityTypeEnum entityType;
        @XmlElement(name = "TotalAmt")
        protected BigDecimal totalAmt;

        /**
         * Gets the value of the txnType property.
         * 
         * @return
         *     possible object is
         *     {@link TxnTypeEnum }
         *     
         */
        public TxnTypeEnum getTxnType() {
            return txnType;
        }

        /**
         * Sets the value of the txnType property.
         * 
         * @param value
         *     allowed object is
         *     {@link TxnTypeEnum }
         *     
         */
        public void setTxnType(TxnTypeEnum value) {
            this.txnType = value;
        }

        /**
         * Gets the value of the accountId property.
         * 
         * @return
         *     possible object is
         *     {@link IdType }
         *     
         */
        public IdType getAccountId() {
            return accountId;
        }

        /**
         * Sets the value of the accountId property.
         * 
         * @param value
         *     allowed object is
         *     {@link IdType }
         *     
         */
        public void setAccountId(IdType value) {
            this.accountId = value;
        }

        /**
         * Gets the value of the accountName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountName() {
            return accountName;
        }

        /**
         * Sets the value of the accountName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountName(String value) {
            this.accountName = value;
        }

        /**
         * Gets the value of the accountType property.
         * 
         * @return
         *     possible object is
         *     {@link AccountTypeEnum }
         *     
         */
        public AccountTypeEnum getAccountType() {
            return accountType;
        }

        /**
         * Sets the value of the accountType property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountTypeEnum }
         *     
         */
        public void setAccountType(AccountTypeEnum value) {
            this.accountType = value;
        }

        /**
         * Gets the value of the entityId property.
         * 
         * @return
         *     possible object is
         *     {@link IdType }
         *     
         */
        public IdType getEntityId() {
            return entityId;
        }

        /**
         * Sets the value of the entityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link IdType }
         *     
         */
        public void setEntityId(IdType value) {
            this.entityId = value;
        }

        /**
         * Gets the value of the entityName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntityName() {
            return entityName;
        }

        /**
         * Sets the value of the entityName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntityName(String value) {
            this.entityName = value;
        }

        /**
         * Gets the value of the entityType property.
         * 
         * @return
         *     possible object is
         *     {@link EntityTypeEnum }
         *     
         */
        public EntityTypeEnum getEntityType() {
            return entityType;
        }

        /**
         * Sets the value of the entityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link EntityTypeEnum }
         *     
         */
        public void setEntityType(EntityTypeEnum value) {
            this.entityType = value;
        }

        /**
         * Gets the value of the totalAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalAmt() {
            return totalAmt;
        }

        /**
         * Sets the value of the totalAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalAmt(BigDecimal value) {
            this.totalAmt = value;
        }

    }

}
