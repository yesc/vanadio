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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}chart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highLowDataset"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}candlestickPlot"/&gt;
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
    "chart",
    "highLowDataset",
    "candlestickPlot"
})
@XmlRootElement(name = "candlestickChart", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class CandlestickChart {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Chart chart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected HighLowDataset highLowDataset;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected CandlestickPlot candlestickPlot;

    /**
     * Gets the value of the chart property.
     * 
     * @return
     *     possible object is
     *     {@link Chart }
     *     
     */
    public Chart getChart() {
        return chart;
    }

    /**
     * Sets the value of the chart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chart }
     *     
     */
    public void setChart(Chart value) {
        this.chart = value;
    }

    /**
     * Gets the value of the highLowDataset property.
     * 
     * @return
     *     possible object is
     *     {@link HighLowDataset }
     *     
     */
    public HighLowDataset getHighLowDataset() {
        return highLowDataset;
    }

    /**
     * Sets the value of the highLowDataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighLowDataset }
     *     
     */
    public void setHighLowDataset(HighLowDataset value) {
        this.highLowDataset = value;
    }

    /**
     * Gets the value of the candlestickPlot property.
     * 
     * @return
     *     possible object is
     *     {@link CandlestickPlot }
     *     
     */
    public CandlestickPlot getCandlestickPlot() {
        return candlestickPlot;
    }

    /**
     * Sets the value of the candlestickPlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandlestickPlot }
     *     
     */
    public void setCandlestickPlot(CandlestickPlot value) {
        this.candlestickPlot = value;
    }

}
