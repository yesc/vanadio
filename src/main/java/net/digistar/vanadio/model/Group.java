//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

// import javax.xml.bind.annotation.*;
import com.abubusoft.kripton.annotation.BindAdapter;
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.*;
import com.abubusoft.kripton.xml.XmlType;
import net.digistar.vanadio.support.CollapsedStringAdapter;
// import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}groupExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}groupHeader" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}groupFooter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isStartNewColumn" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isStartNewPage" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isResetPageNumber" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isReprintHeaderOnEachPage" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isReprintHeaderOnEachColumn" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="minHeightToStartNewPage" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" /&gt;
 *       &lt;attribute name="minDetailsToStartFromTop" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" /&gt;
 *       &lt;attribute name="footerPosition" default="Normal"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Normal"/&gt;
 *             &lt;enumeration value="StackAtBottom"/&gt;
 *             &lt;enumeration value="ForceAtBottom"/&gt;
 *             &lt;enumeration value="CollateAtBottom"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="keepTogether" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="preventOrphanFooter" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
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
//// @XmlRootElement(name = "group", namespace = "http://jasperreports.sourceforge.net/jasperreports")
@BindType
public class Group {

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public GroupExpression groupExpression;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public GroupHeader groupHeader;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public GroupFooter groupFooter;
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String name;
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String isStartNewColumn="None";
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String isStartNewPage="false";
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String isResetPageNumber="false";
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String isReprintHeaderOnEachPage="false";
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String isReprintHeaderOnEachColumn="false";
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    @BindAdapter(adapter=CollapsedStringAdapter.class)
    // // @XmlSchemaType(name = "NMTOKEN")
    public String minHeightToStartNewPage="0";
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    @BindAdapter(adapter=CollapsedStringAdapter.class)
    // // @XmlSchemaType(name = "NMTOKEN")
    public String minDetailsToStartFromTop="0";
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String footerPosition="Normal";
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String keepTogether="false";
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String preventOrphanFooter="false";

}
