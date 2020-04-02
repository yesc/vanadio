//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.04.02 alle 10:15:55 PM CEST 
//


package net.digistar.vanadio.core.jasper;

import javax.xml.bind.annotation.*;


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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}font" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}titleExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="position"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Top"/&gt;
 *             &lt;enumeration value="Bottom"/&gt;
 *             &lt;enumeration value="Left"/&gt;
 *             &lt;enumeration value="Right"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "font",
        "titleExpression"
})
@XmlRootElement(name = "chartTitle", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class ChartTitle {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Font font;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected TitleExpression titleExpression;
    @XmlAttribute(name = "position")
    protected String position;
    @XmlAttribute(name = "color")
    protected String color;

    /**
     * Recupera il valore della proprietà font.
     *
     * @return possible object is
     * {@link Font }
     */
    public Font getFont() {
        return font;
    }

    /**
     * Imposta il valore della proprietà font.
     *
     * @param value allowed object is
     *              {@link Font }
     */
    public void setFont(Font value) {
        this.font = value;
    }

    /**
     * Recupera il valore della proprietà titleExpression.
     *
     * @return possible object is
     * {@link TitleExpression }
     */
    public TitleExpression getTitleExpression() {
        return titleExpression;
    }

    /**
     * Imposta il valore della proprietà titleExpression.
     *
     * @param value allowed object is
     *              {@link TitleExpression }
     */
    public void setTitleExpression(TitleExpression value) {
        this.titleExpression = value;
    }

    /**
     * Recupera il valore della proprietà position.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPosition() {
        return position;
    }

    /**
     * Imposta il valore della proprietà position.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Recupera il valore della proprietà color.
     *
     * @return possible object is
     * {@link String }
     */
    public String getColor() {
        return color;
    }

    /**
     * Imposta il valore della proprietà color.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setColor(String value) {
        this.color = value;
    }

}
