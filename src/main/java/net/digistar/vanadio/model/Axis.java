//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}barChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bar3DChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyBarChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedBarChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedBar3DChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}lineChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyLineChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}areaChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyAreaChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}scatterChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bubbleChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timeSeriesChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highLowChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}candlestickChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedAreaChart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ganttChart"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="position"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="leftOrTop"/&gt;
 *             &lt;enumeration value="rightOrBottom"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "barChart",
        "bar3DChart",
        "xyBarChart",
        "stackedBarChart",
        "stackedBar3DChart",
        "lineChart",
        "xyLineChart",
        "areaChart",
        "xyAreaChart",
        "scatterChart",
        "bubbleChart",
        "timeSeriesChart",
        "highLowChart",
        "candlestickChart",
        "stackedAreaChart",
        "ganttChart"
})
@XmlRootElement(name = "axis", namespace = "http://jasperreports.sourceforge.net/jasperreports")
//@BindType
public class Axis {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected BarChart barChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Bar3DChart bar3DChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected XyBarChart xyBarChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected StackedBarChart stackedBarChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected StackedBar3DChart stackedBar3DChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected LineChart lineChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected XyLineChart xyLineChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected AreaChart areaChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected XyAreaChart xyAreaChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ScatterChart scatterChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected BubbleChart bubbleChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected TimeSeriesChart timeSeriesChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected HighLowChart highLowChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected CandlestickChart candlestickChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected StackedAreaChart stackedAreaChart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected GanttChart ganttChart;
    @XmlAttribute(name = "position")
    protected String position;

    /**
     * Gets the value of the barChart property.
     *
     * @return possible object is
     * {@link BarChart }
     */
    public BarChart getBarChart() {
        return barChart;
    }

    /**
     * Sets the value of the barChart property.
     *
     * @param value allowed object is
     *              {@link BarChart }
     */
    public void setBarChart(BarChart value) {
        this.barChart = value;
    }

    /**
     * Gets the value of the bar3DChart property.
     *
     * @return possible object is
     * {@link Bar3DChart }
     */
    public Bar3DChart getBar3DChart() {
        return bar3DChart;
    }

    /**
     * Sets the value of the bar3DChart property.
     *
     * @param value allowed object is
     *              {@link Bar3DChart }
     */
    public void setBar3DChart(Bar3DChart value) {
        this.bar3DChart = value;
    }

    /**
     * Gets the value of the xyBarChart property.
     *
     * @return possible object is
     * {@link XyBarChart }
     */
    public XyBarChart getXyBarChart() {
        return xyBarChart;
    }

    /**
     * Sets the value of the xyBarChart property.
     *
     * @param value allowed object is
     *              {@link XyBarChart }
     */
    public void setXyBarChart(XyBarChart value) {
        this.xyBarChart = value;
    }

    /**
     * Gets the value of the stackedBarChart property.
     *
     * @return possible object is
     * {@link StackedBarChart }
     */
    public StackedBarChart getStackedBarChart() {
        return stackedBarChart;
    }

    /**
     * Sets the value of the stackedBarChart property.
     *
     * @param value allowed object is
     *              {@link StackedBarChart }
     */
    public void setStackedBarChart(StackedBarChart value) {
        this.stackedBarChart = value;
    }

    /**
     * Gets the value of the stackedBar3DChart property.
     *
     * @return possible object is
     * {@link StackedBar3DChart }
     */
    public StackedBar3DChart getStackedBar3DChart() {
        return stackedBar3DChart;
    }

    /**
     * Sets the value of the stackedBar3DChart property.
     *
     * @param value allowed object is
     *              {@link StackedBar3DChart }
     */
    public void setStackedBar3DChart(StackedBar3DChart value) {
        this.stackedBar3DChart = value;
    }

    /**
     * Gets the value of the lineChart property.
     *
     * @return possible object is
     * {@link LineChart }
     */
    public LineChart getLineChart() {
        return lineChart;
    }

    /**
     * Sets the value of the lineChart property.
     *
     * @param value allowed object is
     *              {@link LineChart }
     */
    public void setLineChart(LineChart value) {
        this.lineChart = value;
    }

    /**
     * Gets the value of the xyLineChart property.
     *
     * @return possible object is
     * {@link XyLineChart }
     */
    public XyLineChart getXyLineChart() {
        return xyLineChart;
    }

