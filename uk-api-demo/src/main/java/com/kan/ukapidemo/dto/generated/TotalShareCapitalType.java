
package com.kan.ukapidemo.dto.generated;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


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
@XmlType(name = "TotalShareCapitalType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "totalNumberShareIssued",
    "totalAggregateNominalValue",
    "currency"
})
public class TotalShareCapitalType {

    @XmlElement(name = "TotalNumberShareIssued", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected BigInteger totalNumberShareIssued;
    @XmlElement(name = "TotalAggregateNominalValue", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected BigInteger totalAggregateNominalValue;
    @XmlElement(name = "Currency", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String currency;

    /**
     * Gets the value of the totalNumberShareIssued property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberShareIssued() {
        return totalNumberShareIssued;
    }

    /**
     * Sets the value of the totalNumberShareIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberShareIssued(BigInteger value) {
        this.totalNumberShareIssued = value;
    }

    /**
     * Gets the value of the totalAggregateNominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalAggregateNominalValue() {
        return totalAggregateNominalValue;
    }

    /**
     * Sets the value of the totalAggregateNominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalAggregateNominalValue(BigInteger value) {
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
