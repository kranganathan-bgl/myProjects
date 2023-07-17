
package com.kan.ukapidemo.dto.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A Company Secretary Appointment 
 * 
 * <p>Java class for IncorporationSecretaryAppointmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncorporationSecretaryAppointmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Person"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PersonBaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ServiceAddress" type="{http://xmlgw.companieshouse.gov.uk}ServiceAddressType"/&gt;
 *                   &lt;element name="PreviousNames" type="{http://xmlgw.companieshouse.gov.uk}PreviousNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "IncorporationSecretaryAppointmentType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "person",
    "corporate"
})
public class IncorporationSecretaryAppointmentType {

    @XmlElement(name = "Person", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected IncorporationSecretaryAppointmentType.Person person;
    @XmlElement(name = "Corporate", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected IncorporationCorporateOfficerAppointmentType corporate;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link IncorporationSecretaryAppointmentType.Person }
     *     
     */
    public IncorporationSecretaryAppointmentType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncorporationSecretaryAppointmentType.Person }
     *     
     */
    public void setPerson(IncorporationSecretaryAppointmentType.Person value) {
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
     *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PersonBaseType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ServiceAddress" type="{http://xmlgw.companieshouse.gov.uk}ServiceAddressType"/&gt;
     *         &lt;element name="PreviousNames" type="{http://xmlgw.companieshouse.gov.uk}PreviousNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "serviceAddress",
        "previousNames"
    })
    public static class Person
        extends PersonBaseType
    {

        @XmlElement(name = "ServiceAddress", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected ServiceAddressType serviceAddress;
        @XmlElement(name = "PreviousNames", namespace = "http://xmlgw.companieshouse.gov.uk")
        protected List<PreviousNameType> previousNames;

        /**
         * Gets the value of the serviceAddress property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceAddressType }
         *     
         */
        public ServiceAddressType getServiceAddress() {
            return serviceAddress;
        }

        /**
         * Sets the value of the serviceAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceAddressType }
         *     
         */
        public void setServiceAddress(ServiceAddressType value) {
            this.serviceAddress = value;
        }

        /**
         * Gets the value of the previousNames property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the previousNames property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreviousNames().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PreviousNameType }
         * 
         * 
         */
        public List<PreviousNameType> getPreviousNames() {
            if (previousNames == null) {
                previousNames = new ArrayList<PreviousNameType>();
            }
            return this.previousNames;
        }

    }

}
