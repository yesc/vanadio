//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.04.02 alle 10:15:55 PM CEST 
//


package net.digistar.vanadio.core.jasper;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java per anonymous complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}property" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}printWhenExpression" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}break"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}line"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rectangle"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ellipse"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}image"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}staticText"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}textField"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subreport"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pieChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pie3DChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}barChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bar3DChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyBarChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedBarChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedBar3DChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}lineChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyLineChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}areaChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyAreaChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}scatterChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bubbleChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timeSeriesChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highLowChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}candlestickChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}meterChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}thermometerChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}multiAxisChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedAreaChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ganttChart"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}elementGroup"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstab"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}frame"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}componentElement"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}genericElement"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="returnValue" type="{http://jasperreports.sourceforge.net/jasperreports}expressionReturnValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" /&gt;
 *       &lt;attribute name="isSplitAllowed"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="splitType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Stretch"/&gt;
 *             &lt;enumeration value="Prevent"/&gt;
 *             &lt;enumeration value="Immediate"/&gt;
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
        "property",
        "printWhenExpression",
        "breakOrLineOrRectangle",
        "returnValue"
})
@XmlRootElement(name = "band", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class Band {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<Property> property;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected PrintWhenExpression printWhenExpression;
    @XmlElements({
            @XmlElement(name = "break", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Break.class),
            @XmlElement(name = "line", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Line.class),
            @XmlElement(name = "rectangle", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Rectangle.class),
            @XmlElement(name = "ellipse", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Ellipse.class),
            @XmlElement(name = "image", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Image.class),
            @XmlElement(name = "staticText", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = StaticText.class),
            @XmlElement(name = "textField", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = TextField.class),
            @XmlElement(name = "subreport", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Subreport.class),
            @XmlElement(name = "pieChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = PieChart.class),
            @XmlElement(name = "pie3DChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Pie3DChart.class),
            @XmlElement(name = "barChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = BarChart.class),
            @XmlElement(name = "bar3DChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Bar3DChart.class),
            @XmlElement(name = "xyBarChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = XyBarChart.class),
            @XmlElement(name = "stackedBarChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = StackedBarChart.class),
            @XmlElement(name = "stackedBar3DChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = StackedBar3DChart.class),
            @XmlElement(name = "lineChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = LineChart.class),
            @XmlElement(name = "xyLineChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = XyLineChart.class),
            @XmlElement(name = "areaChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = AreaChart.class),
            @XmlElement(name = "xyAreaChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = XyAreaChart.class),
            @XmlElement(name = "scatterChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ScatterChart.class),
            @XmlElement(name = "bubbleChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = BubbleChart.class),
            @XmlElement(name = "timeSeriesChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = TimeSeriesChart.class),
            @XmlElement(name = "highLowChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = HighLowChart.class),
            @XmlElement(name = "candlestickChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = CandlestickChart.class),
            @XmlElement(name = "meterChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = MeterChart.class),
            @XmlElement(name = "thermometerChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ThermometerChart.class),
            @XmlElement(name = "multiAxisChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = MultiAxisChart.class),
            @XmlElement(name = "stackedAreaChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = StackedAreaChart.class),
            @XmlElement(name = "ganttChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = GanttChart.class),
            @XmlElement(name = "elementGroup", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ElementGroup.class),
            @XmlElement(name = "crosstab", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Crosstab.class),
            @XmlElement(name = "frame", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Frame.class),
            @XmlElement(name = "componentElement", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ComponentElement.class),
            @XmlElement(name = "genericElement", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = GenericElement.class)
    })
    protected List<Object> breakOrLineOrRectangle;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<ExpressionReturnValue> returnValue;
    @XmlAttribute(name = "height")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String height;
    @XmlAttribute(name = "isSplitAllowed")
    protected String isSplitAllowed;
    @XmlAttribute(name = "splitType")
    protected String splitType;

    /**
     * Gets the value of the property property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * Recupera il valore della proprietà printWhenExpression.
     *
     * @return possible object is
     * {@link PrintWhenExpression }
     */
    public PrintWhenExpression getPrintWhenExpression() {
        return printWhenExpression;
    }

    /**
     * Imposta il valore della proprietà printWhenExpression.
     *
     * @param value allowed object is
     *              {@link PrintWhenExpression }
     */
    public void setPrintWhenExpression(PrintWhenExpression value) {
        this.printWhenExpression = value;
    }

    /**
     * Gets the value of the breakOrLineOrRectangle property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the breakOrLineOrRectangle property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBreakOrLineOrRectangle().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Break }
     * {@link Line }
     * {@link Rectangle }
     * {@link Ellipse }
     * {@link Image }
     * {@link StaticText }
     * {@link TextField }
     * {@link Subreport }
     * {@link PieChart }
     * {@link Pie3DChart }
     * {@link BarChart }
     * {@link Bar3DChart }
     * {@link XyBarChart }
     * {@link StackedBarChart }
     * {@link StackedBar3DChart }
     * {@link LineChart }
     * {@link XyLineChart }
     * {@link AreaChart }
     * {@link XyAreaChart }
     * {@link ScatterChart }
     * {@link BubbleChart }
     * {@link TimeSeriesChart }
     * {@link HighLowChart }
     * {@link CandlestickChart }
     * {@link MeterChart }
     * {@link ThermometerChart }
     * {@link MultiAxisChart }
     * {@link StackedAreaChart }
     * {@link GanttChart }
     * {@link ElementGroup }
     * {@link Crosstab }
     * {@link Frame }
     * {@link ComponentElement }
     * {@link GenericElement }
     */
    public List<Object> getBreakOrLineOrRectangle() {
        if (breakOrLineOrRectangle == null) {
            breakOrLineOrRectangle = new ArrayList<Object>();
        }
        return this.breakOrLineOrRectangle;
    }

    /**
     * Gets the value of the returnValue property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnValue property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnValue().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpressionReturnValue }
     */
    public List<ExpressionReturnValue> getReturnValue() {
        if (returnValue == null) {
            returnValue = new ArrayList<ExpressionReturnValue>();
        }
        return this.returnValue;
    }

    /**
     * Recupera il valore della proprietà height.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHeight() {
        if (height == null) {
            return "0";
        } else {
            return height;
        }
    }

    /**
     * Imposta il valore della proprietà height.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Recupera il valore della proprietà isSplitAllowed.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsSplitAllowed() {
        return isSplitAllowed;
    }

    /**
     * Imposta il valore della proprietà isSplitAllowed.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsSplitAllowed(String value) {
        this.isSplitAllowed = value;
    }

    /**
     * Recupera il valore della proprietà splitType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSplitType() {
        return splitType;
    }

    /**
     * Imposta il valore della proprietà splitType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSplitType(String value) {
        this.splitType = value;
    }

}
