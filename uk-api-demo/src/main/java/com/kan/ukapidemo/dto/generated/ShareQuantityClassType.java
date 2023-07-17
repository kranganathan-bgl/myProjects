
package com.kan.ukapidemo.dto.generated;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareQuantityClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareQuantityClassType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ShareClass"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}NumShares"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareQuantityClassType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "shareClass",
    "numShares"
})
@XmlSeeAlso({
    IssuedShareType.class
})
public class ShareQuantityClassType {

    @XmlElement(name = "ShareClass", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String shareClass;
    @XmlElement(name = "NumShares", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected BigDecimal numShares;

    /**
     * Gets the value of the shareClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareClass() {
        return shareClass;
    }

    /**
     * Sets the value of the shareClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareClass(String value) {
        this.shareClass = value;
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
