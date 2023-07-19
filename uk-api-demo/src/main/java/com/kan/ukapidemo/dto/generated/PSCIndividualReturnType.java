
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
 * <p>Java class for PSCIndividualReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSCIndividualReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PersonReturnType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceAddress" type="{http://xmlgw.companieshouse.gov.uk}ServiceAddressType"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Nationality"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CountryOfResidence"/&gt;
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
@XmlType(name = "PSCIndividualReturnType", propOrder = {
    "serviceAddress",
    "dob",
    "nationality",
    "countryOfResidence",
    "residentialAddress"
})
public class PSCIndividualReturnType
    extends PersonReturnType
{

    @XmlElement(name = "ServiceAddress", required = true)
    protected ServiceAddressType serviceAddress;
    @XmlElement(name = "DOB", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dob;
    @XmlElement(name = "Nationality", required = true)
    protected String nationality;
    @XmlElement(name = "CountryOfResidence", required = true)
    protected String countryOfResidence;
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
