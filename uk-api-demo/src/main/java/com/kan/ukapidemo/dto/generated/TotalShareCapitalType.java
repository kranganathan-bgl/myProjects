
package com.kan.ukapidemo.dto.generated;

import com.kan.ukapidemo.adapters.LongXmlAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TotalShareCapitalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalShareCapitalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalNumberShareIssued" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TotalAggregateNominalValue" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Currency"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalShareCapitalType", propOrder = {
    "totalNumberShareIssued",
    "totalAggregateNominalValue",
    "currency"
})
public class TotalShareCapitalType {

    @XmlElement(name = "TotalNumberShareIssued", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long totalNumberShareIssued;
    @XmlElement(name = "TotalAggregateNominalValue", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long totalAggregateNominalValue;
    @XmlElement(name = "Currency", required = true)
    protected String currency;

    /**
     * Gets the value of the totalNumberShareIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTotalNumberShareIssued() {
        return totalNumberShareIssued;
    }

    /**
     * Sets the value of the totalNumberShareIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNumberShareIssued(Long value) {
        this.totalNumberShareIssued = value;
    }

    /**
     * Gets the value of the totalAggregateNominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTotalAggregateNominalValue() {
        return totalAggregateNominalValue;
    }

    /**
     * Sets the value of the totalAggregateNominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAggregateNominalValue(Long value) {
        this.totalAggregateNominalValue = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
