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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}band" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "band"
})
@XmlRootElement(name = "pageFooter", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class PageFooter {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Band band;

    /**
     * Recupera il valore della proprietà band.
     *
     * @return possible object is
     * {@link Band }
     */
    public Band getBand() {
        return band;
    }

    /**
     * Imposta il valore della proprietà band.
     *
     * @param value allowed object is
     *              {@link Band }
     */
    public void setBand(Band value) {
        this.band = value;
    }

}