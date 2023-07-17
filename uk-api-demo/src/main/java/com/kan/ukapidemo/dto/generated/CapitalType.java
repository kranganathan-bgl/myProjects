
package com.kan.ukapidemo.dto.generated;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapitalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapitalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalNominalValue"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="19"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Currency"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ShareValue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}NumShares" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapitalType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "totalNominalValue",
    "currency",
    "shareValue",
    "numShares"
})
public class CapitalType {

    @XmlElement(name = "TotalNominalValue", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected BigDecimal totalNominalValue;
    @XmlElement(name = "Currency", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String currency;
    @XmlElement(name = "ShareValue", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected BigDecimal shareValue;
    @XmlElement(name = "NumShares", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected BigDecimal numShares;

    /**
     * Gets the value of the totalNominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalNominalValue() {
        return totalNominalValue;
    }

    /**
     * Sets the value of the totalNominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalNominalValue(BigDecimal value) {
        this.totalNominalValue = value;
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

}
