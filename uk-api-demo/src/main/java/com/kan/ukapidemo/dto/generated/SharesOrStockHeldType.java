
package com.kan.ukapidemo.dto.generated;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharesOrStockHeldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharesOrStockHeldType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SharesHeld"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://xmlgw.companieshouse.gov.uk}SharesType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}AmountPaidUp"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StockHeld"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="StockClass"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyString"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AmountHeld"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                         &lt;minExclusive value="0"/&gt;
 *                         &lt;maxInclusive value="999999999999999.999999"/&gt;
 *                         &lt;fractionDigits value="6"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Currency" type="{http://xmlgw.companieshouse.gov.uk}iso3currency" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharesOrStockHeldType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "sharesHeld",
    "stockHeld"
})
public class SharesOrStockHeldType {

    @XmlElement(name = "SharesHeld", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected SharesOrStockHeldType.SharesHeld sharesHeld;
    @XmlElement(name = "StockHeld", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected SharesOrStockHeldType.StockHeld stockHeld;

    /**
     * Gets the value of the sharesHeld property.
     * 
     * @return
     *     possible object is
     *     {@link SharesOrStockHeldType.SharesHeld }
     *     
     */
    public SharesOrStockHeldType.SharesHeld getSharesHeld() {
        return sharesHeld;
    }

    /**
     * Sets the value of the sharesHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharesOrStockHeldType.SharesHeld }
     *     
     */
    public void setSharesHeld(SharesOrStockHeldType.SharesHeld value) {
        this.sharesHeld = value;
    }

    /**
     * Gets the value of the stockHeld property.
     * 
     * @return
     *     possible object is
     *     {@link SharesOrStockHeldType.StockHeld }
     *     
     */
    public SharesOrStockHeldType.StockHeld getStockHeld() {
        return stockHeld;
    }

    /**
     * Sets the value of the stockHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharesOrStockHeldType.StockHeld }
     *     
     */
    public void setStockHeld(SharesOrStockHeldType.StockHeld value) {
        this.stockHeld = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}SharesType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}AmountPaidUp"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "amountPaidUp"
    })
    public static class SharesHeld
        extends SharesType
    {

        @XmlElement(name = "AmountPaidUp", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected BigDecimal amountPaidUp;

        /**
         * GBP only
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountPaidUp() {
            return amountPaidUp;
        }

        /**
         * Sets the value of the amountPaidUp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmountPaidUp(BigDecimal value) {
            this.amountPaidUp = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="StockClass"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyString"&gt;
     *               &lt;maxLength value="50"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AmountHeld"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *               &lt;minExclusive value="0"/&gt;
     *               &lt;maxInclusive value="999999999999999.999999"/&gt;
     *               &lt;fractionDigits value="6"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Currency" type="{http://xmlgw.companieshouse.gov.uk}iso3currency" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stockClass",
        "amountHeld",
        "currency"
    })
    public static class StockHeld {

        @XmlElement(name = "StockClass", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected String stockClass;
        @XmlElement(name = "AmountHeld", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected BigDecimal amountHeld;
        @XmlElement(name = "Currency", namespace = "http://xmlgw.companieshouse.gov.uk")
        protected String currency;

        /**
         * Gets the value of the stockClass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStockClass() {
            return stockClass;
        }

        /**
         * Sets the value of the stockClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStockClass(String value) {
            this.stockClass = value;
        }

        /**
         * Gets the value of the amountHeld property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountHeld() {
            return amountHeld;
        }

        /**
         * Sets the value of the amountHeld property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmountHeld(BigDecimal value) {
            this.amountHeld = value;
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

}
