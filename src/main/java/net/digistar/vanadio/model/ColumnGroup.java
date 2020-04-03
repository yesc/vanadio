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
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bucket"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstabHeader" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstabColumnHeader" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstabTotalColumnHeader" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="totalPosition" default="None"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Start"/&gt;
 *             &lt;enumeration value="End"/&gt;
 *             &lt;enumeration value="None"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="headerPosition" default="Left"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Left"/&gt;
 *             &lt;enumeration value="Center"/&gt;
 *             &lt;enumeration value="Right"/&gt;
 *             &lt;enumeration value="Stretch"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="mergeHeaderCells" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "bucket",
        "crosstabHeader",
        "crosstabColumnHeader",
        "crosstabTotalColumnHeader"
})
@XmlRootElement(name = "columnGroup", namespace = "http://jasperreports.sourceforge.net/jasperreports")
//@BindType
public class ColumnGroup {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Bucket bucket;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected CrosstabHeader crosstabHeader;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected CrosstabColumnHeader crosstabColumnHeader;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected CrosstabTotalColumnHeader crosstabTotalColumnHeader;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "height", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String height;
    @XmlAttribute(name = "totalPosition")
    protected String totalPosition;
    @XmlAttribute(name = "headerPosition")
    protected String headerPosition;
    @XmlAttribute(name = "mergeHeaderCells")
    protected Boolean mergeHeaderCells;

    /**
     * Gets the value of the bucket property.
     *
     * @return possible object is
     * {@link Bucket }
     */
    public Bucket getBucket() {
        return bucket;
    }

    /**
     * Sets the value of the bucket property.
     *
     * @param value allowed object is
     *              {@link Bucket }
     */
    public void setBucket(Bucket value) {
        this.bucket = value;
    }

    /**
     * Gets the value of the crosstabHeader property.
     *
     * @return possible object is
     * {@link CrosstabHeader }
     */
    public CrosstabHeader getCrosstabHeader() {
        return crosstabHeader;
    }

    /**
     * Sets the value of the crosstabHeader property.
     *
     * @param value allowed object is
     *              {@link CrosstabHeader }
     */
    public void setCrosstabHeader(CrosstabHeader value) {
        this.crosstabHeader = value;
    }

    /**
     * Gets the value of the crosstabColumnHeader property.
     *
     * @return possible object is
     * {@link CrosstabColumnHeader }
     */
    public CrosstabColumnHeader getCrosstabColumnHeader() {
        return crosstabColumnHeader;
    }

    /**
     * Sets the value of the crosstabColumnHeader property.
     *
     * @param value allowed object is
     *              {@link CrosstabColumnHeader }
     */
    public void setCrosstabColumnHeader(CrosstabColumnHeader value) {
        this.crosstabColumnHeader = value;
    }

    /**
     * Gets the value of the crosstabTotalColumnHeader property.
     *
     * @return possible object is
     * {@link CrosstabTotalColumnHeader }
     */
    public CrosstabTotalColumnHeader getCrosstabTotalColumnHeader() {
        return crosstabTotalColumnHeader;
    }

    /**
     * Sets the value of the crosstabTotalColumnHeader property.
     *
     * @param value allowed object is
     *              {@link CrosstabTotalColumnHeader }
     */
    public void setCrosstabTotalColumnHeader(CrosstabTotalColumnHeader value) {
        this.crosstabTotalColumnHeader = value;
    }

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
     * Gets the value of the height property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the totalPosition property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTotalPosition() {
        if (totalPosition == null) {
            return "None";
        } else {
            return totalPosition;
        }
    }

    /**
     * Sets the value of the totalPosition property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTotalPosition(String value) {
        this.totalPosition = value;
    }

    /**
     * Gets the value of the headerPosition property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHeaderPosition() {
        if (headerPosition == null) {
            return "Left";
        } else {
            return headerPosition;
        }
    }

    /**
     * Sets the value of the headerPosition property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHeaderPosition(String value) {
        this.headerPosition = value;
    }

    /**
     * Gets the value of the mergeHeaderCells property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMergeHeaderCells() {
        return mergeHeaderCells;
    }

    /**
     * Sets the value of the mergeHeaderCells property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMergeHeaderCells(Boolean value) {
        this.mergeHeaderCells = value;
    }

}
