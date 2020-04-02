//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package jasper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}groupExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}groupHeader" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}groupFooter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isStartNewColumn" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isStartNewPage" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isResetPageNumber" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isReprintHeaderOnEachPage" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isReprintHeaderOnEachColumn" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="minHeightToStartNewPage" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" /&gt;
 *       &lt;attribute name="minDetailsToStartFromTop" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" /&gt;
 *       &lt;attribute name="footerPosition" default="Normal"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Normal"/&gt;
 *             &lt;enumeration value="StackAtBottom"/&gt;
 *             &lt;enumeration value="ForceAtBottom"/&gt;
 *             &lt;enumeration value="CollateAtBottom"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="keepTogether" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="preventOrphanFooter" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
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
    "groupExpression",
    "groupHeader",
    "groupFooter"
})
@XmlRootElement(name = "group", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class Group {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected GroupExpression groupExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected GroupHeader groupHeader;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected GroupFooter groupFooter;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "isStartNewColumn")
    protected String isStartNewColumn;
    @XmlAttribute(name = "isStartNewPage")
    protected String isStartNewPage;
    @XmlAttribute(name = "isResetPageNumber")
    protected String isResetPageNumber;
    @XmlAttribute(name = "isReprintHeaderOnEachPage")
    protected String isReprintHeaderOnEachPage;
    @XmlAttribute(name = "isReprintHeaderOnEachColumn")
    protected String isReprintHeaderOnEachColumn;
    @XmlAttribute(name = "minHeightToStartNewPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String minHeightToStartNewPage;
    @XmlAttribute(name = "minDetailsToStartFromTop")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String minDetailsToStartFromTop;
    @XmlAttribute(name = "footerPosition")
    protected String footerPosition;
    @XmlAttribute(name = "keepTogether")
    protected String keepTogether;
    @XmlAttribute(name = "preventOrphanFooter")
    protected String preventOrphanFooter;

    /**
     * Gets the value of the groupExpression property.
     * 
     * @return
     *     possible object is
     *     {@link GroupExpression }
     *     
     */
    public GroupExpression getGroupExpression() {
        return groupExpression;
    }

    /**
     * Sets the value of the groupExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupExpression }
     *     
     */
    public void setGroupExpression(GroupExpression value) {
        this.groupExpression = value;
    }

    /**
     * Gets the value of the groupHeader property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader }
     *     
     */
    public GroupHeader getGroupHeader() {
        return groupHeader;
    }

    /**
     * Sets the value of the groupHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader }
     *     
     */
    public void setGroupHeader(GroupHeader value) {
        this.groupHeader = value;
    }

    /**
     * Gets the value of the groupFooter property.
     * 
     * @return
     *     possible object is
     *     {@link GroupFooter }
     *     
     */
    public GroupFooter getGroupFooter() {
        return groupFooter;
    }

    /**
     * Sets the value of the groupFooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupFooter }
     *     
     */
    public void setGroupFooter(GroupFooter value) {
        this.groupFooter = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the isStartNewColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStartNewColumn() {
        if (isStartNewColumn == null) {
            return "false";
        } else {
            return isStartNewColumn;
        }
    }

    /**
     * Sets the value of the isStartNewColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStartNewColumn(String value) {
        this.isStartNewColumn = value;
    }

    /**
     * Gets the value of the isStartNewPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStartNewPage() {
        if (isStartNewPage == null) {
            return "false";
        } else {
            return isStartNewPage;
        }
    }

    /**
     * Sets the value of the isStartNewPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStartNewPage(String value) {
        this.isStartNewPage = value;
    }

    /**
     * Gets the value of the isResetPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsResetPageNumber() {
        if (isResetPageNumber == null) {
            return "false";
        } else {
            return isResetPageNumber;
        }
    }

    /**
     * Sets the value of the isResetPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsResetPageNumber(String value) {
        this.isResetPageNumber = value;
    }

    /**
     * Gets the value of the isReprintHeaderOnEachPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsReprintHeaderOnEachPage() {
        if (isReprintHeaderOnEachPage == null) {
            return "false";
        } else {
            return isReprintHeaderOnEachPage;
        }
    }

    /**
     * Sets the value of the isReprintHeaderOnEachPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsReprintHeaderOnEachPage(String value) {
        this.isReprintHeaderOnEachPage = value;
    }

    /**
     * Gets the value of the isReprintHeaderOnEachColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsReprintHeaderOnEachColumn() {
        if (isReprintHeaderOnEachColumn == null) {
            return "false";
        } else {
            return isReprintHeaderOnEachColumn;
        }
    }

    /**
     * Sets the value of the isReprintHeaderOnEachColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsReprintHeaderOnEachColumn(String value) {
        this.isReprintHeaderOnEachColumn = value;
    }

    /**
     * Gets the value of the minHeightToStartNewPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinHeightToStartNewPage() {
        if (minHeightToStartNewPage == null) {
            return "0";
        } else {
            return minHeightToStartNewPage;
        }
    }

    /**
     * Sets the value of the minHeightToStartNewPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinHeightToStartNewPage(String value) {
        this.minHeightToStartNewPage = value;
    }

    /**
     * Gets the value of the minDetailsToStartFromTop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinDetailsToStartFromTop() {
        if (minDetailsToStartFromTop == null) {
            return "0";
        } else {
            return minDetailsToStartFromTop;
        }
    }

    /**
     * Sets the value of the minDetailsToStartFromTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDetailsToStartFromTop(String value) {
        this.minDetailsToStartFromTop = value;
    }

    /**
     * Gets the value of the footerPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooterPosition() {
        if (footerPosition == null) {
            return "Normal";
        } else {
            return footerPosition;
        }
    }

    /**
     * Sets the value of the footerPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooterPosition(String value) {
        this.footerPosition = value;
    }

    /**
     * Gets the value of the keepTogether property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepTogether() {
        if (keepTogether == null) {
            return "false";
        } else {
            return keepTogether;
        }
    }

    /**
     * Sets the value of the keepTogether property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepTogether(String value) {
        this.keepTogether = value;
    }

    /**
     * Gets the value of the preventOrphanFooter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreventOrphanFooter() {
        if (preventOrphanFooter == null) {
            return "false";
        } else {
            return preventOrphanFooter;
        }
    }

    /**
     * Sets the value of the preventOrphanFooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreventOrphanFooter(String value) {
        this.preventOrphanFooter = value;
    }

}
