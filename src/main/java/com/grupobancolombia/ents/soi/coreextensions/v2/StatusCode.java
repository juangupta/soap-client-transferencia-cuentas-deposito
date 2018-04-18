
package com.grupobancolombia.ents.soi.coreextensions.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="BusinessException"/>
 *     &lt;enumeration value="ProviderException"/>
 *     &lt;enumeration value="SystemException"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusCode")
@XmlEnum
public enum StatusCode {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("BusinessException")
    BUSINESS_EXCEPTION("BusinessException"),
    @XmlEnumValue("ProviderException")
    PROVIDER_EXCEPTION("ProviderException"),
    @XmlEnumValue("SystemException")
    SYSTEM_EXCEPTION("SystemException");
    private final String value;

    StatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusCode fromValue(String v) {
        for (StatusCode c: StatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
