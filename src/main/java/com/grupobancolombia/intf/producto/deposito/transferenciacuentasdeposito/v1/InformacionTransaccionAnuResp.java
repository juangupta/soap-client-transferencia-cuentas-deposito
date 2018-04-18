
package com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformacionTransaccionAnuResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionTransaccionAnuResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroComprobanteTransaccion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
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
@XmlType(name = "InformacionTransaccionAnuResp", propOrder = {
    "numeroComprobanteTransaccion"
})
public class InformacionTransaccionAnuResp {

    protected Integer numeroComprobanteTransaccion;

    /**
     * Gets the value of the numeroComprobanteTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroComprobanteTransaccion() {
        return numeroComprobanteTransaccion;
    }

    /**
     * Sets the value of the numeroComprobanteTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroComprobanteTransaccion(Integer value) {
        this.numeroComprobanteTransaccion = value;
    }

}
