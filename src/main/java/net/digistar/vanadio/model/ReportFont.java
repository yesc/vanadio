//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isDefault" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="fontName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="isBold"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isItalic"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isUnderline"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isStrikeThrough"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="pdfFontName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="pdfEncoding" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isPdfEmbedded"&gt;
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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "reportFont", namespace = "http://jasperreports.sourceforge.net/jasperreports")
//@BindType
public class ReportFont {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "isDefault")
    protected String isDefault;
    @XmlAttribute(name = "fontName")
    protected String fontName;
    @XmlAttribute(name = "size")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String size;
    @XmlAttribute(name = "isBold")
    protected String isBold;
    @XmlAttribute(name = "isItalic")
    protected String isItalic;
    @XmlAttribute(name = "isUnderline")
    protected String isUnderline;
    @XmlAttribute(name = "isStrikeThrough")
    protected String isStrikeThrough;
    @XmlAttribute(name = "pdfFontName")
    protected String pdfFontName;
    @XmlAttribute(name = "pdfEncoding")
    protected String pdfEncoding;
    @XmlAttribute(name = "isPdfEmbedded")
    protected String isPdfEmbedded;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the isDefault property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsDefault() {
        if (isDefault == null) {
            return "false";
        } else {
            return isDefault;
        }
    }

    /**
     * Sets the value of the isDefault property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsDefault(String value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the fontName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFontName() {
        return fontName;
    }

    /**
     * Sets the value of the fontName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFontName(String value) {
        this.fontName = value;
    }

    /**
     * Gets the value of the size property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the isBold property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsBold() {
        return isBold;
    }

    /**
     * Sets the value of the isBold property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsBold(String value) {
        this.isBold = value;
    }

    /**
     * Gets the value of the isItalic property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsItalic() {
        return isItalic;
    }

    /**
     * Sets the value of the isItalic property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsItalic(String value) {
        this.isItalic = value;
    }

    /**
     * Gets the value of the isUnderline property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsUnderline() {
        return isUnderline;
    }

    /**
     * Sets the value of the isUnderline property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsUnderline(String value) {
        this.isUnderline = value;
    }

    /**
     * Gets the value of the isStrikeThrough property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsStrikeThrough() {
        return isStrikeThrough;
    }

    /**
     * Sets the value of the isStrikeThrough property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsStrikeThrough(String value) {
        this.isStrikeThrough = value;
    }

    /**
     * Gets the value of the pdfFontName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPdfFontName() {
        return pdfFontName;
    }

    /**
     * Sets the value of the pdfFontName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPdfFontName(String value) {
        this.pdfFontName = value;
    }

    /**
     * Gets the value of the pdfEncoding property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPdfEncoding() {
        return pdfEncoding;
    }

    /**
     * Sets the value of the pdfEncoding property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPdfEncoding(String value) {
        this.pdfEncoding = value;
    }

    /**
     * Gets the value of the isPdfEmbedded property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsPdfEmbedded() {
        return isPdfEmbedded;
    }

    /**
     * Sets the value of the isPdfEmbedded property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsPdfEmbedded(String value) {
        this.isPdfEmbedded = value;
    }

}
