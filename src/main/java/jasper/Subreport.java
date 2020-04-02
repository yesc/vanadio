//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package jasper;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}reportElement"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}parametersMapExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subreportParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}connectionExpression"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataSourceExpression"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}returnValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subreportExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isUsingCache"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="runToBottom"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="overflowType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Stretch"/&gt;
 *             &lt;enumeration value="NoStretch"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reportElement",
    "parametersMapExpression",
    "subreportParameter",
    "connectionExpression",
    "dataSourceExpression",
    "returnValue",
    "subreportExpression"
})
@XmlRootElement(name = "subreport", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class Subreport {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected ReportElement reportElement;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ParametersMapExpression parametersMapExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<SubreportParameter> subreportParameter;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ConnectionExpression connectionExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected DataSourceExpression dataSourceExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<ReturnValue> returnValue;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected SubreportExpression subreportExpression;
    @XmlAttribute(name = "isUsingCache")
    protected String isUsingCache;
    @XmlAttribute(name = "runToBottom")
    protected String runToBottom;
    @XmlAttribute(name = "overflowType")
    protected String overflowType;

    /**
     * Gets the value of the reportElement property.
     * 
     * @return
     *     possible object is
     *     {@link ReportElement }
     *     
     */
    public ReportElement getReportElement() {
        return reportElement;
    }

    /**
     * Sets the value of the reportElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportElement }
     *     
     */
    public void setReportElement(ReportElement value) {
        this.reportElement = value;
    }

    /**
     * Gets the value of the parametersMapExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ParametersMapExpression }
     *     
     */
    public ParametersMapExpression getParametersMapExpression() {
        return parametersMapExpression;
    }

    /**
     * Sets the value of the parametersMapExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersMapExpression }
     *     
     */
    public void setParametersMapExpression(ParametersMapExpression value) {
        this.parametersMapExpression = value;
    }

    /**
     * Gets the value of the subreportParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subreportParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubreportParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubreportParameter }
     * 
     * 
     */
    public List<SubreportParameter> getSubreportParameter() {
        if (subreportParameter == null) {
            subreportParameter = new ArrayList<SubreportParameter>();
        }
        return this.subreportParameter;
    }

    /**
     * Gets the value of the connectionExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionExpression }
     *     
     */
    public ConnectionExpression getConnectionExpression() {
        return connectionExpression;
    }

    /**
     * Sets the value of the connectionExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionExpression }
     *     
     */
    public void setConnectionExpression(ConnectionExpression value) {
        this.connectionExpression = value;
    }

    /**
     * Gets the value of the dataSourceExpression property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceExpression }
     *     
     */
    public DataSourceExpression getDataSourceExpression() {
        return dataSourceExpression;
    }

    /**
     * Sets the value of the dataSourceExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceExpression }
     *     
     */
    public void setDataSourceExpression(DataSourceExpression value) {
        this.dataSourceExpression = value;
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
     * {@link ReturnValue }
     * 
     * 
     */
    public List<ReturnValue> getReturnValue() {
        if (returnValue == null) {
            returnValue = new ArrayList<ReturnValue>();
        }
        return this.returnValue;
    }

    /**
     * Gets the value of the subreportExpression property.
     * 
     * @return
     *     possible object is
     *     {@link SubreportExpression }
     *     
     */
    public SubreportExpression getSubreportExpression() {
        return subreportExpression;
    }

    /**
     * Sets the value of the subreportExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubreportExpression }
     *     
     */
    public void setSubreportExpression(SubreportExpression value) {
        this.subreportExpression = value;
    }

    /**
     * Gets the value of the isUsingCache property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUsingCache() {
        return isUsingCache;
    }

    /**
     * Sets the value of the isUsingCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUsingCache(String value) {
        this.isUsingCache = value;
    }

    /**
     * Gets the value of the runToBottom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunToBottom() {
        return runToBottom;
    }

    /**
     * Sets the value of the runToBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunToBottom(String value) {
        this.runToBottom = value;
    }

    /**
     * Gets the value of the overflowType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverflowType() {
        return overflowType;
    }

    /**
     * Sets the value of the overflowType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverflowType(String value) {
        this.overflowType = value;
    }

}
