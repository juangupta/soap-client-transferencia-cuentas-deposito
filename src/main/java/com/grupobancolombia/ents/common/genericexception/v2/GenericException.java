
package com.grupobancolombia.ents.common.genericexception.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * DV.2.0
 * Fecha creaci�n	[ 2010-05-01 ]*
 * Fecha caducidad	[ AAAA-MM-DD ]*
 * Autor(es) 		[ Juan Jose Figueredo/Colombia/IBM@IBMCO, Jose Francisco Nanez/Colombia/Contr/IBM@IBMCO ]*
 * Estado 		[ Desarrollo Funcional, Desarrollo T�cnico, Publicado,  ]*
 * C�digo Requerimiento  [  ]*
 * Versi�n Anterior             [ 1.0 ]
 * Versi�n Posterior           [  ]
 * Descripci�n 		[ Definici�n de entidad de negocio est�ndar, para el manejo de las excepciones ]			
 * Tipo de elemento de dato [ Compuesto ]
 * Requiere                        [ No Aplica ]
 * Es requerido por            [ No Aplica ]
 * Sustituye                        [ No Disponible ]
 * Es sustituido por            [ No Disponible ]
 * Correlaci�n                    [ No Disponible ]
 * Comprobaci�n               [ No Disponible ]
 * Unidad Organizacional a cargo
 *                       Nombre                            [ No Disponible ] 
 *                       Dependencia                   [ No Disponible ] 
 *                       Cargo                               [ No Disponible ] 
 *                       Em@l                               [ No Disponible ] 
 *                       Fuente                             [ No Disponible ] 
 *                       Fecha de publicaci�n      [ No Disponible ] 
 * 
 * 
 * <p>Java class for GenericException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericException", propOrder = {
    "code",
    "description"
})
public class GenericException {

    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String description;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
