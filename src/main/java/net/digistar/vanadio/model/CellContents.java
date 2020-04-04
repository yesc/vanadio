//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.*;
import com.abubusoft.kripton.xml.XmlType;

import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}property" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}box" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}line"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rectangle"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ellipse"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}image"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}staticText"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}textField"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subreport"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}elementGroup"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}frame"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}componentElement"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}genericElement"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="backcolor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Opaque"/&gt;
 *             &lt;enumeration value="Transparent"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
//// @XmlAccessorType(XmlAccessType.FIELD)
//
//// @XmlRootElement(name = "cellContents", namespace = "http://jasperreports.sourceforge.net/jasperreports")
@BindType
public class CellContents {

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public List<Property> property=new ArrayList<>();
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public Box box;

    //TODO manage list
//    @XmlElements({
//            @XmlElement(name = "line", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Line.class),
//            @XmlElement(name = "rectangle", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Rectangle.class),
//            @XmlElement(name = "ellipse", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Ellipse.class),
//            @XmlElement(name = "image", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Image.class),
//            @XmlElement(name = "staticText", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = StaticText.class),
//            @XmlElement(name = "textField", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = TextField.class),
//            @XmlElement(name = "subreport", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Subreport.class),
//            @XmlElement(name = "elementGroup", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ElementGroup.class),
//            @XmlElement(name = "frame", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Frame.class),
//            @XmlElement(name = "componentElement", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ComponentElement.class),
//            @XmlElement(name = "genericElement", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = GenericElement.class)
//    })
//    public List<Object> lineOrRectangleOrEllipse;
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String backcolor;
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String mode;
    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String style;

}
