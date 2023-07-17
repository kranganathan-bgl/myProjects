
package com.kan.ukapidemo.dto.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A Company Director Appointment 
 * 
 * <p>Java class for DirectorIncorporationAppointmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectorIncorporationAppointmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://xmlgw.companieshouse.gov.uk}DirectorAddressType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Person"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PersonBaseType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/&gt;
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Nationality"/&gt;
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Occupation"/&gt;
 *                     &lt;element name="PreviousName" type="{http://xmlgw.companieshouse.gov.uk}PreviousNameType" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Corporate"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://xmlgw.companieshouse.gov.uk}NameType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectorIncorporationAppointmentType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "address",
    "person",
    "corporate"
})
public class DirectorIncorporationAppointmentType {

    @XmlElement(name = "Address", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected DirectorIncorporationAppointmentType.Address address;
    @XmlElement(name = "Person", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected DirectorIncorporationAppointmentType.Person person;
    @XmlElement(name = "Corporate", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected DirectorIncorporationAppointmentType.Corporate corporate;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorIncorporationAppointmentType.Address }
     *     
     */
    public DirectorIncorporationAppointmentType.Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorIncorporationAppointmentType.Address }
     *     
     */
    public void setAddress(DirectorIncorporationAppointmentType.Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorIncorporationAppointmentType.Person }
     *     
     */
    public DirectorIncorporationAppointmentType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorIncorporationAppointmentType.Person }
     *     
     */
    public void setPerson(DirectorIncorporationAppointmentType.Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorIncorporationAppointmentType.Corporate }
     *     
     */
    public DirectorIncorporationAppointmentType.Corporate getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorIncorporationAppointmentType.Corporate }
     *     
     */
    public void setCorporate(DirectorIncorporationAppointmentType.Corporate value) {
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
     *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}DirectorAddressType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address
        extends DirectorAddressType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}NameType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/&gt;
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
        "corporateName"
    })
    public static class Corporate
        extends NameType
    {

        @XmlElement(name = "CorporateName", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected String corporateName;

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
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/&gt;
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Nationality"/&gt;
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Occupation"/&gt;
     *         &lt;element name="PreviousName" type="{http://xmlgw.companieshouse.gov.uk}PreviousNameType" minOccurs="0"/&gt;
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
        "dob",
        "nationality",
        "occupation",
        "previousName"
    })
    public static class Person
        extends PersonBaseType
    {

        @XmlElement(name = "DOB", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dob;
        @XmlElement(name = "Nationality", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected String nationality;
        @XmlElement(name = "Occupation", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected String occupation;
        @XmlElement(name = "PreviousName", namespace = "http://xmlgw.companieshouse.gov.uk")
        protected PreviousNameType previousName;

        /**
         * Gets the value of the dob property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDOB() {
            return dob;
        }

        /**
         * Sets the value of the dob property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDOB(XMLGregorianCalendar value) {
            this.dob = value;
        }

        /**
         * Gets the value of the nationality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNationality() {
            return nationality;
        }

        /**
         * Sets the value of the nationality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNationality(String value) {
            this.nationality = value;
        }

        /**
         * Gets the value of the occupation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOccupation() {
            return occupation;
        }

        /**
         * Sets the value of the occupation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOccupation(String value) {
            this.occupation = value;
        }

        /**
         * Gets the value of the previousName property.
         * 
         * @return
         *     possible object is
         *     {@link PreviousNameType }
         *     
         */
        public PreviousNameType getPreviousName() {
            return previousName;
        }

        /**
         * Sets the value of the previousName property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreviousNameType }
         *     
         */
        public void setPreviousName(PreviousNameType value) {
            this.previousName = value;
        }

    }

}
