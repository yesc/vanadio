//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

// import javax.xml.bind.annotation.*;
import com.abubusoft.kripton.annotation.BindAdapter;
import com.abubusoft.kripton.annotation.BindXml;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pen" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}topPen" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}leftPen" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bottomPen" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rightPen" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="border"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="borderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="padding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="topBorder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="topBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="topPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="leftBorder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="leftBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="leftPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="bottomBorder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="bottomBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="bottomPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="rightBorder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="rightBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rightPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
// @XmlAccessorType(XmlAccessType.FIELD)
//
// @XmlRootElement(name = "box", namespace = "http://jasperreports.sourceforge.net/jasperreports")
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.BindXml;
import com.abubusoft.kripton.xml.XmlType;

@BindType
public class  Box {

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public Pen pen;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public TopPen topPen;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public LeftPen leftPen;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public BottomPen bottomPen;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public RightPen rightPen;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "border")
    public String border;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "borderColor")
    public String borderColor;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "padding")
    @BindAdapter(adapter=CollapsedStringAdapter.class)
    // // @XmlSchemaType(name = "NMTOKEN")
    public String padding;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "topBorder")
    public String topBorder;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "topBorderColor")
    public String topBorderColor;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "topPadding")
    @BindAdapter(adapter=CollapsedStringAdapter.class)
    // // @XmlSchemaType(name = "NMTOKEN")
    public String topPadding;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "leftBorder")
    public String leftBorder;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "leftBorderColor")
    public String leftBorderColor;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "leftPadding")
    @BindAdapter(adapter=CollapsedStringAdapter.class)
    // // @XmlSchemaType(name = "NMTOKEN")
    public String leftPadding;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "bottomBorder")
    public String bottomBorder;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "bottomBorderColor")
    public String bottomBorderColor;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "bottomPadding")
    @BindAdapter(adapter=CollapsedStringAdapter.class)
    // // @XmlSchemaType(name = "NMTOKEN")
    public String bottomPadding;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "rightBorder")
    public String rightBorder;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "rightBorderColor")
    public String rightBorderColor;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "rightPadding")
    @BindAdapter(adapter=CollapsedStringAdapter.class)
    // // @XmlSchemaType(name = "NMTOKEN")
    public String rightPadding;

    /**
     * Gets the value of the pen property.
     *
     * @return possible object is
     * {@link Pen }
     */
    public Pen getPen() {
        return pen;
    }

    /**
     * Sets the value of the pen property.
     *
     * @param value allowed object is
     *              {@link Pen }
     */
    public void setPen(Pen value) {
        this.pen = value;
    }

    /**
     * Gets the value of the topPen property.
     *
     * @return possible object is
     * {@link TopPen }
     */
    public TopPen getTopPen() {
        return topPen;
    }

    /**
     * Sets the value of the topPen property.
     *
     * @param value allowed object is
     *              {@link TopPen }
     */
    public void setTopPen(TopPen value) {
        this.topPen = value;
    }

    /**
     * Gets the value of the leftPen property.
     *
     * @return possible object is
     * {@link LeftPen }
     */
    public LeftPen getLeftPen() {
        return leftPen;
    }

    /**
     * Sets the value of the leftPen property.
     *
     * @param value allowed object is
     *              {@link LeftPen }
     */
    public void setLeftPen(LeftPen value) {
        this.leftPen = value;
    }

    /**
     * Gets the value of the bottomPen property.
     *
     * @return possible object is
     * {@link BottomPen }
     */
    public BottomPen getBottomPen() {
        return bottomPen;
    }

    /**
     * Sets the value of the bottomPen property.
     *
     * @param value allowed object is
     *              {@link BottomPen }
     */
    public void setBottomPen(BottomPen value) {
        this.bottomPen = value;
    }

    /**
     * Gets the value of the rightPen property.
     *
     * @return possible object is
     * {@link RightPen }
     */
    public RightPen getRightPen() {
        return rightPen;
    }

    /**
     * Sets the value of the rightPen property.
     *
     * @param value allowed object is
     *              {@link RightPen }
     */
    public void setRightPen(RightPen value) {
        this.rightPen = value;
    }

    /**
     * Gets the value of the border property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBorder(String value) {
        this.border = value;
    }

    /**
     * Gets the value of the borderColor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * Sets the value of the borderColor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBorderColor(String value) {
        this.borderColor = value;
    }

    /**
     * Gets the value of the padding property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPadding() {
        return padding;
    }

    /**
     * Sets the value of the padding property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPadding(String value) {
        this.padding = value;
    }

    /**
     * Gets the value of the topBorder property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTopBorder() {
        return topBorder;
    }

    /**
     * Sets the value of the topBorder property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTopBorder(String value) {
        this.topBorder = value;
    }

    /**
     * Gets the value of the topBorderColor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTopBorderColor() {
        return topBorderColor;
    }

    /**
     * Sets the value of the topBorderColor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTopBorderColor(String value) {
        this.topBorderColor = value;
    }

    /**
     * Gets the value of the topPadding property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTopPadding() {
        return topPadding;
    }

    /**
     * Sets the value of the topPadding property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTopPadding(String value) {
        this.topPadding = value;
    }

    /**
     * Gets the value of the leftBorder property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLeftBorder() {
        return leftBorder;
    }

    /**
     * Sets the value of the leftBorder property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLeftBorder(String value) {
        this.leftBorder = value;
    }

    /**
     * Gets the value of the leftBorderColor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLeftBorderColor() {
        return leftBorderColor;
    }

    /**
     * Sets the value of the leftBorderColor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLeftBorderColor(String value) {
        this.leftBorderColor = value;
    }

    /**
     * Gets the value of the leftPadding property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLeftPadding() {
        return leftPadding;
    }

    /**
     * Sets the value of the leftPadding property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLeftPadding(String value) {
        this.leftPadding = value;
    }

    /**
     * Gets the value of the bottomBorder property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBottomBorder() {
        return bottomBorder;
    }

    /**
     * Sets the value of the bottomBorder property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBottomBorder(String value) {
        this.bottomBorder = value;
    }

    /**
     * Gets the value of the bottomBorderColor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBottomBorderColor() {
        return bottomBorderColor;
    }

    /**
     * Sets the value of the bottomBorderColor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBottomBorderColor(String value) {
        this.bottomBorderColor = value;
    }

    /**
     * Gets the value of the bottomPadding property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBottomPadding() {
        return bottomPadding;
    }

    /**
     * Sets the value of the bottomPadding property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBottomPadding(String value) {
        this.bottomPadding = value;
    }

    /**
     * Gets the value of the rightBorder property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRightBorder() {
        return rightBorder;
    }

    /**
     * Sets the value of the rightBorder property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRightBorder(String value) {
        this.rightBorder = value;
    }

    /**
     * Gets the value of the rightBorderColor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRightBorderColor() {
        return rightBorderColor;
    }

    /**
     * Sets the value of the rightBorderColor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRightBorderColor(String value) {
        this.rightBorderColor = value;
    }

    /**
     * Gets the value of the rightPadding property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRightPadding() {
        return rightPadding;
    }

    /**
     * Sets the value of the rightPadding property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRightPadding(String value) {
        this.rightPadding = value;
    }

}
