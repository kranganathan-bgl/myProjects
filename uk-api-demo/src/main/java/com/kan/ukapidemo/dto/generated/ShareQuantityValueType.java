
package com.kan.ukapidemo.dto.generated;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareQuantityValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareQuantityValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}NumShares"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Currency"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ShareValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareQuantityValueType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "numShares",
    "currency",
    "shareValue"
})
public class ShareQuantityValueType {

    @XmlElement(name = "NumShares", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected BigDecimal numShares;
    @XmlElement(name = "Currency", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String currency;
    @XmlElement(name = "ShareValue", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected BigDecimal shareValue;

    /**
     * Gets the value of the numShares property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumShares() {
        return numShares;
    }

    /**
     * Sets the value of the numShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumShares(BigDecimal value) {
        this.numShares = value;
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

    /**
     * Gets the value of the shareValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShareValue() {
        return shareValue;
    }

    /**
     * Sets the value of the shareValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShareValue(BigDecimal value) {
        this.shareValue = value;
    }

}
