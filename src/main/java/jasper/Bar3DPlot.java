//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package jasper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}plot"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}itemLabel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}categoryAxisLabelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}categoryAxisFormat" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueAxisLabelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueAxisFormat" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMinValueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMaxValueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMinValueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMaxValueExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isShowLabels"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="xOffset" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="yOffset" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "plot",
    "itemLabel",
    "categoryAxisLabelExpression",
    "categoryAxisFormat",
    "valueAxisLabelExpression",
    "valueAxisFormat",
    "domainAxisMinValueExpression",
    "domainAxisMaxValueExpression",
    "rangeAxisMinValueExpression",
    "rangeAxisMaxValueExpression"
})
@XmlRootElement(name = "bar3DPlot", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class Bar3DPlot {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Plot plot;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ItemLabel itemLabel;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected CategoryAxisLabelExpression categoryAxisLabelExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected CategoryAxisFormat categoryAxisFormat;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ValueAxisLabelExpression valueAxisLabelExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ValueAxisFormat valueAxisFormat;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected DomainAxisMinValueExpression domainAxisMinValueExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected DomainAxisMaxValueExpression domainAxisMaxValueExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected RangeAxisMinValueExpression rangeAxisMinValueExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected RangeAxisMaxValueExpression rangeAxisMaxValueExpression;
    @XmlAttribute(name = "isShowLabels")
    protected String isShowLabels;
    @XmlAttribute(name = "xOffset")
    protected String xOffset;
    @XmlAttribute(name = "yOffset")
    protected String yOffset;

    /**
     * Gets the value of the plot property.
     * 
     * @return
     *     possible object is
     *     {@link Plot }
     *     
     */
    public Plot getPlot() {
        return plot;
    }

    /**
     * Sets the value of the plot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Plot }
     *     
     */
    public void setPlot(Plot value) {
        this.plot = value;
    }

    /**
     * Gets the value of the itemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link ItemLabel }
     *     
     */
    public ItemLabel getItemLabel() {
        return itemLabel;
    }

    /**
     * Sets the value of the itemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLabel }
     *     
     */
    public void setItemLabel(ItemLabel value) {
        this.itemLabel = value;
    }

    /**
     * Gets the value of the categoryAxisLabelExpression property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryAxisLabelExpression }
     *     
     */
    public CategoryAxisLabelExpression getCategoryAxisLabelExpression() {
        return categoryAxisLabelExpression;
    }

    /**
     * Sets the value of the categoryAxisLabelExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryAxisLabelExpression }
     *     
     */
    public void setCategoryAxisLabelExpression(CategoryAxisLabelExpression value) {
        this.categoryAxisLabelExpression = value;
    }

    /**
     * Gets the value of the categoryAxisFormat property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryAxisFormat }
     *     
     */
    public CategoryAxisFormat getCategoryAxisFormat() {
        return categoryAxisFormat;
    }

    /**
     * Sets the value of the categoryAxisFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryAxisFormat }
     *     
     */
    public void setCategoryAxisFormat(CategoryAxisFormat value) {
        this.categoryAxisFormat = value;
    }

    /**
     * Gets the value of the valueAxisLabelExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ValueAxisLabelExpression }
     *     
     */
    public ValueAxisLabelExpression getValueAxisLabelExpression() {
        return valueAxisLabelExpression;
    }

    /**
     * Sets the value of the valueAxisLabelExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAxisLabelExpression }
     *     
     */
    public void setValueAxisLabelExpression(ValueAxisLabelExpression value) {
        this.valueAxisLabelExpression = value;
    }

    /**
     * Gets the value of the valueAxisFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ValueAxisFormat }
     *     
     */
    public ValueAxisFormat getValueAxisFormat() {
        return valueAxisFormat;
    }

    /**
     * Sets the value of the valueAxisFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAxisFormat }
     *     
     */
    public void setValueAxisFormat(ValueAxisFormat value) {
        this.valueAxisFormat = value;
    }

    /**
     * Gets the value of the domainAxisMinValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link DomainAxisMinValueExpression }
     *     
     */
    public DomainAxisMinValueExpression getDomainAxisMinValueExpression() {
        return domainAxisMinValueExpression;
    }

    /**
     * Sets the value of the domainAxisMinValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainAxisMinValueExpression }
     *     
     */
    public void setDomainAxisMinValueExpression(DomainAxisMinValueExpression value) {
        this.domainAxisMinValueExpression = value;
    }

    /**
     * Gets the value of the domainAxisMaxValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link DomainAxisMaxValueExpression }
     *     
     */
    public DomainAxisMaxValueExpression getDomainAxisMaxValueExpression() {
        return domainAxisMaxValueExpression;
    }

    /**
     * Sets the value of the domainAxisMaxValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainAxisMaxValueExpression }
     *     
     */
    public void setDomainAxisMaxValueExpression(DomainAxisMaxValueExpression value) {
        this.domainAxisMaxValueExpression = value;
    }

    /**
     * Gets the value of the rangeAxisMinValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link RangeAxisMinValueExpression }
     *     
     */
    public RangeAxisMinValueExpression getRangeAxisMinValueExpression() {
        return rangeAxisMinValueExpression;
    }

    /**
     * Sets the value of the rangeAxisMinValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeAxisMinValueExpression }
     *     
     */
    public void setRangeAxisMinValueExpression(RangeAxisMinValueExpression value) {
        this.rangeAxisMinValueExpression = value;
    }

    /**
     * Gets the value of the rangeAxisMaxValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link RangeAxisMaxValueExpression }
     *     
     */
    public RangeAxisMaxValueExpression getRangeAxisMaxValueExpression() {
        return rangeAxisMaxValueExpression;
    }

    /**
     * Sets the value of the rangeAxisMaxValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeAxisMaxValueExpression }
     *     
     */
    public void setRangeAxisMaxValueExpression(RangeAxisMaxValueExpression value) {
        this.rangeAxisMaxValueExpression = value;
    }

    /**
     * Gets the value of the isShowLabels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowLabels() {
        return isShowLabels;
    }

    /**
     * Sets the value of the isShowLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowLabels(String value) {
        this.isShowLabels = value;
    }

    /**
     * Gets the value of the xOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXOffset() {
        return xOffset;
    }

    /**
     * Sets the value of the xOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXOffset(String value) {
        this.xOffset = value;
    }

    /**
     * Gets the value of the yOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYOffset() {
        return yOffset;
    }

    /**
     * Sets the value of the yOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYOffset(String value) {
        this.yOffset = value;
    }

}
