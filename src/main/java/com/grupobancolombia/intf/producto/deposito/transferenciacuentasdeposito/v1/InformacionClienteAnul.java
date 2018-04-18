
package com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformacionClienteAnul complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionClienteAnul">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionClienteCuentaOrigen" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}IdentificacionCliente"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionClienteAnul", propOrder = {
    "identificacionClienteCuentaOrigen"
})
public class InformacionClienteAnul {

    @XmlElement(required = true)
    protected IdentificacionCliente identificacionClienteCuentaOrigen;

    /**
     * Gets the value of the identificacionClienteCuentaOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionCliente }
     *     
     */
    public IdentificacionCliente getIdentificacionClienteCuentaOrigen() {
        return identificacionClienteCuentaOrigen;
    }

    /**
     * Sets the value of the identificacionClienteCuentaOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionCliente }
     *     
     */
    public void setIdentificacionClienteCuentaOrigen(IdentificacionCliente value) {
        this.identificacionClienteCuentaOrigen = value;
    }

}
