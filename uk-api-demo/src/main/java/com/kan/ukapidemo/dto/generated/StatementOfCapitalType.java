
package com.kan.ukapidemo.dto.generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementOfCapitalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementOfCapitalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Capital" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}TotalAmountUnpaid"/&gt;
 *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}TotalNumberOfIssuedShares"/&gt;
 *                   &lt;element name="ShareCurrency" type="{http://xmlgw.companieshouse.gov.uk}iso3currency"/&gt;
 *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}TotalAggregateNominalValue"/&gt;
 *                   &lt;element name="Shares" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ShareClass"/&gt;
 *                             &lt;element ref="{http://xmlgw.companieshouse.gov.uk}PrescribedParticulars"/&gt;
 *                             &lt;element ref="{http://xmlgw.companieshouse.gov.uk}NumShares"/&gt;
 *                             &lt;element ref="{http://xmlgw.companieshouse.gov.uk}AggregateNominalValue"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "StatementOfCapitalType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "capital"
})
public class StatementOfCapitalType {

    @XmlElement(name = "Capital", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected List<StatementOfCapitalType.Capital> capital;

    /**
     * Gets the value of the capital property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the capital property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapital().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementOfCapitalType.Capital }
     * 
     * 
     */
    public List<StatementOfCapitalType.Capital> getCapital() {
        if (capital == null) {
            capital = new ArrayList<StatementOfCapitalType.Capital>();
        }
        return this.capital;
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
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}TotalAmountUnpaid"/&gt;
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}TotalNumberOfIssuedShares"/&gt;
     *         &lt;element name="ShareCurrency" type="{http://xmlgw.companieshouse.gov.uk}iso3currency"/&gt;
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}TotalAggregateNominalValue"/&gt;
     *         &lt;element name="Shares" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ShareClass"/&gt;
     *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}PrescribedParticulars"/&gt;
     *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}NumShares"/&gt;
     *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}AggregateNominalValue"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "totalAmountUnpaid",
        "totalNumberOfIssuedShares",
        "shareCurrency",
        "totalAggregateNominalValue",
        "shares"
    })
    public static class Capital {

        @XmlElement(name = "TotalAmountUnpaid", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected BigDecimal totalAmountUnpaid;
        @XmlElement(name = "TotalNumberOfIssuedShares", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected BigDecimal totalNumberOfIssuedShares;
        @XmlElement(name = "ShareCurrency", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected String shareCurrency;
        @XmlElement(name = "TotalAggregateNominalValue", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected BigDecimal totalAggregateNominalValue;
        @XmlElement(name = "Shares", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected List<StatementOfCapitalType.Capital.Shares> shares;

        /**
         * Gets the value of the totalAmountUnpaid property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalAmountUnpaid() {
            return totalAmountUnpaid;
        }

        /**
         * Sets the value of the totalAmountUnpaid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalAmountUnpaid(BigDecimal value) {
            this.totalAmountUnpaid = value;
        }

        /**
         * Gets the value of the totalNumberOfIssuedShares property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalNumberOfIssuedShares() {
            return totalNumberOfIssuedShares;
        }

        /**
         * Sets the value of the totalNumberOfIssuedShares property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalNumberOfIssuedShares(BigDecimal value) {
            this.totalNumberOfIssuedShares = value;
        }

        /**
         * Gets the value of the shareCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareCurrency() {
            return shareCurrency;
        }

        /**
         * Sets the value of the shareCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareCurrency(String value) {
            this.shareCurrency = value;
        }

        /**
         * Gets the value of the totalAggregateNominalValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalAggregateNominalValue() {
            return totalAggregateNominalValue;
        }

        /**
         * Sets the value of the totalAggregateNominalValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalAggregateNominalValue(BigDecimal value) {
            this.totalAggregateNominalValue = value;
        }

        /**
         * Gets the value of the shares property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the shares property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShares().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatementOfCapitalType.Capital.Shares }
         * 
         * 
         */
        public List<StatementOfCapitalType.Capital.Shares> getShares() {
            if (shares == null) {
                shares = new ArrayList<StatementOfCapitalType.Capital.Shares>();
            }
            return this.shares;
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
         *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ShareClass"/&gt;
         *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}PrescribedParticulars"/&gt;
         *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}NumShares"/&gt;
         *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}AggregateNominalValue"/&gt;
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
            "shareClass",
            "prescribedParticulars",
            "numShares",
            "aggregateNominalValue"
        })
        public static class Shares {

            @XmlElement(name = "ShareClass", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
            protected String shareClass;
            @XmlElement(name = "PrescribedParticulars", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
            protected String prescribedParticulars;
            @XmlElement(name = "NumShares", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
            protected BigDecimal numShares;
            @XmlElement(name = "AggregateNominalValue", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
            protected BigDecimal aggregateNominalValue;

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
             * Gets the value of the prescribedParticulars property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrescribedParticulars() {
                return prescribedParticulars;
            }

            /**
             * Sets the value of the prescribedParticulars property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrescribedParticulars(String value) {
                this.prescribedParticulars = value;
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
             * Gets the value of the aggregateNominalValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAggregateNominalValue() {
                return aggregateNominalValue;
            }

            /**
             * Sets the value of the aggregateNominalValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAggregateNominalValue(BigDecimal value) {
                this.aggregateNominalValue = value;
            }

        }

    }

}
