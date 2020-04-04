//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

import com.abubusoft.kripton.annotation.Bind;
import com.abubusoft.kripton.annotation.BindAdapter;
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.*;
import com.abubusoft.kripton.xml.XmlType;
import net.digistar.vanadio.support.CollapsedStringAdapter;

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
//// @XmlAccessorType(XmlAccessType.FIELD)
//
//// @XmlRootElement(name = "band", namespace = "http://jasperreports.sourceforge.net/jasperreports")
@BindType
public class Band {

  @Bind("break")
  public List<Break> breakList = new ArrayList<>();

  @Bind("line")
  public List<Line> lineList = new ArrayList<>();

//    @XmlElement(name = "rectangle", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Rectangle.class),
//    @XmlElement(name = "ellipse", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Ellipse.class),
//    @XmlElement(name = "image", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Image.class),
//    @XmlElement(name = "staticText", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = StaticText.class),
//    @XmlElement(name = "textField", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = TextField.class),
//    @XmlElement(name = "subreport", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Subreport.class),
//    @XmlElement(name = "pieChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = PieChart.class),
//    @XmlElement(name = "pie3DChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Pie3DChart.class),
//    @XmlElement(name = "barChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = BarChart.class),
//    @XmlElement(name = "bar3DChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Bar3DChart.class),
//    @XmlElement(name = "xyBarChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = XyBarChart.class),
//    @XmlElement(name = "stackedBarChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = StackedBarChart.class),
//    @XmlElement(name = "stackedBar3DChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = StackedBar3DChart.class),
//    @XmlElement(name = "lineChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = LineChart.class),
//    @XmlElement(name = "xyLineChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = XyLineChart.class),
//    @XmlElement(name = "areaChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = AreaChart.class),
//    @XmlElement(name = "xyAreaChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = XyAreaChart.class),
//    @XmlElement(name = "scatterChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ScatterChart.class),
//    @XmlElement(name = "bubbleChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = BubbleChart.class),
//    @XmlElement(name = "timeSeriesChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = TimeSeriesChart.class),
//    @XmlElement(name = "highLowChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = HighLowChart.class),
//    @XmlElement(name = "candlestickChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = CandlestickChart.class),
//    @XmlElement(name = "meterChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = MeterChart.class),
//    @XmlElement(name = "thermometerChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ThermometerChart.class),
//    @XmlElement(name = "multiAxisChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = MultiAxisChart.class),
//    @XmlElement(name = "stackedAreaChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = StackedAreaChart.class),
//    @XmlElement(name = "ganttChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = GanttChart.class),
//    @XmlElement(name = "elementGroup", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ElementGroup.class),
//    @XmlElement(name = "crosstab", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Crosstab.class),
//    @XmlElement(name = "frame", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Frame.class),
//    @XmlElement(name = "componentElement", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ComponentElement.class),
//    @XmlElement(name = "genericElement", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = GenericElement.class)


  //// @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
  public List<Property> property = new ArrayList<>();

  //// @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
  public PrintWhenExpression printWhenExpression;

//  @XmlElements({
//          @XmlElement(name = "break", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Break.class),
//          @XmlElement(name = "line", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Line.class),
//          @XmlElement(name = "rectangle", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Rectangle.class),
//          @XmlElement(name = "ellipse", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Ellipse.class),
//          @XmlElement(name = "image", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Image.class),
//          @XmlElement(name = "staticText", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = StaticText.class),
//          @XmlElement(name = "textField", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = TextField.class),
//          @XmlElement(name = "subreport", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Subreport.class),
//          @XmlElement(name = "pieChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = PieChart.class),
//          @XmlElement(name = "pie3DChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Pie3DChart.class),
//          @XmlElement(name = "barChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = BarChart.class),
//          @XmlElement(name = "bar3DChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Bar3DChart.class),
//          @XmlElement(name = "xyBarChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = XyBarChart.class),
//          @XmlElement(name = "stackedBarChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = StackedBarChart.class),
//          @XmlElement(name = "stackedBar3DChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = StackedBar3DChart.class),
//          @XmlElement(name = "lineChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = LineChart.class),
//          @XmlElement(name = "xyLineChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = XyLineChart.class),
//          @XmlElement(name = "areaChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = AreaChart.class),
//          @XmlElement(name = "xyAreaChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = XyAreaChart.class),
//          @XmlElement(name = "scatterChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ScatterChart.class),
//          @XmlElement(name = "bubbleChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = BubbleChart.class),
//          @XmlElement(name = "timeSeriesChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = TimeSeriesChart.class),
//          @XmlElement(name = "highLowChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = HighLowChart.class),
//          @XmlElement(name = "candlestickChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = CandlestickChart.class),
//          @XmlElement(name = "meterChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = MeterChart.class),
//          @XmlElement(name = "thermometerChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ThermometerChart.class),
//          @XmlElement(name = "multiAxisChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = MultiAxisChart.class),
//          @XmlElement(name = "stackedAreaChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = StackedAreaChart.class),
//          @XmlElement(name = "ganttChart", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = GanttChart.class),
//          @XmlElement(name = "elementGroup", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ElementGroup.class),
//          @XmlElement(name = "crosstab", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Crosstab.class),
//          @XmlElement(name = "frame", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Frame.class),
//          @XmlElement(name = "componentElement", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ComponentElement.class),
//          @XmlElement(name = "genericElement", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = GenericElement.class)
//  })
//  public List<Object> breakOrLineOrRectangle;

  //   // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
//  public List<ExpressionReturnValue> returnValue = new ArrayList<>();

  @BindXml(xmlType = XmlType.ATTRIBUTE) //
  @BindAdapter(adapter = CollapsedStringAdapter.class)
  public String height = "0";

  @BindXml(xmlType = XmlType.ATTRIBUTE) //
  public String isSplitAllowed;

  @BindXml(xmlType = XmlType.ATTRIBUTE) //
  public String splitType;
}
