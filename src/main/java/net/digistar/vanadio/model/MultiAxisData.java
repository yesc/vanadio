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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}multiAxisDataset"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataAxis" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}multiAxisMeasure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
// @XmlAccessorType(XmlAccessType.FIELD)

// @XmlRootElement(name = "multiAxisData", namespace = "http://jasperreports.sourceforge.net/jasperreports")
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.BindXml;
import com.abubusoft.kripton.xml.XmlType;

@BindType
public class  MultiAxisData {

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    public MultiAxisDataset multiAxisDataset;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    public List<DataAxis> dataAxis;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    public List<MultiAxisMeasure> multiAxisMeasure;

    /**
     * Gets the value of the multiAxisDataset property.
     *
     * @return possible object is
     * {@link MultiAxisDataset }
     */
    public MultiAxisDataset getMultiAxisDataset() {
        return multiAxisDataset;
    }

    /**
     * Sets the value of the multiAxisDataset property.
     *
     * @param value allowed object is
     *              {@link MultiAxisDataset }
     */
    public void setMultiAxisDataset(MultiAxisDataset value) {
        this.multiAxisDataset = value;
    }

    /**
     * Gets the value of the dataAxis property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataAxis property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataAxis().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataAxis }
     */
    public List<DataAxis> getDataAxis() {
        if (dataAxis == null) {
            dataAxis = new ArrayList<DataAxis>();
        }
        return this.dataAxis;
    }

    /**
     * Gets the value of the multiAxisMeasure property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiAxisMeasure property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiAxisMeasure().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiAxisMeasure }
     */
    public List<MultiAxisMeasure> getMultiAxisMeasure() {
        if (multiAxisMeasure == null) {
            multiAxisMeasure = new ArrayList<MultiAxisMeasure>();
        }
        return this.multiAxisMeasure;
    }

}
