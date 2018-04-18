
package com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformacionOficina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionOficina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oficinaIngresoTransaccionDebito" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="oficinaIngresoTransaccionCredito" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionOficina", propOrder = {
    "oficinaIngresoTransaccionDebito",
    "oficinaIngresoTransaccionCredito"
})
public class InformacionOficina {

    protected String oficinaIngresoTransaccionDebito;
    protected String oficinaIngresoTransaccionCredito;

    /**
     * Gets the value of the oficinaIngresoTransaccionDebito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOficinaIngresoTransaccionDebito() {
        return oficinaIngresoTransaccionDebito;
    }

    /**
     * Sets the value of the oficinaIngresoTransaccionDebito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOficinaIngresoTransaccionDebito(String value) {
        this.oficinaIngresoTransaccionDebito = value;
    }

    /**
     * Gets the value of the oficinaIngresoTransaccionCredito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOficinaIngresoTransaccionCredito() {
        return oficinaIngresoTransaccionCredito;
    }

    /**
     * Sets the value of the oficinaIngresoTransaccionCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOficinaIngresoTransaccionCredito(String value) {
        this.oficinaIngresoTransaccionCredito = value;
    }

}