    /**
     * Sets the value of the xyLineChart property.
     *
     * @param value allowed object is
     *              {@link XyLineChart }
     */
    public void setXyLineChart(XyLineChart value) {
        this.xyLineChart = value;
    }

    /**
     * Gets the value of the areaChart property.
     *
     * @return possible object is
     * {@link AreaChart }
     */
    public AreaChart getAreaChart() {
        return areaChart;
    }

    /**
     * Sets the value of the areaChart property.
     *
     * @param value allowed object is
     *              {@link AreaChart }
     */
    public void setAreaChart(AreaChart value) {
        this.areaChart = value;
    }

    /**
     * Gets the value of the xyAreaChart property.
     *
     * @return possible object is
     * {@link XyAreaChart }
     */
    public XyAreaChart getXyAreaChart() {
        return xyAreaChart;
    }

    /**
     * Sets the value of the xyAreaChart property.
     *
     * @param value allowed object is
     *              {@link XyAreaChart }
     */
    public void setXyAreaChart(XyAreaChart value) {
        this.xyAreaChart = value;
    }

    /**
     * Gets the value of the scatterChart property.
     *
     * @return possible object is
     * {@link ScatterChart }
     */
    public ScatterChart getScatterChart() {
        return scatterChart;
    }

    /**
     * Sets the value of the scatterChart property.
     *
     * @param value allowed object is
     *              {@link ScatterChart }
     */
    public void setScatterChart(ScatterChart value) {
        this.scatterChart = value;
    }

    /**
     * Gets the value of the bubbleChart property.
     *
     * @return possible object is
     * {@link BubbleChart }
     */
    public BubbleChart getBubbleChart() {
        return bubbleChart;
    }

    /**
     * Sets the value of the bubbleChart property.
     *
     * @param value allowed object is
     *              {@link BubbleChart }
     */
    public void setBubbleChart(BubbleChart value) {
        this.bubbleChart = value;
    }

    /**
     * Gets the value of the timeSeriesChart property.
     *
     * @return possible object is
     * {@link TimeSeriesChart }
     */
    public TimeSeriesChart getTimeSeriesChart() {
        return timeSeriesChart;
    }

    /**
     * Sets the value of the timeSeriesChart property.
     *
     * @param value allowed object is
     *              {@link TimeSeriesChart }
     */
    public void setTimeSeriesChart(TimeSeriesChart value) {
        this.timeSeriesChart = value;
    }

    /**
     * Gets the value of the highLowChart property.
     *
     * @return possible object is
     * {@link HighLowChart }
     */
    public HighLowChart getHighLowChart() {
        return highLowChart;
    }

    /**
     * Sets the value of the highLowChart property.
     *
     * @param value allowed object is
     *              {@link HighLowChart }
     */
    public void setHighLowChart(HighLowChart value) {
        this.highLowChart = value;
    }

    /**
     * Gets the value of the candlestickChart property.
     *
     * @return possible object is
     * {@link CandlestickChart }
     */
    public CandlestickChart getCandlestickChart() {
        return candlestickChart;
    }

    /**
     * Sets the value of the candlestickChart property.
     *
     * @param value allowed object is
     *              {@link CandlestickChart }
     */
    public void setCandlestickChart(CandlestickChart value) {
        this.candlestickChart = value;
    }

    /**
     * Gets the value of the stackedAreaChart property.
     *
     * @return possible object is
     * {@link StackedAreaChart }
     */
    public StackedAreaChart getStackedAreaChart() {
        return stackedAreaChart;
    }

    /**
     * Sets the value of the stackedAreaChart property.
     *
     * @param value allowed object is
     *              {@link StackedAreaChart }
     */
    public void setStackedAreaChart(StackedAreaChart value) {
        this.stackedAreaChart = value;
    }

    /**
     * Gets the value of the ganttChart property.
     *
     * @return possible object is
     * {@link GanttChart }
     */
    public GanttChart getGanttChart() {
        return ganttChart;
    }

    /**
     * Sets the value of the ganttChart property.
     *
     * @param value allowed object is
     *              {@link GanttChart }
     */
    public void setGanttChart(GanttChart value) {
        this.ganttChart = value;
    }

    /**
     * Gets the value of the position property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPosition(String value) {
        this.position = value;
    }

}
