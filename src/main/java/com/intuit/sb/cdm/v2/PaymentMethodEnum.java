//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.03 at 03:30:34 PM EDT 
//


package com.intuit.sb.cdm.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AmEx"/>
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="Check"/>
 *     &lt;enumeration value="DebitCard"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="ECheck"/>
 *     &lt;enumeration value="GiftCard"/>
 *     &lt;enumeration value="MasterCard"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="OtherCreditCard"/>
 *     &lt;enumeration value="Visa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodEnum")
@XmlEnum
public enum PaymentMethodEnum {

    @XmlEnumValue("AmEx")
    AM_EX("AmEx"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("Check")
    CHECK("Check"),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    @XmlEnumValue("ECheck")
    E_CHECK("ECheck"),
    @XmlEnumValue("GiftCard")
    GIFT_CARD("GiftCard"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("OtherCreditCard")
    OTHER_CREDIT_CARD("OtherCreditCard"),
    @XmlEnumValue("Visa")
    VISA("Visa");
    private final String value;

    PaymentMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodEnum fromValue(String v) {
        for (PaymentMethodEnum c: PaymentMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
