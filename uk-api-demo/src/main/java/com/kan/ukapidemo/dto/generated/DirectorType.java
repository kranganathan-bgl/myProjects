
package com.kan.ukapidemo.dto.generated;

import java.time.LocalDate;
import com.kan.ukapidemo.adapters.LocalDateXmlAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A Company Director
 * 
 * <p>Java class for DirectorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/&gt;
 *           &lt;element name="Person"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PersonBaseType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/&gt;
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Nationality"/&gt;
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Occupation"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "DirectorType", propOrder = {
    "corporateName",
    "person",
    "address"
})
public class DirectorType {

    @XmlElement(name = "CorporateName")
    protected String corporateName;
    @XmlElement(name = "Person")
    protected DirectorType.Person person;
    @XmlElement(name = "Address", required = true)
    protected DirectorAddressType address;

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
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorType.Person }
     *     
     */
    public DirectorType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorType.Person }
     *     
     */
    public void setPerson(DirectorType.Person value) {
        this.person = value;
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
     *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PersonBaseType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/&gt;
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Nationality"/&gt;
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Occupation"/&gt;
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
        "occupation"
    })
    public static class Person
        extends PersonBaseType
    {

        @XmlElement(name = "DOB", required = true, type = String.class)
        @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
        @XmlSchemaType(name = "date")
        protected LocalDate dob;
        @XmlElement(name = "Nationality", required = true)
        protected String nationality;
        @XmlElement(name = "Occupation", required = true)
        protected String occupation;

        /**
         * Gets the value of the dob property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDate getDOB() {
            return dob;
        }

        /**
         * Sets the value of the dob property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOB(LocalDate value) {
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

    }

}
