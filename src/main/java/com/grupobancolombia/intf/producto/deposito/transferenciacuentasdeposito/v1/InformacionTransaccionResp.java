
package com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InformacionTransaccionResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionTransaccionResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroComprobanteTransaccion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="costoTransaccion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fechaTransaccion" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="horaTransaccion" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionTransaccionResp", propOrder = {
    "numeroComprobanteTransaccion",
    "costoTransaccion",
    "fechaTransaccion",
    "horaTransaccion"
})
public class InformacionTransaccionResp {

    protected int numeroComprobanteTransaccion;
    @XmlElement(required = true)
    protected BigDecimal costoTransaccion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaTransaccion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaTransaccion;

    /**
     * Gets the value of the numeroComprobanteTransaccion property.
     * 
     */
    public int getNumeroComprobanteTransaccion() {
        return numeroComprobanteTransaccion;
    }

    /**
     * Sets the value of the numeroComprobanteTransaccion property.
     * 
     */
    public void setNumeroComprobanteTransaccion(int value) {
        this.numeroComprobanteTransaccion = value;
    }

    /**
     * Gets the value of the costoTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostoTransaccion() {
        return costoTransaccion;
    }

    /**
     * Sets the value of the costoTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostoTransaccion(BigDecimal value) {
        this.costoTransaccion = value;
    }

    /**
     * Gets the value of the fechaTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTransaccion() {
        return fechaTransaccion;
    }

    /**
     * Sets the value of the fechaTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTransaccion(XMLGregorianCalendar value) {
        this.fechaTransaccion = value;
    }

    /**
     * Gets the value of the horaTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraTransaccion() {
        return horaTransaccion;
    }

    /**
     * Sets the value of the horaTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraTransaccion(XMLGregorianCalendar value) {
        this.horaTransaccion = value;
    }

}
