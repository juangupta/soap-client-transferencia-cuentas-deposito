
package com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformacionClienteResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionClienteResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreTitularCuentaOrigen">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nombreTitularCuentaDestino" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="identificacionClienteCuentaDestino" type="{http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0}IdentificacionClienteCuentaDestino"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionClienteResp", propOrder = {
    "nombreTitularCuentaOrigen",
    "nombreTitularCuentaDestino",
    "identificacionClienteCuentaDestino"
})
public class InformacionClienteResp {

    @XmlElement(required = true)
    protected String nombreTitularCuentaOrigen;
    protected String nombreTitularCuentaDestino;
    @XmlElement(required = true)
    protected IdentificacionClienteCuentaDestino identificacionClienteCuentaDestino;

    /**
     * Gets the value of the nombreTitularCuentaOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTitularCuentaOrigen() {
        return nombreTitularCuentaOrigen;
    }

    /**
     * Sets the value of the nombreTitularCuentaOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTitularCuentaOrigen(String value) {
        this.nombreTitularCuentaOrigen = value;
    }

    /**
     * Gets the value of the nombreTitularCuentaDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTitularCuentaDestino() {
        return nombreTitularCuentaDestino;
    }

    /**
     * Sets the value of the nombreTitularCuentaDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTitularCuentaDestino(String value) {
        this.nombreTitularCuentaDestino = value;
    }

    /**
     * Gets the value of the identificacionClienteCuentaDestino property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionClienteCuentaDestino }
     *     
     */
    public IdentificacionClienteCuentaDestino getIdentificacionClienteCuentaDestino() {
        return identificacionClienteCuentaDestino;
    }

    /**
     * Sets the value of the identificacionClienteCuentaDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionClienteCuentaDestino }
     *     
     */
    public void setIdentificacionClienteCuentaDestino(IdentificacionClienteCuentaDestino value) {
        this.identificacionClienteCuentaDestino = value;
    }

}
