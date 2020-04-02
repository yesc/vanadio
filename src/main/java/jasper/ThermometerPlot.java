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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueDisplay" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataRange"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}lowRange" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}mediumRange" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highRange" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="valueLocation" default="bulb"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="none"/&gt;
 *             &lt;enumeration value="left"/&gt;
 *             &lt;enumeration value="right"/&gt;
 *             &lt;enumeration value="bulb"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isShowValueLines" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="mercuryColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "valueDisplay",
    "dataRange",
    "lowRange",
    "mediumRange",
    "highRange"
})
@XmlRootElement(name = "thermometerPlot", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class ThermometerPlot {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Plot plot;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ValueDisplay valueDisplay;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected DataRange dataRange;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected LowRange lowRange;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected MediumRange mediumRange;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected HighRange highRange;
    @XmlAttribute(name = "valueLocation")
    protected String valueLocation;
    @XmlAttribute(name = "isShowValueLines")
    protected String isShowValueLines;
    @XmlAttribute(name = "mercuryColor")
    protected String mercuryColor;

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
     * Gets the value of the valueDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link ValueDisplay }
     *     
     */
    public ValueDisplay getValueDisplay() {
        return valueDisplay;
    }

    /**
     * Sets the value of the valueDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueDisplay }
     *     
     */
    public void setValueDisplay(ValueDisplay value) {
        this.valueDisplay = value;
    }

    /**
     * Gets the value of the dataRange property.
     * 
     * @return
     *     possible object is
     *     {@link DataRange }
     *     
     */
    public DataRange getDataRange() {
        return dataRange;
    }

    /**
     * Sets the value of the dataRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRange }
     *     
     */
    public void setDataRange(DataRange value) {
        this.dataRange = value;
    }

    /**
     * Gets the value of the lowRange property.
     * 
     * @return
     *     possible object is
     *     {@link LowRange }
     *     
     */
    public LowRange getLowRange() {
        return lowRange;
    }

    /**
     * Sets the value of the lowRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowRange }
     *     
     */
    public void setLowRange(LowRange value) {
        this.lowRange = value;
    }

    /**
     * Gets the value of the mediumRange property.
     * 
     * @return
     *     possible object is
     *     {@link MediumRange }
     *     
     */
    public MediumRange getMediumRange() {
        return mediumRange;
    }

    /**
     * Sets the value of the mediumRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediumRange }
     *     
     */
    public void setMediumRange(MediumRange value) {
        this.mediumRange = value;
    }

    /**
     * Gets the value of the highRange property.
     * 
     * @return
     *     possible object is
     *     {@link HighRange }
     *     
     */
    public HighRange getHighRange() {
        return highRange;
    }

    /**
     * Sets the value of the highRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighRange }
     *     
     */
    public void setHighRange(HighRange value) {
        this.highRange = value;
    }

    /**
     * Gets the value of the valueLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueLocation() {
        if (valueLocation == null) {
            return "bulb";
        } else {
            return valueLocation;
        }
    }

    /**
     * Sets the value of the valueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueLocation(String value) {
        this.valueLocation = value;
    }

    /**
     * Gets the value of the isShowValueLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowValueLines() {
        if (isShowValueLines == null) {
            return "false";
        } else {
            return isShowValueLines;
        }
    }

    /**
     * Sets the value of the isShowValueLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowValueLines(String value) {
        this.isShowValueLines = value;
    }

    /**
     * Gets the value of the mercuryColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercuryColor() {
        return mercuryColor;
    }

    /**
     * Sets the value of the mercuryColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercuryColor(String value) {
        this.mercuryColor = value;
    }

}
