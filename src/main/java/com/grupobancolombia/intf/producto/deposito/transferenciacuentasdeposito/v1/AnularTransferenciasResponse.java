
package com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnularTransferenciasResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnularTransferenciasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionTransaccionAnuResp" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}InformacionTransaccionAnuResp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnularTransferenciasResponse", propOrder = {
    "informacionTransaccionAnuResp"
})
public class AnularTransferenciasResponse {

    @XmlElement(required = true)
    protected InformacionTransaccionAnuResp informacionTransaccionAnuResp;

    /**
     * Gets the value of the informacionTransaccionAnuResp property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionTransaccionAnuResp }
     *     
     */
    public InformacionTransaccionAnuResp getInformacionTransaccionAnuResp() {
        return informacionTransaccionAnuResp;
    }

    /**
     * Sets the value of the informacionTransaccionAnuResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionTransaccionAnuResp }
     *     
     */
    public void setInformacionTransaccionAnuResp(InformacionTransaccionAnuResp value) {
        this.informacionTransaccionAnuResp = value;
    }

}
