
package com.kan.ukapidemo.dto.generated;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.kan.ukapidemo.adapters.LocalDateXmlAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DirectorPersonReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectorPersonReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PersonReturnType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceAddress" type="{http://xmlgw.companieshouse.gov.uk}ServiceAddressType"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Nationality"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Occupation"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CountryOfResidence" minOccurs="0"/&gt;
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
@XmlType(name = "DirectorPersonReturnType", propOrder = {
    "serviceAddress",
    "dob",
    "nationality",
    "occupation",
    "countryOfResidence",
    "previousNames"
})
@XmlSeeAlso({
    com.kan.ukapidemo.dto.generated.CompanyDataDirectorType.Person.class
})
public class DirectorPersonReturnType
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
    @XmlElement(name = "Occupation", required = true)
    protected String occupation;
    @XmlElement(name = "CountryOfResidence")
    protected String countryOfResidence;
    @XmlElement(name = "PreviousNames")
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

}
