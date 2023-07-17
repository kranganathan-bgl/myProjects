
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="UK"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}RegistrationNumber"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NonUK"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}PlaceRegistered" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}RegistrationNumber" minOccurs="0"/&gt;
 *                   &lt;element name="LawGoverned"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyNameAddressString"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LegalForm"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyOtherDataString"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                         &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "", propOrder = {
    "uk",
    "nonUK"
})
@XmlRootElement(name = "CompanyIdentification", namespace = "http://xmlgw.companieshouse.gov.uk")
public class CompanyIdentification {

    @XmlElement(name = "UK", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected CompanyIdentification.UK uk;
    @XmlElement(name = "NonUK", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected CompanyIdentification.NonUK nonUK;

    /**
     * Gets the value of the uk property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentification.UK }
     *     
     */
    public CompanyIdentification.UK getUK() {
        return uk;
    }

    /**
     * Sets the value of the uk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentification.UK }
     *     
     */
    public void setUK(CompanyIdentification.UK value) {
        this.uk = value;
    }

    /**
     * Gets the value of the nonUK property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentification.NonUK }
     *     
     */
    public CompanyIdentification.NonUK getNonUK() {
        return nonUK;
    }

    /**
     * Sets the value of the nonUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentification.NonUK }
     *     
     */
    public void setNonUK(CompanyIdentification.NonUK value) {
        this.nonUK = value;
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
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}PlaceRegistered" minOccurs="0"/&gt;
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}RegistrationNumber" minOccurs="0"/&gt;
     *         &lt;element name="LawGoverned"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyNameAddressString"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="50"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LegalForm"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyOtherDataString"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="50"/&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
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
    @XmlType(name = "", propOrder = {
        "placeRegistered",
        "registrationNumber",
        "lawGoverned",
        "legalForm"
    })
    public static class NonUK {

        @XmlElement(name = "PlaceRegistered", namespace = "http://xmlgw.companieshouse.gov.uk")
        protected String placeRegistered;
        @XmlElement(name = "RegistrationNumber", namespace = "http://xmlgw.companieshouse.gov.uk")
        protected String registrationNumber;
        @XmlElement(name = "LawGoverned", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected String lawGoverned;
        @XmlElement(name = "LegalForm", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected String legalForm;

        /**
         * Gets the value of the placeRegistered property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaceRegistered() {
            return placeRegistered;
        }

        /**
         * Sets the value of the placeRegistered property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaceRegistered(String value) {
            this.placeRegistered = value;
        }

        /**
         * Gets the value of the registrationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationNumber() {
            return registrationNumber;
        }

        /**
         * Sets the value of the registrationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationNumber(String value) {
            this.registrationNumber = value;
        }

        /**
         * Gets the value of the lawGoverned property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLawGoverned() {
            return lawGoverned;
        }

        /**
         * Sets the value of the lawGoverned property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLawGoverned(String value) {
            this.lawGoverned = value;
        }

        /**
         * Gets the value of the legalForm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLegalForm() {
            return legalForm;
        }

        /**
         * Sets the value of the legalForm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLegalForm(String value) {
            this.legalForm = value;
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
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}RegistrationNumber"/&gt;
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
        "registrationNumber"
    })
    public static class UK {

        @XmlElement(name = "RegistrationNumber", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected String registrationNumber;

        /**
         * Gets the value of the registrationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationNumber() {
            return registrationNumber;
        }

        /**
         * Sets the value of the registrationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationNumber(String value) {
            this.registrationNumber = value;
        }

    }

}
