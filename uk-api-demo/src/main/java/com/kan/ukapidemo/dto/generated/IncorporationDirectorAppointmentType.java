
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A Company Director Appointment 
 * 
 * <p>Java class for IncorporationDirectorAppointmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncorporationDirectorAppointmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Person"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://xmlgw.companieshouse.gov.uk}DirectorPersonType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ResidentialAddress"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://xmlgw.companieshouse.gov.uk}ResidentialAddressType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Corporate" type="{http://xmlgw.companieshouse.gov.uk}IncorporationCorporateOfficerAppointmentType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncorporationDirectorAppointmentType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "person",
    "corporate"
})
public class IncorporationDirectorAppointmentType {

    @XmlElement(name = "Person", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected IncorporationDirectorAppointmentType.Person person;
    @XmlElement(name = "Corporate", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected IncorporationCorporateOfficerAppointmentType corporate;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link IncorporationDirectorAppointmentType.Person }
     *     
     */
    public IncorporationDirectorAppointmentType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncorporationDirectorAppointmentType.Person }
     *     
     */
    public void setPerson(IncorporationDirectorAppointmentType.Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link IncorporationCorporateOfficerAppointmentType }
     *     
     */
    public IncorporationCorporateOfficerAppointmentType getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncorporationCorporateOfficerAppointmentType }
     *     
     */
    public void setCorporate(IncorporationCorporateOfficerAppointmentType value) {
        this.corporate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}DirectorPersonType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ResidentialAddress"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://xmlgw.companieshouse.gov.uk}ResidentialAddressType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "residentialAddress"
    })
    public static class Person
        extends DirectorPersonType
    {

        @XmlElement(name = "ResidentialAddress", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected IncorporationDirectorAppointmentType.Person.ResidentialAddress residentialAddress;

        /**
         * Gets the value of the residentialAddress property.
         * 
         * @return
         *     possible object is
         *     {@link IncorporationDirectorAppointmentType.Person.ResidentialAddress }
         *     
         */
        public IncorporationDirectorAppointmentType.Person.ResidentialAddress getResidentialAddress() {
            return residentialAddress;
        }

        /**
         * Sets the value of the residentialAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncorporationDirectorAppointmentType.Person.ResidentialAddress }
         *     
         */
        public void setResidentialAddress(IncorporationDirectorAppointmentType.Person.ResidentialAddress value) {
            this.residentialAddress = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}ResidentialAddressType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ResidentialAddress
            extends ResidentialAddressType
        {


        }

    }

}
