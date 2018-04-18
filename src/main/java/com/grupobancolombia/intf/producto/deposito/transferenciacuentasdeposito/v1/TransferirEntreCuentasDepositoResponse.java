
package com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferirEntreCuentasDepositoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferirEntreCuentasDepositoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionTransaccion" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}InformacionTransaccionResp"/>
 *         &lt;element name="informacionCliente" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}InformacionClienteResp"/>
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
@XmlType(name = "TransferirEntreCuentasDepositoResponse", propOrder = {
    "informacionTransaccion",
    "informacionCliente",
    "informacionOficina"
})
@XmlRootElement
public class TransferirEntreCuentasDepositoResponse {

    @XmlElement(required = true)
    protected InformacionTransaccionResp informacionTransaccion;
    @XmlElement(required = true)
    protected InformacionClienteResp informacionCliente;
    @XmlElement(required = true)
    protected InformacionOficina informacionOficina;

    /**
     * Gets the value of the informacionTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionTransaccionResp }
     *     
     */
    public InformacionTransaccionResp getInformacionTransaccion() {
        return informacionTransaccion;
    }

    /**
     * Sets the value of the informacionTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionTransaccionResp }
     *     
     */
    public void setInformacionTransaccion(InformacionTransaccionResp value) {
        this.informacionTransaccion = value;
    }

    /**
     * Gets the value of the informacionCliente property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionClienteResp }
     *     
     */
    public InformacionClienteResp getInformacionCliente() {
        return informacionCliente;
    }

    /**
     * Sets the value of the informacionCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionClienteResp }
     *     
     */
    public void setInformacionCliente(InformacionClienteResp value) {
        this.informacionCliente = value;
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
