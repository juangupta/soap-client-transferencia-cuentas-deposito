
package com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformacionCuenta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionCuenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionCuentaOrigen" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}IdentificacionCuenta"/>
 *         &lt;element name="informacionCuentaDestino" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}IdentificacionCuenta"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionCuenta", propOrder = {
    "informacionCuentaOrigen",
    "informacionCuentaDestino"
})
public class InformacionCuenta {

    @XmlElement(required = true)
    protected IdentificacionCuenta informacionCuentaOrigen;
    @XmlElement(required = true)
    protected IdentificacionCuenta informacionCuentaDestino;

    /**
     * Gets the value of the informacionCuentaOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionCuenta }
     *     
     */
    public IdentificacionCuenta getInformacionCuentaOrigen() {
        return informacionCuentaOrigen;
    }

    /**
     * Sets the value of the informacionCuentaOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionCuenta }
     *     
     */
    public void setInformacionCuentaOrigen(IdentificacionCuenta value) {
        this.informacionCuentaOrigen = value;
    }

    /**
     * Gets the value of the informacionCuentaDestino property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionCuenta }
     *     
     */
    public IdentificacionCuenta getInformacionCuentaDestino() {
        return informacionCuentaDestino;
    }

    /**
     * Sets the value of the informacionCuentaDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionCuenta }
     *     
     */
    public void setInformacionCuentaDestino(IdentificacionCuenta value) {
        this.informacionCuentaDestino = value;
    }

}
