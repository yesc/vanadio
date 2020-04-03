//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

import javax.xml.bind.annotation.*;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataset" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xySeries" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "dataset",
        "xySeries"
})
@XmlRootElement(name = "xyDataset", namespace = "http://jasperreports.sourceforge.net/jasperreports")
//@BindType
public class XyDataset {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Dataset dataset;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<XySeries> xySeries;

    /**
     * Gets the value of the dataset property.
     *
     * @return possible object is
     * {@link Dataset }
     */
    public Dataset getDataset() {
        return dataset;
    }

    /**
     * Sets the value of the dataset property.
     *
     * @param value allowed object is
     *              {@link Dataset }
     */
    public void setDataset(Dataset value) {
        this.dataset = value;
    }

    /**
     * Gets the value of the xySeries property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xySeries property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXySeries().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XySeries }
     */
    public List<XySeries> getXySeries() {
        if (xySeries == null) {
            xySeries = new ArrayList<XySeries>();
        }
        return this.xySeries;
    }

}
