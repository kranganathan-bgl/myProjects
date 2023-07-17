
package com.kan.ukapidemo.dto.generated;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllotmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllotmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ShareClass"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}NumShares"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}AmountPaidDuePerShare"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}AmountUnpaidPerShare"/&gt;
 *         &lt;element name="ShareCurrency" type="{http://xmlgw.companieshouse.gov.uk}current_iso3currency"/&gt;
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
@XmlType(name = "AllotmentType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "shareClass",
    "numShares",
    "amountPaidDuePerShare",
    "amountUnpaidPerShare",
    "shareCurrency",
    "shareValue"
})
public class AllotmentType {

    @XmlElement(name = "ShareClass", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String shareClass;
    @XmlElement(name = "NumShares", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected BigDecimal numShares;
    @XmlElement(name = "AmountPaidDuePerShare", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected BigDecimal amountPaidDuePerShare;
    @XmlElement(name = "AmountUnpaidPerShare", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected BigDecimal amountUnpaidPerShare;
    @XmlElement(name = "ShareCurrency", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    @XmlSchemaType(name = "string")
    protected CurrentIso3Currency shareCurrency;
    @XmlElement(name = "ShareValue", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected BigDecimal shareValue;

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

    /**
     * Gets the value of the amountPaidDuePerShare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountPaidDuePerShare() {
        return amountPaidDuePerShare;
    }

    /**
     * Sets the value of the amountPaidDuePerShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountPaidDuePerShare(BigDecimal value) {
        this.amountPaidDuePerShare = value;
    }

    /**
     * Gets the value of the amountUnpaidPerShare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountUnpaidPerShare() {
        return amountUnpaidPerShare;
    }

    /**
     * Sets the value of the amountUnpaidPerShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountUnpaidPerShare(BigDecimal value) {
        this.amountUnpaidPerShare = value;
    }

    /**
     * Gets the value of the shareCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentIso3Currency }
     *     
     */
    public CurrentIso3Currency getShareCurrency() {
        return shareCurrency;
    }

    /**
     * Sets the value of the shareCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentIso3Currency }
     *     
     */
    public void setShareCurrency(CurrentIso3Currency value) {
        this.shareCurrency = value;
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
