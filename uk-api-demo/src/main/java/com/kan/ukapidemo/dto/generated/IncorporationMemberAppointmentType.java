
package com.kan.ukapidemo.dto.generated;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.kan.ukapidemo.adapters.LocalDateXmlAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An LLP Member Type 
 * 
 * <p>Java class for IncorporationMemberAppointmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncorporationMemberAppointmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DesignatedInd"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Person"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PersonBaseType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="ServiceAddress" type="{http://xmlgw.companieshouse.gov.uk}ServiceAddressType"/&gt;
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/&gt;
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CountryOfResidence"/&gt;
 *                     &lt;element name="PreviousNames" type="{http://xmlgw.companieshouse.gov.uk}PreviousNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                     &lt;element name="ResidentialAddress" type="{http://xmlgw.companieshouse.gov.uk}ResidentialAddressType"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Corporate" type="{http://xmlgw.companieshouse.gov.uk}IncorporationCorporateOfficerAppointmentType"/&gt;
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
@XmlType(name = "IncorporationMemberAppointmentType", propOrder = {
    "designatedInd",
    "person",
    "corporate"
})
public class IncorporationMemberAppointmentType {

    @XmlElement(name = "DesignatedInd", required = true)
    protected String designatedInd;
    @XmlElement(name = "Person")
    protected IncorporationMemberAppointmentType.Person person;
    @XmlElement(name = "Corporate")
    protected IncorporationCorporateOfficerAppointmentType corporate;

    /**
     * Gets the value of the designatedInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignatedInd() {
        return designatedInd;
    }

    /**
     * Sets the value of the designatedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignatedInd(String value) {
        this.designatedInd = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link IncorporationMemberAppointmentType.Person }
     *     
     */
    public IncorporationMemberAppointmentType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncorporationMemberAppointmentType.Person }
     *     
     */
    public void setPerson(IncorporationMemberAppointmentType.Person value) {
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
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/&gt;
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CountryOfResidence"/&gt;
     *         &lt;element name="PreviousNames" type="{http://xmlgw.companieshouse.gov.uk}PreviousNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ResidentialAddress" type="{http://xmlgw.companieshouse.gov.uk}ResidentialAddressType"/&gt;
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
        "previousNames",
        "residentialAddress"
    })
    public static class Person
        extends PersonBaseType
    {

        @XmlElement(name = "ServiceAddress", required = true)
        protected ServiceAddressType serviceAddress;
        @XmlElement(name = "DOB", required = true, type = String.class)
        @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
        @XmlSchemaType(name = "date")
        protected LocalDate dob;
        @XmlElement(name = "CountryOfResidence", required = true)
        protected String countryOfResidence;
        @XmlElement(name = "PreviousNames")
        protected List<PreviousNameType> previousNames;
        @XmlElement(name = "ResidentialAddress", required = true)
        protected ResidentialAddressType residentialAddress;

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

        /**
         * Gets the value of the residentialAddress property.
         * 
         * @return
         *     possible object is
         *     {@link ResidentialAddressType }
         *     
         */
        public ResidentialAddressType getResidentialAddress() {
            return residentialAddress;
        }

        /**
         * Sets the value of the residentialAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResidentialAddressType }
         *     
         */
        public void setResidentialAddress(ResidentialAddressType value) {
            this.residentialAddress = value;
        }

    }

}
