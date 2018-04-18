
package com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferirEntreCuentasDeposito complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferirEntreCuentasDeposito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionCliente" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}InformacionCliente"/>
 *         &lt;element name="informacionCuenta" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}InformacionCuenta"/>
 *         &lt;element name="informacionTransaccion" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}InformacionTransaccion"/>
 *         &lt;element name="informacionSistema" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}InformacionSistema"/>
 *         &lt;element name="informacionOficina" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}InformacionOficina"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferirEntreCuentasDeposito", propOrder = {
    "informacionCliente",
    "informacionCuenta",
    "informacionTransaccion",
    "informacionSistema",
    "informacionOficina"
})
@XmlRootElement
public class TransferirEntreCuentasDeposito {

    @XmlElement(required = true)
    protected InformacionCliente informacionCliente;
    @XmlElement(required = true)
    protected InformacionCuenta informacionCuenta;
    @XmlElement(required = true)
    protected InformacionTransaccion informacionTransaccion;
    @XmlElement(required = true)
    protected InformacionSistema informacionSistema;
    @XmlElement(required = true)
    protected InformacionOficina informacionOficina;

    /**
     * Gets the value of the informacionCliente property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionCliente }
     *     
     */
    public InformacionCliente getInformacionCliente() {
        return informacionCliente;
    }

    /**
     * Sets the value of the informacionCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionCliente }
     *     
     */
    public void setInformacionCliente(InformacionCliente value) {
        this.informacionCliente = value;
    }

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
     * Gets the value of the informacionTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionTransaccion }
     *     
     */
    public InformacionTransaccion getInformacionTransaccion() {
        return informacionTransaccion;
    }

    /**
     * Sets the value of the informacionTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionTransaccion }
     *     
     */
    public void setInformacionTransaccion(InformacionTransaccion value) {
        this.informacionTransaccion = value;
    }

    /**
     * Gets the value of the informacionSistema property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionSistema }
     *     
     */
    public InformacionSistema getInformacionSistema() {
        return informacionSistema;
    }

    /**
     * Sets the value of the informacionSistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionSistema }
     *     
     */
    public void setInformacionSistema(InformacionSistema value) {
        this.informacionSistema = value;
    }

    /**
     * Gets the value of the informacionOficina property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionOficina }
     *     
     */
    public InformacionOficina getInformacionOficina() {
        return informacionOficina;
    }

    /**
     * Sets the value of the informacionOficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionOficina }
     *     
     */
    public void setInformacionOficina(InformacionOficina value) {
        this.informacionOficina = value;
    }

}
