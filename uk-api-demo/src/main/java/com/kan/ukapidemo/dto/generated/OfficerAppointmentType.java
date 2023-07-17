
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficerAppointmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfficerAppointmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Appointee"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="Individual"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Person" type="{http://xmlgw.companieshouse.gov.uk}PersonType"/&gt;
 *                             &lt;element name="PreviousName" type="{http://xmlgw.companieshouse.gov.uk}NameType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}DirectorAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficerAppointmentType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "appointee",
    "address"
})
public class OfficerAppointmentType {

    @XmlElement(name = "Appointee", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected OfficerAppointmentType.Appointee appointee;
    @XmlElement(name = "Address", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected DirectorAddressType address;

    /**
     * Gets the value of the appointee property.
     * 
     * @return
     *     possible object is
     *     {@link OfficerAppointmentType.Appointee }
     *     
     */
    public OfficerAppointmentType.Appointee getAppointee() {
        return appointee;
    }

    /**
     * Sets the value of the appointee property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficerAppointmentType.Appointee }
     *     
     */
    public void setAppointee(OfficerAppointmentType.Appointee value) {
        this.appointee = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorAddressType }
     *     
     */
    public DirectorAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorAddressType }
     *     
     */
    public void setAddress(DirectorAddressType value) {
        this.address = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="Individual"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Person" type="{http://xmlgw.companieshouse.gov.uk}PersonType"/&gt;
     *                   &lt;element name="PreviousName" type="{http://xmlgw.companieshouse.gov.uk}NameType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/&gt;
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
        "individual",
        "corporateName"
    })
    public static class Appointee {

        @XmlElement(name = "Individual", namespace = "http://xmlgw.companieshouse.gov.uk")
        protected OfficerAppointmentType.Appointee.Individual individual;
        @XmlElement(name = "CorporateName", namespace = "http://xmlgw.companieshouse.gov.uk")
        protected String corporateName;

        /**
         * Gets the value of the individual property.
         * 
         * @return
         *     possible object is
         *     {@link OfficerAppointmentType.Appointee.Individual }
         *     
         */
        public OfficerAppointmentType.Appointee.Individual getIndividual() {
            return individual;
        }

        /**
         * Sets the value of the individual property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfficerAppointmentType.Appointee.Individual }
         *     
         */
        public void setIndividual(OfficerAppointmentType.Appointee.Individual value) {
            this.individual = value;
        }

        /**
         * Gets the value of the corporateName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorporateName() {
            return corporateName;
        }

        /**
         * Sets the value of the corporateName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorporateName(String value) {
            this.corporateName = value;
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
         *         &lt;element name="Person" type="{http://xmlgw.companieshouse.gov.uk}PersonType"/&gt;
         *         &lt;element name="PreviousName" type="{http://xmlgw.companieshouse.gov.uk}NameType" minOccurs="0"/&gt;
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
            "person",
            "previousName"
        })
        public static class Individual {

            @XmlElement(name = "Person", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
            protected PersonType person;
            @XmlElement(name = "PreviousName", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected NameType previousName;

            /**
             * Gets the value of the person property.
             * 
             * @return
             *     possible object is
             *     {@link PersonType }
             *     
             */
            public PersonType getPerson() {
                return person;
            }

            /**
             * Sets the value of the person property.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonType }
             *     
             */
            public void setPerson(PersonType value) {
                this.person = value;
            }

            /**
             * Gets the value of the previousName property.
             * 
             * @return
             *     possible object is
             *     {@link NameType }
             *     
             */
            public NameType getPreviousName() {
                return previousName;
            }

            /**
             * Sets the value of the previousName property.
             * 
             * @param value
             *     allowed object is
             *     {@link NameType }
             *     
             */
            public void setPreviousName(NameType value) {
                this.previousName = value;
            }

        }

    }

}
