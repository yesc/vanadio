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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pen" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}topPen" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}leftPen" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bottomPen" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rightPen" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="border"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="borderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="padding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="topBorder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="topBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="topPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="leftBorder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="leftBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="leftPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="bottomBorder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="bottomBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="bottomPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="rightBorder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="rightBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rightPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pen",
        "topPen",
        "leftPen",
        "bottomPen",
        "rightPen"
})
@XmlRootElement(name = "box", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class Box {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Pen pen;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected TopPen topPen;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected LeftPen leftPen;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected BottomPen bottomPen;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected RightPen rightPen;
    @XmlAttribute(name = "border")
    protected String border;
    @XmlAttribute(name = "borderColor")
    protected String borderColor;
    @XmlAttribute(name = "padding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String padding;
    @XmlAttribute(name = "topBorder")
    protected String topBorder;
    @XmlAttribute(name = "topBorderColor")
    protected String topBorderColor;
    @XmlAttribute(name = "topPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String topPadding;
    @XmlAttribute(name = "leftBorder")
    protected String leftBorder;
    @XmlAttribute(name = "leftBorderColor")
    protected String leftBorderColor;
    @XmlAttribute(name = "leftPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String leftPadding;
    @XmlAttribute(name = "bottomBorder")
    protected String bottomBorder;
    @XmlAttribute(name = "bottomBorderColor")
    protected String bottomBorderColor;
    @XmlAttribute(name = "bottomPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String bottomPadding;
    @XmlAttribute(name = "rightBorder")
    protected String rightBorder;
    @XmlAttribute(name = "rightBorderColor")
    protected String rightBorderColor;
    @XmlAttribute(name = "rightPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String rightPadding;

    /**
     * Recupera il valore della proprietà pen.
     *
     * @return possible object is
     * {@link Pen }
     */
    public Pen getPen() {
        return pen;
    }

    /**
     * Imposta il valore della proprietà pen.
     *
     * @param value allowed object is
     *              {@link Pen }
     */
    public void setPen(Pen value) {
        this.pen = value;
    }

    /**
     * Recupera il valore della proprietà topPen.
     *
     * @return possible object is
     * {@link TopPen }
     */
    public TopPen getTopPen() {
        return topPen;
    }

    /**
     * Imposta il valore della proprietà topPen.
     *
     * @param value allowed object is
     *              {@link TopPen }
     */
    public void setTopPen(TopPen value) {
        this.topPen = value;
    }

    /**
     * Recupera il valore della proprietà leftPen.
     *
     * @return possible object is
     * {@link LeftPen }
     */
    public LeftPen getLeftPen() {
        return leftPen;
    }

    /**
     * Imposta il valore della proprietà leftPen.
     *
     * @param value allowed object is
     *              {@link LeftPen }
     */
    public void setLeftPen(LeftPen value) {
        this.leftPen = value;
    }

    /**
     * Recupera il valore della proprietà bottomPen.
     *
     * @return possible object is
     * {@link BottomPen }
     */
    public BottomPen getBottomPen() {
        return bottomPen;
    }

    /**
     * Imposta il valore della proprietà bottomPen.
     *
     * @param value allowed object is
     *              {@link BottomPen }
     */
    public void setBottomPen(BottomPen value) {
        this.bottomPen = value;
    }

    /**
     * Recupera il valore della proprietà rightPen.
     *
     * @return possible object is
     * {@link RightPen }
     */
    public RightPen getRightPen() {
        return rightPen;
    }

    /**
     * Imposta il valore della proprietà rightPen.
     *
     * @param value allowed object is
     *              {@link RightPen }
     */
    public void setRightPen(RightPen value) {
        this.rightPen = value;
    }

    /**
     * Recupera il valore della proprietà border.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBorder() {
        return border;
    }

    /**
     * Imposta il valore della proprietà border.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBorder(String value) {
        this.border = value;
    }

    /**
     * Recupera il valore della proprietà borderColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * Imposta il valore della proprietà borderColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBorderColor(String value) {
        this.borderColor = value;
    }

    /**
     * Recupera il valore della proprietà padding.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPadding() {
        return padding;
    }

    /**
     * Imposta il valore della proprietà padding.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPadding(String value) {
        this.padding = value;
    }

    /**
     * Recupera il valore della proprietà topBorder.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTopBorder() {
        return topBorder;
    }

    /**
     * Imposta il valore della proprietà topBorder.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTopBorder(String value) {
        this.topBorder = value;
    }

    /**
     * Recupera il valore della proprietà topBorderColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTopBorderColor() {
        return topBorderColor;
    }

    /**
     * Imposta il valore della proprietà topBorderColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTopBorderColor(String value) {
        this.topBorderColor = value;
    }

    /**
     * Recupera il valore della proprietà topPadding.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTopPadding() {
        return topPadding;
    }

    /**
     * Imposta il valore della proprietà topPadding.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTopPadding(String value) {
        this.topPadding = value;
    }

    /**
     * Recupera il valore della proprietà leftBorder.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLeftBorder() {
        return leftBorder;
    }

    /**
     * Imposta il valore della proprietà leftBorder.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLeftBorder(String value) {
        this.leftBorder = value;
    }

    /**
     * Recupera il valore della proprietà leftBorderColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLeftBorderColor() {
        return leftBorderColor;
    }

    /**
     * Imposta il valore della proprietà leftBorderColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLeftBorderColor(String value) {
        this.leftBorderColor = value;
    }

    /**
     * Recupera il valore della proprietà leftPadding.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLeftPadding() {
        return leftPadding;
    }

    /**
     * Imposta il valore della proprietà leftPadding.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLeftPadding(String value) {
        this.leftPadding = value;
    }

    /**
     * Recupera il valore della proprietà bottomBorder.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBottomBorder() {
        return bottomBorder;
    }

    /**
     * Imposta il valore della proprietà bottomBorder.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBottomBorder(String value) {
        this.bottomBorder = value;
    }

    /**
     * Recupera il valore della proprietà bottomBorderColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBottomBorderColor() {
        return bottomBorderColor;
    }

    /**
     * Imposta il valore della proprietà bottomBorderColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBottomBorderColor(String value) {
        this.bottomBorderColor = value;
    }

    /**
     * Recupera il valore della proprietà bottomPadding.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBottomPadding() {
        return bottomPadding;
    }

    /**
     * Imposta il valore della proprietà bottomPadding.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBottomPadding(String value) {
        this.bottomPadding = value;
    }

    /**
     * Recupera il valore della proprietà rightBorder.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRightBorder() {
        return rightBorder;
    }

    /**
     * Imposta il valore della proprietà rightBorder.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRightBorder(String value) {
        this.rightBorder = value;
    }

    /**
     * Recupera il valore della proprietà rightBorderColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRightBorderColor() {
        return rightBorderColor;
    }

    /**
     * Imposta il valore della proprietà rightBorderColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRightBorderColor(String value) {
        this.rightBorderColor = value;
    }

    /**
     * Recupera il valore della proprietà rightPadding.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRightPadding() {
        return rightPadding;
    }

    /**
     * Imposta il valore della proprietà rightPadding.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRightPadding(String value) {
        this.rightPadding = value;
    }

}
