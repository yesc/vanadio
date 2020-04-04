//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

// import javax.xml.bind.annotation.*;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bucketExpression" minOccurs="0"/&gt;
 *         &lt;element name="labelExpression" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}comparatorExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bucketProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" default="java.lang.String" /&gt;
 *       &lt;attribute name="order" default="Ascending"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Ascending"/&gt;
 *             &lt;enumeration value="Descending"/&gt;
 *             &lt;enumeration value="None"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
// @XmlAccessorType(XmlAccessType.FIELD)

// @XmlRootElement(name = "axisLevelBucket", namespace = "http://jasperreports.sourceforge.net/jasperreports")
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.BindXml;
import com.abubusoft.kripton.xml.XmlType;

@BindType
public class  AxisLevelBucket {

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public BucketExpression bucketExpression;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public AxisLevelBucketLabelExpression labelExpression;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public ComparatorExpression comparatorExpression;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public List<BucketProperty> bucketProperty;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "class")
    public String clazz;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "order")
    public String order;

    /**
     * Gets the value of the bucketExpression property.
     *
     * @return possible object is
     * {@link BucketExpression }
     */
    public BucketExpression getBucketExpression() {
        return bucketExpression;
    }

    /**
     * Sets the value of the bucketExpression property.
     *
     * @param value allowed object is
     *              {@link BucketExpression }
     */
    public void setBucketExpression(BucketExpression value) {
        this.bucketExpression = value;
    }

    /**
     * Gets the value of the labelExpression property.
     *
     * @return possible object is
     * {@link AxisLevelBucketLabelExpression }
     */
    public AxisLevelBucketLabelExpression getLabelExpression() {
        return labelExpression;
    }

    /**
     * Sets the value of the labelExpression property.
     *
     * @param value allowed object is
     *              {@link AxisLevelBucketLabelExpression }
     */
    public void setLabelExpression(AxisLevelBucketLabelExpression value) {
        this.labelExpression = value;
    }

    /**
     * Gets the value of the comparatorExpression property.
     *
     * @return possible object is
     * {@link ComparatorExpression }
     */
    public ComparatorExpression getComparatorExpression() {
        return comparatorExpression;
    }

    /**
     * Sets the value of the comparatorExpression property.
     *
     * @param value allowed object is
     *              {@link ComparatorExpression }
     */
    public void setComparatorExpression(ComparatorExpression value) {
        this.comparatorExpression = value;
    }

    /**
     * Gets the value of the bucketProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bucketProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBucketProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BucketProperty }
     */
    public List<BucketProperty> getBucketProperty() {
        if (bucketProperty == null) {
            bucketProperty = new ArrayList<BucketProperty>();
        }
        return this.bucketProperty;
    }

    /**
     * Gets the value of the clazz property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClazz() {
        if (clazz == null) {
            return "java.lang.String";
        } else {
            return clazz;
        }
    }

    /**
     * Sets the value of the clazz property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the order property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrder() {
        if (order == null) {
            return "Ascending";
        } else {
            return order;
        }
    }

    /**
     * Sets the value of the order property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrder(String value) {
        this.order = value;
    }


}
