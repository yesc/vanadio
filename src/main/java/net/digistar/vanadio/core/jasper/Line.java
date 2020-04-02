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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}reportElement"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}graphicElement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="direction" default="TopDown"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="TopDown"/&gt;
 *             &lt;enumeration value="BottomUp"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "reportElement",
        "graphicElement"
})
@XmlRootElement(name = "line", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class Line {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected ReportElement reportElement;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected GraphicElement graphicElement;
    @XmlAttribute(name = "direction")
    protected String direction;

    /**
     * Recupera il valore della proprietà reportElement.
     *
     * @return possible object is
     * {@link ReportElement }
     */
    public ReportElement getReportElement() {
        return reportElement;
    }

    /**
     * Imposta il valore della proprietà reportElement.
     *
     * @param value allowed object is
     *              {@link ReportElement }
     */
    public void setReportElement(ReportElement value) {
        this.reportElement = value;
    }

    /**
     * Recupera il valore della proprietà graphicElement.
     *
     * @return possible object is
     * {@link GraphicElement }
     */
    public GraphicElement getGraphicElement() {
        return graphicElement;
    }

    /**
     * Imposta il valore della proprietà graphicElement.
     *
     * @param value allowed object is
     *              {@link GraphicElement }
     */
    public void setGraphicElement(GraphicElement value) {
        this.graphicElement = value;
    }

    /**
     * Recupera il valore della proprietà direction.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDirection() {
        if (direction == null) {
            return "TopDown";
        } else {
            return direction;
        }
    }

    /**
     * Imposta il valore della proprietà direction.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDirection(String value) {
        this.direction = value;
    }

}
