
package com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IdentificacionTransaccion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificacionTransaccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroRastreoOrigen">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FechaTransaccionOrigen" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="valorTransferencia">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="20"/>
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
@XmlType(name = "IdentificacionTransaccion", propOrder = {
    "numeroRastreoOrigen",
    "fechaTransaccionOrigen",
    "valorTransferencia"
})
public class IdentificacionTransaccion {

    @XmlElement(required = true)
    protected String numeroRastreoOrigen;
    @XmlElement(name = "FechaTransaccionOrigen", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTransaccionOrigen;
    @XmlElement(required = true)
    protected BigDecimal valorTransferencia;

    /**
     * Gets the value of the numeroRastreoOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRastreoOrigen() {
        return numeroRastreoOrigen;
    }

    /**
     * Sets the value of the numeroRastreoOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRastreoOrigen(String value) {
        this.numeroRastreoOrigen = value;
    }

    /**
     * Gets the value of the fechaTransaccionOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTransaccionOrigen() {
        return fechaTransaccionOrigen;
    }

    /**
     * Sets the value of the fechaTransaccionOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTransaccionOrigen(XMLGregorianCalendar value) {
        this.fechaTransaccionOrigen = value;
    }

    /**
     * Gets the value of the valorTransferencia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTransferencia() {
        return valorTransferencia;
    }

    /**
     * Sets the value of the valorTransferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTransferencia(BigDecimal value) {
        this.valorTransferencia = value;
    }

}
