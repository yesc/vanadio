//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

// import javax.xml.bind.annotation.*;


import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.*;
import com.abubusoft.kripton.xml.XmlType;

import javax.xml.bind.annotation.XmlRootElement;

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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}font" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="textColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="backgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="position"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Top"/&gt;
 *             &lt;enumeration value="Bottom"/&gt;
 *             &lt;enumeration value="Left"/&gt;
 *             &lt;enumeration value="Right"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
//// @XmlAccessorType(XmlAccessType.FIELD)
//
//// @XmlRootElement(name = "chartLegend", namespace = "http://jasperreports.sourceforge.net/jasperreports")
@BindType
public class ChartLegend {

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public Font font;
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String textColor;
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String backgroundColor;
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String position;

}
