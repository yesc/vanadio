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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}incrementWhenExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}datasetRun" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="resetType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Report"/&gt;
 *             &lt;enumeration value="Page"/&gt;
 *             &lt;enumeration value="Column"/&gt;
 *             &lt;enumeration value="Group"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="resetGroup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="incrementType" default="None"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Report"/&gt;
 *             &lt;enumeration value="Page"/&gt;
 *             &lt;enumeration value="Column"/&gt;
 *             &lt;enumeration value="Group"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="incrementGroup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
//// @XmlAccessorType(XmlAccessType.FIELD)
//
//// @XmlRootElement(name = "dataset", namespace = "http://jasperreports.sourceforge.net/jasperreports")
@BindType
public class Dataset {

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public IncrementWhenExpression incrementWhenExpression;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public DatasetRun datasetRun;
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String resetType;
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String resetGroup;
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String incrementType="None";
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String incrementGroup;
}
