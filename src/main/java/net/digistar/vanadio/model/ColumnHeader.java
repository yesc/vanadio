//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}band" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "band"
})
@XmlRootElement(name = "columnHeader", namespace = "http://jasperreports.sourceforge.net/jasperreports")
//@BindType
public class ColumnHeader {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Band band;

    /**
     * Gets the value of the band property.
     *
     * @return possible object is
     * {@link Band }
     */
    public Band getBand() {
        return band;
    }

    /**
     * Sets the value of the band property.
     *
     * @param value allowed object is
     *              {@link Band }
     */
    public void setBand(Band value) {
        this.band = value;
    }

}