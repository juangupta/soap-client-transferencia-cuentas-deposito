
package com.grupobancolombia.ents.soi.messageformat.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.grupobancolombia.ents.soi.coreextensions.v2.Classifications;
import com.grupobancolombia.ents.soi.coreextensions.v2.Destination;
import com.grupobancolombia.ents.soi.coreextensions.v2.UsernameToken;


/**
 * <p>Java class for RequestHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://grupobancolombia.com/ents/SOI/MessageFormat/V2.1}Header">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://grupobancolombia.com/ents/SOI/CoreExtensions/V2.1}UsernameToken"/>
 *         &lt;element name="destination" type="{http://grupobancolombia.com/ents/SOI/CoreExtensions/V2.1}Destination" minOccurs="0"/>
 *         &lt;element name="classifications" type="{http://grupobancolombia.com/ents/SOI/CoreExtensions/V2.1}Classifications" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeader", propOrder = {
    "userId",
    "destination",
    "classifications"
})
@XmlRootElement
public class RequestHeader
    extends Header
{

    @XmlElement(required = true)
    protected UsernameToken userId;
    protected Destination destination;
    protected Classifications classifications;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link UsernameToken }
     *     
     */
    public UsernameToken getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsernameToken }
     *     
     */
    public void setUserId(UsernameToken value) {
        this.userId = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Destination }
     *     
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination }
     *     
     */
    public void setDestination(Destination value) {
        this.destination = value;
    }

    /**
     * Gets the value of the classifications property.
     * 
     * @return
     *     possible object is
     *     {@link Classifications }
     *     
     */
    public Classifications getClassifications() {
        return classifications;
    }

    /**
     * Sets the value of the classifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Classifications }
     *     
     */
    public void setClassifications(Classifications value) {
        this.classifications = value;
    }

}
