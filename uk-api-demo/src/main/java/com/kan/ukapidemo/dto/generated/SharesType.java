
package com.kan.ukapidemo.dto.generated;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}NumShares"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ShareClass"/&gt;
 *         &lt;element name="ShareReference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyString"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharesType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "numShares",
    "shareClass",
    "shareReference"
})
@XmlSeeAlso({
    com.kan.ukapidemo.dto.generated.SharesOrStockHeldType.SharesHeld.class
})
public class SharesType {

    @XmlElement(name = "NumShares", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected BigDecimal numShares;
    @XmlElement(name = "ShareClass", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String shareClass;
    @XmlElement(name = "ShareReference", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String shareReference;

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
     * Gets the value of the shareReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareReference() {
        return shareReference;
    }

    /**
     * Sets the value of the shareReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareReference(String value) {
        this.shareReference = value;
    }

}
