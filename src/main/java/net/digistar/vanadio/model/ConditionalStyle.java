//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

// import javax.xml.bind.annotation.*;


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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}conditionExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}style"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
// @XmlAccessorType(XmlAccessType.FIELD)
//
// @XmlRootElement(name = "conditionalStyle", namespace = "http://jasperreports.sourceforge.net/jasperreports")
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.BindXml;
import com.abubusoft.kripton.xml.XmlType;

@BindType
public class  ConditionalStyle {

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public ConditionExpression conditionExpression;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    public Style style;

    /**
     * Gets the value of the conditionExpression property.
     *
     * @return possible object is
     * {@link ConditionExpression }
     */
    public ConditionExpression getConditionExpression() {
        return conditionExpression;
    }

    /**
     * Sets the value of the conditionExpression property.
     *
     * @param value allowed object is
     *              {@link ConditionExpression }
     */
    public void setConditionExpression(ConditionExpression value) {
        this.conditionExpression = value;
    }

    /**
     * Gets the value of the style property.
     *
     * @return possible object is
     * {@link Style }
     */
    public Style getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     *
     * @param value allowed object is
     *              {@link Style }
     */
    public void setStyle(Style value) {
        this.style = value;
    }

}
