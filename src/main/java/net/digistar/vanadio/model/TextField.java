//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

// import javax.xml.bind.annotation.*;

import com.abubusoft.kripton.annotation.BindAdapter;
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.BindXml;
import com.abubusoft.kripton.xml.XmlType;
import net.digistar.vanadio.support.CollapsedStringAdapter;

import java.util.List;

// import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}reportElement"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}box" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}textElement" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}textFieldExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}patternExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}anchorNameExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkReferenceExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkWhenExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkAnchorExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkPageExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkTooltipExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isStretchWithOverflow"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="textAdjust"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="CutText"/&gt;
 *             &lt;enumeration value="StretchHeight"/&gt;
 *             &lt;enumeration value="ScaleFont"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="evaluationTime" type="{http://jasperreports.sourceforge.net/jasperreports}complexEvaluationTime" default="Now" /&gt;
 *       &lt;attribute name="evaluationGroup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isBlankWhenNull"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="hyperlinkType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="hyperlinkTarget" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="bookmarkLevel" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
// @XmlAccessorType(XmlAccessType.FIELD)
// @XmlRootElement(name = "textField", namespace = "http://jasperreports.sourceforge.net/jasperreports")

/**
 * CHECKED
 */
@BindType
public class TextField {

  // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
  public ReportElement reportElement;

  // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
  public Box box;

  // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
  public TextElement textElement;

  // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
  public TextFieldExpression textFieldExpression;

  //TODO converted ojbect -> string
  // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
  public String patternExpression;

  // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
  public AnchorNameExpression anchorNameExpression;

  // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
  public HyperlinkReferenceExpression hyperlinkReferenceExpression;

  // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
  public HyperlinkWhenExpression hyperlinkWhenExpression;

  // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
  public HyperlinkAnchorExpression hyperlinkAnchorExpression;

  // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
  public HyperlinkPageExpression hyperlinkPageExpression;

  // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
  public HyperlinkTooltipExpression hyperlinkTooltipExpression;

  // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
  public List<HyperlinkParameter> hyperlinkParameter;

  @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "isStretchWithOverflow")
  public String isStretchWithOverflow;

  @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "textAdjust")
  public String textAdjust;

  @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "evaluationTime")
  public ComplexEvaluationTime evaluationTime = ComplexEvaluationTime.NOW;

  @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "evaluationGroup")
  public String evaluationGroup;

  @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "pattern")
  public String pattern;

  @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "isBlankWhenNull")
  public String isBlankWhenNull;

  @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "hyperlinkType")
  public String hyperlinkType;

  @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "hyperlinkTarget")
  public String hyperlinkTarget;

  @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "bookmarkLevel")
  @BindAdapter(adapter = CollapsedStringAdapter.class)
  // // @XmlSchemaType(name = "NMTOKEN")
  public String bookmarkLevel = "0";


}
