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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}seriesExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}categoryExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}labelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}itemHyperlink" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
//// @XmlAccessorType(XmlAccessType.FIELD)
//
// @XmlRootElement(name = "categorySeries", namespace = "http://jasperreports.sourceforge.net/jasperreports")
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.BindXml;
import com.abubusoft.kripton.xml.XmlType;

@BindType
public class  CategorySeries {

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public SeriesExpression seriesExpression;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public CategoryExpression categoryExpression;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public ValueExpression valueExpression;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public LabelExpression labelExpression;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public ItemHyperlink itemHyperlink;

    /**
     * Gets the value of the seriesExpression property.
     *
     * @return possible object is
     * {@link SeriesExpression }
     */
    public SeriesExpression getSeriesExpression() {
        return seriesExpression;
    }

    /**
     * Sets the value of the seriesExpression property.
     *
     * @param value allowed object is
     *              {@link SeriesExpression }
     */
    public void setSeriesExpression(SeriesExpression value) {
        this.seriesExpression = value;
    }

    /**
     * Gets the value of the categoryExpression property.
     *
     * @return possible object is
     * {@link CategoryExpression }
     */
    public CategoryExpression getCategoryExpression() {
        return categoryExpression;
    }

    /**
     * Sets the value of the categoryExpression property.
     *
     * @param value allowed object is
     *              {@link CategoryExpression }
     */
    public void setCategoryExpression(CategoryExpression value) {
        this.categoryExpression = value;
    }

    /**
     * Gets the value of the valueExpression property.
     *
     * @return possible object is
     * {@link ValueExpression }
     */
    public ValueExpression getValueExpression() {
        return valueExpression;
    }

    /**
     * Sets the value of the valueExpression property.
     *
     * @param value allowed object is
     *              {@link ValueExpression }
     */
    public void setValueExpression(ValueExpression value) {
        this.valueExpression = value;
    }

    /**
     * Gets the value of the labelExpression property.
     *
     * @return possible object is
     * {@link LabelExpression }
     */
    public LabelExpression getLabelExpression() {
        return labelExpression;
    }

    /**
     * Sets the value of the labelExpression property.
     *
     * @param value allowed object is
     *              {@link LabelExpression }
     */
    public void setLabelExpression(LabelExpression value) {
        this.labelExpression = value;
    }

    /**
     * Gets the value of the itemHyperlink property.
     *
     * @return possible object is
     * {@link ItemHyperlink }
     */
    public ItemHyperlink getItemHyperlink() {
        return itemHyperlink;
    }

    /**
     * Sets the value of the itemHyperlink property.
     *
     * @param value allowed object is
     *              {@link ItemHyperlink }
     */
    public void setItemHyperlink(ItemHyperlink value) {
        this.itemHyperlink = value;
    }

}
