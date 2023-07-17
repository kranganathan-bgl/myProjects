
package com.kan.ukapidemo.dto.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PSCIndividualType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSCIndividualType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Title" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Forename" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}OtherForenames" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Surname"/&gt;
 *         &lt;element name="ServiceAddress" type="{http://xmlgw.companieshouse.gov.uk}ServiceAddressType"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Nationality"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CountryOfResidence"/&gt;
 *         &lt;element name="ResidentialAddress" type="{http://xmlgw.companieshouse.gov.uk}ResidentialAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSCIndividualType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "title",
    "forename",
    "otherForenames",
    "surname",
    "serviceAddress",
    "dob",
    "nationality",
    "countryOfResidence",
    "residentialAddress"
})
@XmlSeeAlso({
    com.kan.ukapidemo.dto.generated.IncorporationPSCNotificationType.Individual.class
})
public class PSCIndividualType {

    @XmlElement(name = "Title", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String title;
    @XmlElement(name = "Forename", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String forename;
    @XmlElement(name = "OtherForenames", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String otherForenames;
    @XmlElement(name = "Surname", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String surname;
    @XmlElement(name = "ServiceAddress", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected ServiceAddressType serviceAddress;
    @XmlElement(name = "DOB", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    @XmlElement(name = "Nationality", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String nationality;
    @XmlElement(name = "CountryOfResidence", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String countryOfResidence;
    @XmlElement(name = "ResidentialAddress", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected ResidentialAddressType residentialAddress;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the forename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForename() {
        return forename;
    }

    /**
     * Sets the value of the forename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForename(String value) {
        this.forename = value;
    }

    /**
     * More than one name can be entered separated by spaces
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherForenames() {
        return otherForenames;
    }

    /**
     * Sets the value of the otherForenames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherForenames(String value) {
        this.otherForenames = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

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
