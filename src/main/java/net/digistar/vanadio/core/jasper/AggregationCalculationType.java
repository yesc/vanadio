//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.04.02 alle 10:15:55 PM CEST 
//


package net.digistar.vanadio.core.jasper;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per aggregationCalculationType.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="aggregationCalculationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Nothing"/&gt;
 *     &lt;enumeration value="Count"/&gt;
 *     &lt;enumeration value="DistinctCount"/&gt;
 *     &lt;enumeration value="Sum"/&gt;
 *     &lt;enumeration value="Average"/&gt;
 *     &lt;enumeration value="Lowest"/&gt;
 *     &lt;enumeration value="Highest"/&gt;
 *     &lt;enumeration value="StandardDeviation"/&gt;
 *     &lt;enumeration value="Variance"/&gt;
 *     &lt;enumeration value="First"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "aggregationCalculationType", namespace = "http://jasperreports.sourceforge.net/jasperreports")
@XmlEnum
public enum AggregationCalculationType {


    /**
     * No calculations are performed.
     */
    @XmlEnumValue("Nothing")
    NOTHING("Nothing"),

    /**
     * The measure stores the number of the not null
     * values.
     */
    @XmlEnumValue("Count")
    COUNT("Count"),

    /**
     * The measure stores the number of distinct not null
     * values.
     */
    @XmlEnumValue("DistinctCount")
    DISTINCT_COUNT("DistinctCount"),

    /**
     * The measure stores the sum of the not null values.
     * Numeric measures only.
     */
    @XmlEnumValue("Sum")
    SUM("Sum"),

    /**
     * The measure stores the average of the not null
     * values. Numeric measures only.
     */
    @XmlEnumValue("Average")
    AVERAGE("Average"),

    /**
     * The measure stores the lowest value.
     */
    @XmlEnumValue("Lowest")
    LOWEST("Lowest"),

    /**
     * The measure stores the highest value.
     */
    @XmlEnumValue("Highest")
    HIGHEST("Highest"),

    /**
     * The measure stores the standard deviation of the not
     * null values. Numeric measures only.
     */
    @XmlEnumValue("StandardDeviation")
    STANDARD_DEVIATION("StandardDeviation"),

    /**
     * The measure stores the variance of the not null
     * values. Numeric measures only.
     */
    @XmlEnumValue("Variance")
    VARIANCE("Variance"),

    /**
     * The measure stores the first value encountered and
     * ignores subsequent values.
     */
    @XmlEnumValue("First")
    FIRST("First");
    private final String value;

    AggregationCalculationType(String v) {
        value = v;
    }

    public static AggregationCalculationType fromValue(String v) {
        for (AggregationCalculationType c : AggregationCalculationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
