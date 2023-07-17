
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Premise"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Street" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Thoroughfare" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}PostTown"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}County" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Country"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                 &lt;enumeration value="USA"/&gt;
 *                 &lt;enumeration value="IRL"/&gt;
 *                 &lt;enumeration value="DEU"/&gt;
 *                 &lt;enumeration value="FRA"/&gt;
 *                 &lt;enumeration value="ITA"/&gt;
 *                 &lt;enumeration value="ESP"/&gt;
 *                 &lt;enumeration value="PRT"/&gt;
 *                 &lt;enumeration value="NLD"/&gt;
 *                 &lt;enumeration value="POL"/&gt;
 *                 &lt;enumeration value="BEL"/&gt;
 *                 &lt;enumeration value="NOR"/&gt;
 *                 &lt;enumeration value="SWE"/&gt;
 *                 &lt;enumeration value="DNK"/&gt;
 *                 &lt;enumeration value="AUS"/&gt;
 *                 &lt;enumeration value="NZL"/&gt;
 *                 &lt;enumeration value="CAN"/&gt;
 *                 &lt;enumeration value="ZAF"/&gt;
 *                 &lt;enumeration value="AUT"/&gt;
 *                 &lt;enumeration value="HRV"/&gt;
 *                 &lt;enumeration value="CYP"/&gt;
 *                 &lt;enumeration value="CZE"/&gt;
 *                 &lt;enumeration value="EST"/&gt;
 *                 &lt;enumeration value="HUN"/&gt;
 *                 &lt;enumeration value="GRC"/&gt;
 *                 &lt;enumeration value="LTU"/&gt;
 *                 &lt;enumeration value="GBR"/&gt;
 *                 &lt;enumeration value="GB-ENG"/&gt;
 *                 &lt;enumeration value="GB-WLS"/&gt;
 *                 &lt;enumeration value="GB-SCT"/&gt;
 *                 &lt;enumeration value="GB-NIR"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="OtherForeignCountry"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nameAddressString"&gt;
 *                 &lt;maxLength value="50"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Postcode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressBaseType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "premise",
    "street",
    "thoroughfare",
    "postTown",
    "county",
    "country",
    "otherForeignCountry",
    "postcode"
})
@XmlSeeAlso({
    CompanyAddressType.class,
    ShareholderAddressType.class,
    PSCCompanyAddressType.class
})
public class AddressBaseType {

    @XmlElement(name = "Premise", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String premise;
    @XmlElement(name = "Street", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String street;
    @XmlElement(name = "Thoroughfare", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String thoroughfare;
    @XmlElement(name = "PostTown", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String postTown;
    @XmlElement(name = "County", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String county;
    @XmlElement(name = "Country", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String country;
    @XmlElement(name = "OtherForeignCountry", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String otherForeignCountry;
    @XmlElement(name = "Postcode", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String postcode;

    /**
     * Gets the value of the premise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremise() {
        return premise;
    }

    /**
     * Sets the value of the premise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremise(String value) {
        this.premise = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the thoroughfare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThoroughfare() {
        return thoroughfare;
    }

    /**
     * Sets the value of the thoroughfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThoroughfare(String value) {
        this.thoroughfare = value;
    }

    /**
     * Gets the value of the postTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostTown() {
        return postTown;
    }

    /**
     * Sets the value of the postTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostTown(String value) {
        this.postTown = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the otherForeignCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherForeignCountry() {
        return otherForeignCountry;
    }

    /**
     * Sets the value of the otherForeignCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherForeignCountry(String value) {
        this.otherForeignCountry = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

}
