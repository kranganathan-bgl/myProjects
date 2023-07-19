
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A Company Data Director
 * 
 * <p>Java class for CompanyDataDirectorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyDataDirectorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Person"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://xmlgw.companieshouse.gov.uk}DirectorPersonReturnType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ResidentialAddress" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://xmlgw.companieshouse.gov.uk}CompanyDataResidentialAddressType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Corporate" type="{http://xmlgw.companieshouse.gov.uk}CorporateOfficerType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyDataDirectorType", propOrder = {
    "person",
    "corporate"
})
@XmlSeeAlso({
    com.kan.ukapidemo.dto.generated.CompanyData.Officers.Director.class
})
public class CompanyDataDirectorType {

    @XmlElement(name = "Person")
    protected CompanyDataDirectorType.Person person;
    @XmlElement(name = "Corporate")
    protected CorporateOfficerType corporate;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyDataDirectorType.Person }
     *     
     */
    public CompanyDataDirectorType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyDataDirectorType.Person }
     *     
     */
    public void setPerson(CompanyDataDirectorType.Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateOfficerType }
     *     
     */
    public CorporateOfficerType getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateOfficerType }
     *     
     */
    public void setCorporate(CorporateOfficerType value) {
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
     *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}DirectorPersonReturnType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ResidentialAddress" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://xmlgw.companieshouse.gov.uk}CompanyDataResidentialAddressType"&gt;
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
        extends DirectorPersonReturnType
    {

        @XmlElement(name = "ResidentialAddress")
        protected CompanyDataDirectorType.Person.ResidentialAddress residentialAddress;

        /**
         * Gets the value of the residentialAddress property.
         * 
         * @return
         *     possible object is
         *     {@link CompanyDataDirectorType.Person.ResidentialAddress }
         *     
         */
        public CompanyDataDirectorType.Person.ResidentialAddress getResidentialAddress() {
            return residentialAddress;
        }

        /**
         * Sets the value of the residentialAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyDataDirectorType.Person.ResidentialAddress }
         *     
         */
        public void setResidentialAddress(CompanyDataDirectorType.Person.ResidentialAddress value) {
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
         *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}CompanyDataResidentialAddressType"&gt;
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
            extends CompanyDataResidentialAddressType
        {


        }

    }

}
