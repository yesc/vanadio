//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package jasper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}seriesExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}startDateExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}endDateExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}labelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}itemHyperlink" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seriesExpression",
    "startDateExpression",
    "endDateExpression",
    "valueExpression",
    "labelExpression",
    "itemHyperlink"
})
@XmlRootElement(name = "timePeriodSeries", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class TimePeriodSeries {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected SeriesExpression seriesExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected StartDateExpression startDateExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected EndDateExpression endDateExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ValueExpression valueExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected LabelExpression labelExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ItemHyperlink itemHyperlink;

    /**
     * Gets the value of the seriesExpression property.
     * 
     * @return
     *     possible object is
     *     {@link SeriesExpression }
     *     
     */
    public SeriesExpression getSeriesExpression() {
        return seriesExpression;
    }

    /**
     * Sets the value of the seriesExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesExpression }
     *     
     */
    public void setSeriesExpression(SeriesExpression value) {
        this.seriesExpression = value;
    }

    /**
     * Gets the value of the startDateExpression property.
     * 
     * @return
     *     possible object is
     *     {@link StartDateExpression }
     *     
     */
    public StartDateExpression getStartDateExpression() {
        return startDateExpression;
    }

    /**
     * Sets the value of the startDateExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDateExpression }
     *     
     */
    public void setStartDateExpression(StartDateExpression value) {
        this.startDateExpression = value;
    }

    /**
     * Gets the value of the endDateExpression property.
     * 
     * @return
     *     possible object is
     *     {@link EndDateExpression }
     *     
     */
    public EndDateExpression getEndDateExpression() {
        return endDateExpression;
    }

    /**
     * Sets the value of the endDateExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDateExpression }
     *     
     */
    public void setEndDateExpression(EndDateExpression value) {
        this.endDateExpression = value;
    }

    /**
     * Gets the value of the valueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ValueExpression }
     *     
     */
    public ValueExpression getValueExpression() {
        return valueExpression;
    }

    /**
     * Sets the value of the valueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueExpression }
     *     
     */
    public void setValueExpression(ValueExpression value) {
        this.valueExpression = value;
    }

    /**
     * Gets the value of the labelExpression property.
     * 
     * @return
     *     possible object is
     *     {@link LabelExpression }
     *     
     */
    public LabelExpression getLabelExpression() {
        return labelExpression;
    }

    /**
     * Sets the value of the labelExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelExpression }
     *     
     */
    public void setLabelExpression(LabelExpression value) {
        this.labelExpression = value;
    }

    /**
     * Gets the value of the itemHyperlink property.
     * 
     * @return
     *     possible object is
     *     {@link ItemHyperlink }
     *     
     */
    public ItemHyperlink getItemHyperlink() {
        return itemHyperlink;
    }

    /**
     * Sets the value of the itemHyperlink property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemHyperlink }
     *     
     */
    public void setItemHyperlink(ItemHyperlink value) {
        this.itemHyperlink = value;
    }

}
