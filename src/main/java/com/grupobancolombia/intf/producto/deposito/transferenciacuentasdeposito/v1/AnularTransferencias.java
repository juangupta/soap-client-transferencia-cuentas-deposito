
package com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnularTransferencias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnularTransferencias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionCuenta" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}InformacionCuenta"/>
 *         &lt;element name="identificacionTransaccion" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}IdentificacionTransaccion"/>
 *         &lt;element name="informacionClienteAnul" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}InformacionClienteAnul"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnularTransferencias", propOrder = {
    "informacionCuenta",
    "identificacionTransaccion",
    "informacionClienteAnul"
})
public class AnularTransferencias {

    @XmlElement(required = true)
    protected InformacionCuenta informacionCuenta;
    @XmlElement(required = true)
    protected IdentificacionTransaccion identificacionTransaccion;
    @XmlElement(required = true)
    protected InformacionClienteAnul informacionClienteAnul;

    /**
     * Gets the value of the informacionCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionCuenta }
     *     
     */
    public InformacionCuenta getInformacionCuenta() {
        return informacionCuenta;
    }

    /**
     * Sets the value of the informacionCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionCuenta }
     *     
     */
    public void setInformacionCuenta(InformacionCuenta value) {
        this.informacionCuenta = value;
    }

    /**
     * Gets the value of the identificacionTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionTransaccion }
     *     
     */
    public IdentificacionTransaccion getIdentificacionTransaccion() {
        return identificacionTransaccion;
    }

    /**
     * Sets the value of the identificacionTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionTransaccion }
     *     
     */
    public void setIdentificacionTransaccion(IdentificacionTransaccion value) {
        this.identificacionTransaccion = value;
    }

    /**
     * Gets the value of the informacionClienteAnul property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionClienteAnul }
     *     
     */
    public InformacionClienteAnul getInformacionClienteAnul() {
        return informacionClienteAnul;
    }

    /**
     * Sets the value of the informacionClienteAnul property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionClienteAnul }
     *     
     */
    public void setInformacionClienteAnul(InformacionClienteAnul value) {
        this.informacionClienteAnul = value;
    }

}
