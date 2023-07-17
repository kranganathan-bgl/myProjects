
package com.kan.ukapidemo.dto.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A Company Data LLP Member
 * 
 * <p>Java class for CompanyDataMemberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyDataMemberType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Person"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PersonReturnType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="ServiceAddress" type="{http://xmlgw.companieshouse.gov.uk}ServiceAddressType"/&gt;
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/&gt;
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CountryOfResidence"/&gt;
 *                     &lt;element name="ResidentialAddress" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://xmlgw.companieshouse.gov.uk}CompanyDataResidentialAddressType"&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Corporate" type="{http://xmlgw.companieshouse.gov.uk}CorporateOfficerType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="DesignatedInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyDataMemberType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "person",
    "corporate",
    "designatedInd"
})
public class CompanyDataMemberType {

    @XmlElement(name = "Person", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected CompanyDataMemberType.Person person;
    @XmlElement(name = "Corporate", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected CorporateOfficerType corporate;
    @XmlElement(name = "DesignatedInd", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected boolean designatedInd;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyDataMemberType.Person }
     *     
     */
    public CompanyDataMemberType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyDataMemberType.Person }
     *     
     */
    public void setPerson(CompanyDataMemberType.Person value) {
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
     * Gets the value of the designatedInd property.
     * 
     */
    public boolean isDesignatedInd() {
        return designatedInd;
    }

    /**
     * Sets the value of the designatedInd property.
     * 
     */
    public void setDesignatedInd(boolean value) {
        this.designatedInd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PersonReturnType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ServiceAddress" type="{http://xmlgw.companieshouse.gov.uk}ServiceAddressType"/&gt;
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/&gt;
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CountryOfResidence"/&gt;
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
        "serviceAddress",
        "dob",
        "countryOfResidence",
        "residentialAddress"
    })
    public static class Person
        extends PersonReturnType
    {

        @XmlElement(name = "ServiceAddress", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected ServiceAddressType serviceAddress;
        @XmlElement(name = "DOB", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dob;
        @XmlElement(name = "CountryOfResidence", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected String countryOfResidence;
        @XmlElement(name = "ResidentialAddress", namespace = "http://xmlgw.companieshouse.gov.uk")
        protected CompanyDataMemberType.Person.ResidentialAddress residentialAddress;

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
         * Gets the value of the countryOfResidence property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryOfResidence() {
            return countryOfResidence;
        }

        /**
         * Sets the value of the countryOfResidence property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryOfResidence(String value) {
            this.countryOfResidence = value;
        }

        /**
         * Gets the value of the residentialAddress property.
         * 
         * @return
         *     possible object is
         *     {@link CompanyDataMemberType.Person.ResidentialAddress }
         *     
         */
        public CompanyDataMemberType.Person.ResidentialAddress getResidentialAddress() {
            return residentialAddress;
        }

        /**
         * Sets the value of the residentialAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyDataMemberType.Person.ResidentialAddress }
         *     
         */
        public void setResidentialAddress(CompanyDataMemberType.Person.ResidentialAddress value) {
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
