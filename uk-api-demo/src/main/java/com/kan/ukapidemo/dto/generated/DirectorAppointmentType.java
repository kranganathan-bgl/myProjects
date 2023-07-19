
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A Company Director Appointment 
 * 
 * <p>Java class for DirectorAppointmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectorAppointmentType"&gt;
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
 *         &lt;element name="Corporate" type="{http://xmlgw.companieshouse.gov.uk}CorporateOfficerAppointmentType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectorAppointmentType", propOrder = {
    "person",
    "corporate"
})
public class DirectorAppointmentType {

    @XmlElement(name = "Person")
    protected DirectorAppointmentType.Person person;
    @XmlElement(name = "Corporate")
    protected CorporateOfficerAppointmentType corporate;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorAppointmentType.Person }
     *     
     */
    public DirectorAppointmentType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorAppointmentType.Person }
     *     
     */
    public void setPerson(DirectorAppointmentType.Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateOfficerAppointmentType }
     *     
     */
    public CorporateOfficerAppointmentType getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateOfficerAppointmentType }
     *     
     */
    public void setCorporate(CorporateOfficerAppointmentType value) {
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

        @XmlElement(name = "ResidentialAddress", required = true)
        protected DirectorAppointmentType.Person.ResidentialAddress residentialAddress;

        /**
         * Gets the value of the residentialAddress property.
         * 
         * @return
         *     possible object is
         *     {@link DirectorAppointmentType.Person.ResidentialAddress }
         *     
         */
        public DirectorAppointmentType.Person.ResidentialAddress getResidentialAddress() {
            return residentialAddress;
        }

        /**
         * Sets the value of the residentialAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link DirectorAppointmentType.Person.ResidentialAddress }
         *     
         */
        public void setResidentialAddress(DirectorAppointmentType.Person.ResidentialAddress value) {
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
