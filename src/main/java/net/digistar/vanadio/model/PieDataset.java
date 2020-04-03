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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataset" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pieSeries" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}keyExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}labelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}sectionHyperlink" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}otherKeyExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}otherLabelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}otherSectionHyperlink" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="minPercentage" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="maxCount" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "dataset",
        "pieSeries",
        "keyExpression",
        "valueExpression",
        "labelExpression",
        "sectionHyperlink",
        "otherKeyExpression",
        "otherLabelExpression",
        "otherSectionHyperlink"
})
@XmlRootElement(name = "pieDataset", namespace = "http://jasperreports.sourceforge.net/jasperreports")
//@BindType
public class PieDataset {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Dataset dataset;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<PieSeries> pieSeries;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected KeyExpression keyExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ValueExpression valueExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected LabelExpression labelExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected SectionHyperlink sectionHyperlink;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected OtherKeyExpression otherKeyExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected OtherLabelExpression otherLabelExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected OtherSectionHyperlink otherSectionHyperlink;
    @XmlAttribute(name = "minPercentage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String minPercentage;
    @XmlAttribute(name = "maxCount")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String maxCount;

    /**
     * Gets the value of the dataset property.
     *
     * @return possible object is
     * {@link Dataset }
     */
    public Dataset getDataset() {
        return dataset;
    }

    /**
     * Sets the value of the dataset property.
     *
     * @param value allowed object is
     *              {@link Dataset }
     */
    public void setDataset(Dataset value) {
        this.dataset = value;
    }

    /**
     * Gets the value of the pieSeries property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieSeries property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPieSeries().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PieSeries }
     */
    public List<PieSeries> getPieSeries() {
        if (pieSeries == null) {
            pieSeries = new ArrayList<PieSeries>();
        }
        return this.pieSeries;
    }

    /**
     * Gets the value of the keyExpression property.
     *
     * @return possible object is
     * {@link KeyExpression }
     */
    public KeyExpression getKeyExpression() {
        return keyExpression;
    }

    /**
     * Sets the value of the keyExpression property.
     *
     * @param value allowed object is
     *              {@link KeyExpression }
     */
    public void setKeyExpression(KeyExpression value) {
        this.keyExpression = value;
    }

    /**
     * Gets the value of the valueExpression property.
     *
     * @return possible object is
     * {@link ValueExpression }
     */
    public ValueExpression getValueExpression() {
        return valueExpression;
    }

    /**
     * Sets the value of the valueExpression property.
     *
     * @param value allowed object is
     *              {@link ValueExpression }
     */
    public void setValueExpression(ValueExpression value) {
        this.valueExpression = value;
    }

    /**
     * Gets the value of the labelExpression property.
     *
     * @return possible object is
     * {@link LabelExpression }
     */
    public LabelExpression getLabelExpression() {
        return labelExpression;
    }

    /**
     * Sets the value of the labelExpression property.
     *
     * @param value allowed object is
     *              {@link LabelExpression }
     */
    public void setLabelExpression(LabelExpression value) {
        this.labelExpression = value;
    }

    /**
     * Gets the value of the sectionHyperlink property.
     *
     * @return possible object is
     * {@link SectionHyperlink }
     */
    public SectionHyperlink getSectionHyperlink() {
        return sectionHyperlink;
    }

    /**
     * Sets the value of the sectionHyperlink property.
     *
     * @param value allowed object is
     *              {@link SectionHyperlink }
     */
    public void setSectionHyperlink(SectionHyperlink value) {
        this.sectionHyperlink = value;
    }

    /**
     * Gets the value of the otherKeyExpression property.
     *
     * @return possible object is
     * {@link OtherKeyExpression }
     */
    public OtherKeyExpression getOtherKeyExpression() {
        return otherKeyExpression;
    }

    /**
     * Sets the value of the otherKeyExpression property.
     *
     * @param value allowed object is
     *              {@link OtherKeyExpression }
     */
    public void setOtherKeyExpression(OtherKeyExpression value) {
        this.otherKeyExpression = value;
    }

    /**
     * Gets the value of the otherLabelExpression property.
     *
     * @return possible object is
     * {@link OtherLabelExpression }
     */
    public OtherLabelExpression getOtherLabelExpression() {
        return otherLabelExpression;
    }

    /**
     * Sets the value of the otherLabelExpression property.
     *
     * @param value allowed object is
     *              {@link OtherLabelExpression }
     */
    public void setOtherLabelExpression(OtherLabelExpression value) {
        this.otherLabelExpression = value;
    }

    /**
     * Gets the value of the otherSectionHyperlink property.
     *
     * @return possible object is
     * {@link OtherSectionHyperlink }
     */
    public OtherSectionHyperlink getOtherSectionHyperlink() {
        return otherSectionHyperlink;
    }

    /**
     * Sets the value of the otherSectionHyperlink property.
     *
     * @param value allowed object is
     *              {@link OtherSectionHyperlink }
     */
    public void setOtherSectionHyperlink(OtherSectionHyperlink value) {
        this.otherSectionHyperlink = value;
    }

    /**
     * Gets the value of the minPercentage property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMinPercentage() {
        return minPercentage;
    }

    /**
     * Sets the value of the minPercentage property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMinPercentage(String value) {
        this.minPercentage = value;
    }

    /**
     * Gets the value of the maxCount property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaxCount() {
        return maxCount;
    }

    /**
     * Sets the value of the maxCount property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaxCount(String value) {
        this.maxCount = value;
    }

}
